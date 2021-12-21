package day21

import kotlin.math.max


fun main() {
    val players1 = intArrayOf(4, 8)
    val players2 = intArrayOf(4, 2)
    Day21().play2(players2)
}

class Day21 {

    fun play1(playersPos: IntArray) {
        var dice = 1
        var player = 0
        val score = intArrayOf(0, 0)
        var rolled = 0
        var playerCount = 1

        var sum = 0

        for (counter in 1..1000) {
            sum += dice
            if (playerCount == 3) {
                val pos = (playersPos[player] + sum) % 10

                if (pos == 0) {
                    score[player] += 10
                    playersPos[player] = 10
                } else {
                    score[player] += pos
                    playersPos[player] = pos
                }


                if (score[0] >= 1000) {
                    val s = score[1] * counter
                    println(score[1].toString() + " " + counter + " " + s)
                    break
                } else if (score[1] >= 1000) {
                    val s = score[1] * counter
                    println(score[0].toString() + " " + counter + " " + s)
                    break
                }
                sum = 0
                playerCount = 1
                player = if (player == 0) 1 else 0
            } else {
                playerCount++
            }
            if (dice == 100)
                dice = 1
            else
                dice++

            rolled += 3
        }
    }

    fun play2(playersPos: IntArray) {
        val counter = mutableMapOf(State(playersPos[0], playersPos[1], 0, 0) to 1L)

        var p1Wins = 0L
        var p2Wins = 0L

        while (counter.isNotEmpty()) {
            val iterator = counter.iterator()
            val (state, l) = iterator.next()
            iterator.remove()

            val (p1, p2, scoreP1, scoreP2) = state




            repeat(3) { d1 ->
                repeat(3) { d2 ->
                    repeat(3) { d3 ->
                        var px1 = p1
                        px1 += d1 + d2 + d3 + 3
                        px1--
                        px1 %=10
                        px1++

                        var scorePx1 = scoreP1

                        scorePx1 += px1
                        if(scorePx1 >= 21) {
                            p1Wins+= l
                        } else {
                            repeat(3) { dx1 ->
                                repeat(3) { dx2 ->
                                    repeat(3) { dx3 ->
                                        var px2 = p2
                                        px2 += dx1 + dx2 + dx3 + 3
                                        px2--
                                        px2 %=10
                                        px2++

                                        var scorePx2 = scoreP2
                                        scorePx2 += px2
                                        if(scorePx2 >= 21) {
                                            p2Wins+= l
                                        } else {
                                            val state1 = State(px1, px2, scorePx1, scorePx2)
                                            if(state1 in counter){
                                                counter[state1] = l + counter[state1]!!
                                            } else {
                                                counter[state1] = l
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        println(max(p1Wins.log(), p2Wins.log()))


    }
}
fun <T> T.log(): T = also { println(this) }
data class State(val p1: Int, val p2: Int, val scoreP1: Int, val scoreP2: Int)