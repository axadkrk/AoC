import kotlin.math.pow

fun main() {
    val test = "D2FE28"
    val test2 = "38006F45291200"
    val test3 = "EE00D40C823060"
    val test4 = "8A004A801A8002F478"
    val test5 = "620080001611562C8802118E34"


//    Day16().encode(test)
//    Day16().encode(test2)
//    Day16().encode(test3)

//    val d1 = Day16()
//    d1.encode(test4)
//    print(d1.sum)

    val d2 = Day16()
    d2.encode(test5)
    print(d2.sum)

}

class Day16 {
    var sum = 0
    fun convertBinaryToDecimal(list: List<Int>): Int {

        var decimalNumber = 0

        list.forEachIndexed { i, value ->
            val test = list.size - i - 1
            decimalNumber += (value * 2.0.pow(test.toDouble())).toInt()
        }

        return decimalNumber
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

    private fun convert(stringBit: String): Int {
        when (stringBit) {
            "000" -> return 0
            "001" -> return 1
            "010" -> return 2
            "011" -> return 3
            "100" -> return 4
            "101" -> return 5
            "110" -> return 6
            "111" -> return 7
        }
        return -1
    }


    fun toBinary(x: Int, len: Int): String {
        return String.format(
            "%" + len + "s",
            Integer.toBinaryString(x)
        ).replace(" ".toRegex(), "0")
    }

    fun encode(data: String) {
        var bitString = ""
        data.forEach { char ->
            bitString += Day16().convert(char)
        }
        println(bitString)
        encode2(bitString.map { s -> s.toString().toInt() }.toList())
    }

    private fun encode2(list: List<Int>) {
        if (list.size > 6) {
            val version = convert("" + list[0] + list[1] + list[2])
            val id = convert("" + list[3] + list[4] + list[5])

            println("version $version")
            sum += version
//        println("id $id")

            if (id == 4) {
                convertLiteral(list)
            } else {
//            val subLists = mutableListOf<List<Int>>()
                val lengthId = list[6]

                val rest = list.subList(7, list.size)
                if (lengthId == 1) {
                    val len = 11

                    val lengthList = rest.subList(0, len)
                    val listWithoutLength = rest.subList(len, rest.size)

                    val length = convertBinaryToDecimal(lengthList)

                    var i = 0
                    for (j in 0 until length) {
                        if (i < listWithoutLength.size - 11) {
                            val subList = listWithoutLength.subList(i, i + 11)
                            encode2(subList)
                        }
                        i += 11
                    }
                    encode2(rest.subList(i, rest.size))
                } else {
                    val len = 15
                    val lengthList = rest.subList(0, len)
                    val listWithoutLength = rest.subList(len, rest.size)

                    val length = convertBinaryToDecimal(lengthList)

                    val subList1 = listWithoutLength.subList(0, length)

                    var i = 0
                    for (j in 0 until length) {
                        if (i > listWithoutLength.size) {
                            break
                        }
                        if (i < subList1.size) {
                            val lengthId2 = subList1[i]
                            if (lengthId2 == 0) {
                                if (i < subList1.size - 15) {
                                    val subList = subList1.subList(i, i + 16)
                                    encode2(subList)

                                }
                                i += 15
                            } else {
                                if (i <= subList1.size - 11) {
                                    val subList = subList1.subList(i, i + 11)
                                    encode2(subList)

                                }
                                i += 11
                            }
                        }
                    }
                    encode2(listWithoutLength.subList(length, listWithoutLength.size))
                }
            }
        }
    }

    private fun convertLiteral(list: List<Int>) {
        val version = convert("" + list[0] + list[1] + list[2])
        val id = convert("" + list[3] + list[4] + list[5])
//        println("version $version")
//        println("id $id")

        val subList = list.subList(6, list.size)
        var i = 0;
        val till = (subList.size / 5)

        val subLists = mutableListOf<List<Int>>()
        for (j in 0 until till) {
            val subList2 = subList.subList(i, i + 5)
            i += 5
            subLists.add(subList2)
            if (subList2[0] == 0) {
                break
            }
        }

        val completeLit = mutableListOf<Int>()
        subLists.forEach { num ->
            val literal = num.subList(1, num.size)
            literal.forEach { lit -> completeLit.add(lit) }
        }
//        println(convertBinaryToDecimal(completeLit))
    }
}