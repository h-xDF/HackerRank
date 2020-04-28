package warmupChallenge.JumpingClouds

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the jumpingOnClouds function below.
fun jumpingOnClouds(c: Array<Int>): Int {
    val size: Int = c.size - 1
    var jump: Int = 0
    var cursor: Int = 0

    while (cursor < size) {
        cursor += if (cursor <= size && c[cursor] == 0) {
            jump ++
            2
        } else  {
            jump ++
            1
        }
    }

    return jump
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val c = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = jumpingOnClouds(c)

    println(result)
}