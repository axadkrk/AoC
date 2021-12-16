fun main() {

    val data =
        "0052E4A00905271049796FB8872A0D25B9FB746893847236200B4F0BCE5194401C9B9E3F9C63992C8931A65A1CCC0D222100511A00BCBA647D98BE29A397005E55064A9DFEEC86600BD002AF2343A91A1CCE773C26600D126B69D15A6793BFCE2775D9E4A9002AB86339B5F9AB411A15CCAF10055B3EFFC00BCCE730112FA6620076268CE5CDA1FCEB69005A3800D24F4DB66E53F074F811802729733E0040E5C5E5C5C8015F9613937B83F23B278724068018014A00588014005519801EC04B220116CC0402000EAEC03519801A402B30801A802138801400170A0046A800C10001AB37FD8EB805D1C266963E95A4D1A5FF9719FEF7FDB4FB2DB29008CD2BAFA3D005CD31EB4EF2EBE4F4235DF78C66009E80293AE9310D3FCBFBCA440144580273BAEE17E55B66508803C2E0087E630F72BCD5E71B32CCFBBE2800017A2C2803D272BCBCD12BD599BC874B939004B5400964AE84A6C1E7538004CD300623AC6C882600E4328F710CC01C82D1B228980292ECD600B48E0526E506F700760CCC468012E68402324F9668028200C41E8A30E00010D8B11E62F98029801AB88039116344340004323EC48873233E72A36402504CB75006EA00084C7B895198001098D91AE2190065933AA6EB41AD0042626A93135681A400804CB54C0318032200E47B8F71C0001098810D61D8002111B228468000E5269324AD1ECF7C519B86309F35A46200A1660A280150968A4CB45365A03F3DDBAE980233407E00A80021719A1B4181006E1547D87C6008E0043337EC434C32BDE487A4AE08800D34BC3DEA974F35C20100BE723F1197F59E662FDB45824AA1D2DDCDFA2D29EBB69005072E5F2EDF3C0B244F30E0600AE00203229D229B342CC007EC95F5D6E200202615D000FB92CE7A7A402354EE0DAC0141007E20C5E87A200F4318EB0C"
    Day16(data)
}


class StringTokenizer(val value: String) {
    private var index = 0
    val read: Int
        get() = index

    fun take(amount: Int): String {
        val s = value.substring(index, index + amount)
        index += amount

        return s
    }

    override fun toString(): String = value.substring(index)
}

class Day16(input: String) {

    init {
        var binary = ""
        input.map { it -> binary += convert(it) }
        val tree: Packet by lazy { parse(StringTokenizer(binary)) }

        println(tree.versionSum)
        println(tree.eval())
    }

    private fun convert(char: Char): String {
        when (char) {
            '0' -> return "0000"
            '1' -> return "0001"
            '2' -> return "0010"
            '3' -> return "0011"
            '4' -> return "0100"
            '5' -> return "0101"
            '6' -> return "0110"
            '7' -> return "0111"
            '8' -> return "1000"
            '9' -> return "1001"
            'A' -> return "1010"
            'B' -> return "1011"
            'C' -> return "1100"
            'D' -> return "1101"
            'E' -> return "1110"
            'F' -> return "1111"
        }
        return ""
    }


    private fun parse(tok: StringTokenizer, packet: Packet? = null): Packet {
        val version = tok.take(3).toInt(2)
        val type = tok.take(3).toInt(2).let { PacketType.values()[it] }
        var current = packet
        if (type == PacketType.LIT) {
            var number = ""
            do {
                val v = tok.take(5)
                number += v.substring(1)
            } while (v.first() == '1')
            val lit = Packet(version, type, number.toLong(2))
            if (current == null) {
                current = lit
            } else {
                current.sub += lit
            }
        } else {
            val new = Packet(version, type)
            if (current != null) {
                current.sub += new
            }
            current = new

            val lenId = tok.take(1).toInt(2)
            val length = tok.take(if (lenId == 0) 15 else 11).toInt(2)
            if (lenId == 0) {
                val readStart = tok.read
                while (tok.read - readStart < length) {
                    parse(tok, current)
                }
            } else {
                repeat(length) {
                    parse(tok, current)
                }
            }
        }

        return current
    }

    data class Packet(
        val version: Int,
        val type: PacketType,
        val value: Long? = null,
        val sub: MutableList<Packet> = mutableListOf()
    ) {
        val versionSum: Int
            get() = version + sub.sumOf { it.versionSum }

        fun eval(): Long = when (type) {
            PacketType.LIT -> value!!
            PacketType.SUM -> sub.sumOf { it.eval() }
            PacketType.PROD -> sub.fold(1L) { acc, n -> acc * n.eval() }
            PacketType.MIN -> sub.minOf { it.eval() }
            PacketType.MAX -> sub.maxOf { it.eval() }
            PacketType.GT -> sub.let { (a, b) -> if (a.eval() > b.eval()) 1 else 0 }
            PacketType.LT -> sub.let { (a, b) -> if (a.eval() < b.eval()) 1 else 0 }
            PacketType.EQ -> sub.let { (a, b) -> if (a.eval() == b.eval()) 1 else 0 }
        }
    }

    enum class PacketType {
        SUM,
        PROD,
        MIN,
        MAX,
        LIT,
        GT,
        LT,
        EQ
    }
}