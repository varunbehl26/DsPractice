package com.company

fun main() {
    println(minCostClimbingStairs(intArrayOf(10, 15, 20)))
}


fun minCostClimbingStairs(cost: IntArray): Int {
    val dp = IntArray(cost.size)
    for (i in cost.indices) {
        if (i < 2) {
            dp[i] = cost[i];
        } else {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2])
        }
    }
    return Math.min(dp[cost.size - 1], dp[cost.size - 2]);
}