package com.company.leetcodeDecember


fun numPairsDivisibleBy60(time: IntArray): Int {
    val remainders = IntArray(60)
    var count = 0
    for (t in time) {
        if (t % 60 == 0) {
            count += remainders[0]
        } else {
            count += remainders[60 - t % 60]
        }
        remainders[t % 60]++
    }
    return count
}

fun main() {
    print(numPairsDivisibleBy60(intArrayOf(30, 20, 150, 100, 40)))
}