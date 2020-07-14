package com.company

fun main() {
    println(numSquares(12))
}

fun numSquares(n: Int): Int {
    val dp = IntArray(n + 1)
    for (i in 1..n) {
        dp[i] = Int.MAX_VALUE
    }

    for (i in 1..n) {
        val sqrt = Math.sqrt(i.toDouble()).toInt()

        // If the number is already a perfect square, then dp[number] can be 1 directly. This is
        if (sqrt * sqrt == i) {
            dp[i] = 1
            continue
        }

        // To get the value of dp[n], we should choose the min, value from:
        //     dp[n - 1] + 1,
        //     dp[n - 4] + 1,
        //     dp[n - 9] + 1,
        //     and so on...
        for (j in 1..sqrt) {
            val dif = i - j * j
            dp[i] = Math.min(dp[i], dp[dif] + 1)
        }
    }

    return dp[n]
}