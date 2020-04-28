package warmupChallenge.RepeatedString

import java.util.*
import kotlin.io.*
import kotlin.text.*

// Complete the repeatedString function below.
fun repeatedString(s: String, n: Long): Long {
    val countInWord: Int = s.count { char -> char == 'a'}
    val fullWord: Long = n / s.length
    var count: Long = fullWord * countInWord
    val residue: Int = (n - fullWord * s.length).toInt()

    count += s.substring(0, residue).count { char: Char -> char == 'a' }.toLong()
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val n = scan.nextLine().trim().toLong()

    val result = repeatedString(s, n)

    println(result)
}
