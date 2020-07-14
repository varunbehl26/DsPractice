package com.company.twoPointer

fun main() {
    println(tribonacci(3))
}

fun tribonacci(n: Int): Int {

    val dp = IntArray(n + 1)

    for (i in 1..n) {
        when (i) {
            0 -> {
                dp[i] = 0
            }
            1 -> {
                dp[i] = 1
            }
            2 -> {
                dp[i] = 1
            }
            else -> {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]
            }
        }
    }
    return dp[n]
}
