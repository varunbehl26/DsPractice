package com.company


fun numPairsDivisibleBy60(time: IntArray): Int {
    val remainders = IntArray(60)
    var count = 0
    for (t in time) {
        count += if (t % 60 == 0) { // check if a%60==0 && b%60==0
            remainders[0]
        } else { // check if a%60+b%60==60
            remainders[60 - t % 60]
        }
        remainders[t % 60]++ // remember to update the remainders
    }
    return count
}

fun main() {
    print(numPairsDivisibleBy60(intArrayOf(30, 20, 150, 100, 40)))
}