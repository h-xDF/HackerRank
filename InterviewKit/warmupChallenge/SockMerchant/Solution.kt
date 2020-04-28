package warmupChallenge.SockMerchant

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    val singleSocks: HashSet<Int> = hashSetOf(0)
    var count: Int = 0

    for (sock in ar) {
        if (singleSocks.contains(sock)) {
            count++
            singleSocks.remove(sock)
        } else {
            singleSocks.add(sock)
        }
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
