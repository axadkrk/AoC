fun main() {
    val testData = "NNCB"

    val testRule = arrayOf(
        "CH->B",
        "HH->N",
        "CB->H",
        "NH->C",
        "HB->C",
        "HC->B",
        "HN->C",
        "NN->C",
        "BH->H",
        "NC->B",
        "NB->B",
        "BN->B",
        "BB->N",
        "BC->B",
        "CC->N",
        "CN->C"
    )

    val realData = "FSKBVOSKPCPPHVOPVFPC"

    val realRule = arrayOf(
        "BV->O",
        "OS->P",
        "KP->P",
        "VK->S",
        "FS->C",
        "OK->P",
        "KC->S",
        "HV->F",
        "HC->K",
        "PF->N",
        "NK->F",
        "SC->V",
        "CO->K",
        "PO->F",
        "FB->P",
        "CN->K",
        "KF->N",
        "NH->S",
        "SF->P",
        "HP->P",
        "NP->F",
        "OV->O",
        "OP->P",
        "HH->C",
        "FP->P",
        "CS->O",
        "SK->O",
        "NS->F",
        "SN->S",
        "SP->H",
        "BH->B",
        "NO->O",
        "CB->N",
        "FO->N",
        "NC->C",
        "VF->N",
        "CK->C",
        "PC->H",
        "BP->B",
        "NF->O",
        "BB->C",
        "VN->K",
        "OH->K",
        "CH->F",
        "VB->N",
        "HO->P",
        "FH->K",
        "PK->H",
        "CC->B",
        "VH->B",
        "BF->N",
        "KS->V",
        "PV->B",
        "CP->N",
        "PB->S",
        "VP->V",
        "BO->B",
        "HS->H",
        "BS->F",
        "ON->B",
        "HB->K",
        "KH->B",
        "PP->H",
        "BN->C",
        "BC->F",
        "KV->K",
        "VO->P",
        "SO->V",
        "OF->O",
        "BK->S",
        "PH->V",
        "SV->F",
        "CV->H",
        "OB->N",
        "SS->H",
        "VV->B",
        "OO->V",
        "CF->H",
        "KB->F",
        "NV->B",
        "FV->V",
        "HK->P",
        "VS->P",
        "FF->P",
        "HN->N",
        "FN->F",
        "OC->K",
        "SH->V",
        "KO->C",
        "HF->B",
        "PN->N",
        "SB->F",
        "VC->B",
        "FK->S",
        "KK->N",
        "FC->F",
        "NN->P",
        "NB->V",
        "PS->S",
        "KN->S"

    )

    polymeraze(testData, testRule)
    polymeraze(realData, realRule)
}


fun polymeraze(data: String, rules: Array<String>) {
    val map = HashMap<String, String>()

    rules.forEach { line ->
        val split = line.split("->")
        map[split[0]] = split[1]
    }

    part1(data, map)
    part2(data, map)
}

fun part2(data: String, map: HashMap<String, String>) {

    val testMap = mutableMapOf<String, Long>()

    for (i in 0..data.length - 2) {
        val c0 = data[i].toString()
        val c1 = data[i + 1].toString()

        val test = testMap[c0.plus(c1)]
        if (test != null)
            testMap[c0.plus(c1)] = test + 1
        else
            testMap[c0.plus(c1)] = 1
    }

    var newMap = HashMap(testMap)
    for (step in 0..39) {
        val newMap2 = HashMap(newMap)
        newMap.forEach { (key, value) ->
            if (value > 0) {
                val s = map[key].toString()

                val leftValue = key[0] + s
                val left = newMap2[leftValue]
                if (left != null) {
                    newMap2[leftValue] = left + value
                } else {
                    newMap2[leftValue] = value
                }

                val rightValue = s + key[1]
                val right = newMap2[rightValue]
                if (right != null) {
                    newMap2[rightValue] = right + value
                } else {
                    newMap2[rightValue] = value
                }

                val value2 = newMap2[key]
                if (value2 != null)
                    newMap2[key] = value2 - value
            }


        }
        newMap = HashMap(newMap2)
    }

    val countMap = mutableMapOf<Char, Long>()
    newMap.forEach { (key, value) ->
        val char = key[0]
        val c = countMap[char]
        if (c != null) {
            countMap[char] = c + value
        } else {
            countMap[char] = value
        }
    }

    countMap.forEach { value ->
        print("$value ")
    }

    val test = countMap[data[data.length - 1]]
    if (test != null) {
        val test2 = data[data.length - 1]
        countMap[test2] = test + 1
    }

    val toList = countMap.toList().map { value -> value.second }
    val sortedBy = toList.sortedBy { value -> value }
    val result = sortedBy.last() - sortedBy.first()
    println("Result: $result ")
}

private fun part1(data: String, map: HashMap<String, String>) {
    var line = data
    for (step in 0..9) {
        val parts = mutableListOf<String>()
        for (i in 0..line.length - 2) {
            val c0 = line[i].toString()
            val c1 = line[i + 1].toString()

            val concat = c0.plus(c1)
            val s = map[concat]


            var newVal = c0 + s

            if (i == line.length - 2) {
                newVal += c1
            }
            parts.add(newVal)

        }
        line = parts.reduce { acc, s -> acc + s }


        val countMap = HashMap<Char, Int>()

        line.forEach { char ->
            val test = countMap[char]
            if (test == null) {
                countMap[char] = 1
            } else
                countMap[char] = test + 1
        }

        println("Step: $step")
        println("Length: " + line.length)


        val toSortedMap = countMap.toList().map { mapE -> mapE.second }
        val sortedBy = toSortedMap.sortedBy { value -> value }
        val result = sortedBy.last() - sortedBy.first()

        countMap.forEach { value ->
            print("$value ")
        }

        println("Result: $result ")

    }
}
