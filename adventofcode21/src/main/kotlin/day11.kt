fun main() {
    val testData0 = arrayOf(
        intArrayOf(1, 1, 1, 1, 1),
        intArrayOf(1, 9, 9, 9, 1),
        intArrayOf(1, 9, 1, 9, 1),
        intArrayOf(1, 9, 9, 9, 1),
        intArrayOf(1, 1, 1, 1, 1),
    )
    val testData = arrayOf(
        intArrayOf(5, 4, 8, 3, 1, 4, 3, 2, 2, 3),
        intArrayOf(2, 7, 4, 5, 8, 5, 4, 7, 1, 1),
        intArrayOf(5, 2, 6, 4, 5, 5, 6, 1, 7, 3),
        intArrayOf(6, 1, 4, 1, 3, 3, 6, 1, 4, 6),
        intArrayOf(6, 3, 5, 7, 3, 8, 5, 4, 7, 8),
        intArrayOf(4, 1, 6, 7, 5, 2, 4, 6, 4, 5),
        intArrayOf(2, 1, 7, 6, 8, 4, 1, 7, 2, 1),
        intArrayOf(6, 8, 8, 2, 8, 8, 1, 1, 3, 4),
        intArrayOf(4, 8, 4, 6, 8, 4, 8, 5, 5, 4),
        intArrayOf(5, 2, 8, 3, 7, 5, 1, 5, 2, 6)
    )

    val realData = arrayOf(
        intArrayOf(4, 1, 1, 2, 2, 5, 6, 3, 7, 2),
        intArrayOf(3, 1, 4, 3, 2, 5, 3, 7, 1, 2),
        intArrayOf(4, 5, 1, 6, 8, 4, 8, 6, 3, 1),
        intArrayOf(3, 7, 8, 3, 4, 7, 7, 1, 3, 7),
        intArrayOf(3, 7, 4, 6, 7, 2, 3, 5, 8, 2),
        intArrayOf(5, 8, 6, 1, 3, 5, 8, 8, 8, 4),
        intArrayOf(4, 8, 4, 3, 3, 5, 1, 7, 7, 4),
        intArrayOf(2, 3, 1, 6, 4, 4, 7, 6, 2, 1),
        intArrayOf(6, 6, 4, 3, 8, 1, 7, 7, 4, 5),
        intArrayOf(6, 3, 6, 6, 8, 1, 5, 8, 6, 8)
    )

    calc11(testData0)
    calc11(testData)
    calc11(realData)
}


fun calc11(data: Array<IntArray>) {
    var num = 0
    for (step in 1..1000) {
//        println("step: $step")
//        printData(data)

        incData(data)

        val flashed = flashedPos(data)
        flashed.forEach { fPos ->
            flashAdj(fPos, data)
        }
        val localSum = zeroData(data)
        if(localSum == 100){
            println(step)
        }
        num +=localSum
    }
    println(num)

}

private fun flashAdj(pos: Pos, data: Array<IntArray>) {
    getAdjacent(pos).forEach { adj ->
        data[adj.x][adj.y]++
        if (data[adj.x][adj.y] == 10) {

            flashAdj(adj, data)
        }
    }
}

fun zeroData(data: Array<IntArray>): Int {
    var sum = 0
    for (x in data.indices) {
        for (y in data[x].indices) {
            if (data[x][y] > 9) {
                data[x][y] = 0
                sum++
            }
        }
    }
    return sum
}

fun flashedPos(data: Array<IntArray>): MutableList<Pos> {
    val list = mutableListOf<Pos>()
    for (x in data.indices) {
        for (y in data[x].indices) {
            if (data[x][y] == 10) {
                list.add(Pos(x, y))
            }
        }
    }
    return list
}

fun incData(data: Array<IntArray>) {
    for (x in data.indices) {
        for (y in data[x].indices) {
            data[x][y] += 1
        }
    }
}

fun getAdjacent(pos: Pos): List<Pos> {
    val list = mutableListOf<Pos>()

    for (i in pos.x - 1..pos.x + 1) {
        for (j in pos.y - 1..pos.y + 1) {
            if (i in 0..9)
                if (j in 0..9)
                    list.add(Pos(i, j))
        }
    }
    return list.filter { pos2 -> !(pos2.x == pos.x && pos2.y == pos.y) }
}

class Pos(val x: Int, val y: Int) {
}




