package com.company.dp

fun main() {
    println(climbStairs(1))
}

fun climbStairs(n: Int): Int {
    if (n == 1) {
        return 1
    }
    val dp = IntArray(n + 1)
    dp[1] = 1
    dp[2] = 2
    for (i in 3..n) {
        dp[i] = dp[i - 1] + dp[i - 2]
    }
    return dp[n]

}