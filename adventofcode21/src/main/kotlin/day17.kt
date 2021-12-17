import kotlin.math.max

var maxY = 0
val posList = mutableListOf<Pair<Int,Int>>()
fun main() {

    val testData = "x=20..30, y=-10..-5"
    val realData = "x=60..94, y=-171..-136"

//    calc(testData, 7, 2)
//    calc(testData, 6, 3)
//    calc(testData, 9, 0)
//    calc(testData, 17, -4)
//    calc(testData, 6, 9)

    val testBox = convert(testData)
    val realBox = convert(realData)

    bruteForce(realBox)
}

private fun bruteForce(box: Box) {
    for (x in 1..box.getRight()) {
        for (y in box.getDown()..10000) {
            calc(box, x, y)
        }
    }
    println(maxY)
    println(posList.size)
}

private fun calc(data: Box, x: Int, y: Int) {
    val d = Day17()
    val velPair = d.start(data, x, y)

    if (velPair != null) {
        if (d.maxY > maxY) {
            maxY = d.maxY
            println(maxY)
        }
        println(velPair.toString())
        posList.add(velPair)
    }
}


fun convert(input: String): Box {
    val split = input.split(", ")
    val xSplit = split[0].replace("x=", "").split("..")
    val ySplit = split[1].replace("y=", "").split("..")

    return Box(xSplit[0].toInt()..xSplit[1].toInt(), ySplit[0].toInt()..ySplit[1].toInt())
}

class Day17 {

    var maxY = 0

    fun start(box: Box, xVel: Int, yVel: Int): Pair<Int, Int>? {
        val startPos = Pos(0, 0)
        if (calcNext(box, startPos, xVel, yVel)) {
            return Pair(xVel, yVel)
        }
        return null

    }

    private fun calcNext(box: Box, pos: Pos, xVel: Int, yVel: Int): Boolean {
        val newPos = Pos(pos.x + xVel, pos.y + yVel)

        if (newPos.y > maxY) {
            maxY = newPos.y
        }

        return if (box.isInBox(newPos)) {
            true
        } else if (box.isUnderTheBox(pos)) {
            false
        } else {
            val newXVel = max(xVel - 1, 0)
            val newYVel = yVel - 1
            calcNext(box, newPos, newXVel, newYVel)
        }
    }
}

class Box(private val width: IntRange, private val height: IntRange) {

    fun isInBox(pos: Pos): Boolean {
        return pos.x >= width.first && pos.x <= width.last && pos.y >= height.first && pos.y <= height.last
    }

    fun isUnderTheBox(pos: Pos): Boolean {
        return pos.x > width.last || pos.y < height.last
    }

    fun getRight(): Int {
        return width.last
    }
    fun getLeft(): Int {
        return width.first
    }
    fun getUp(): Int {
        return height.last
    }
    fun getDown(): Int {
        return height.first
    }

}