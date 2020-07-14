package com.company

fun main() {
    println(mincostTickets(intArrayOf(1, 4, 6, 7, 8, 20), intArrayOf(2, 7, 15)))
}


fun mincostTickets(days: IntArray, costs: IntArray): Int {
    val n = days[days.size - 1]
    //the minimum is dp[i] = min{ dp[i-1] + cost[0], dp[i-7] + cost[1], dp[i-30] + cost[2] }
    val dp = IntArray(n + 1)
    val travelDay = BooleanArray(n + 1)
    for (day in days) {
        travelDay[day] = true
    }
    for (i in 1 until dp.size) {
        if (travelDay[i]) {
            val one = dp[i - 1] + costs[0]
            val seven = dp[Math.max(0, i - 7)] + costs[1]
            val thirty = dp[Math.max(0, i - 30)] + costs[2]
            dp[i] = Math.min(one, Math.min(seven, thirty))
        } else {
            dp[i] = dp[i - 1]
        }
    }
    return dp[n]
}