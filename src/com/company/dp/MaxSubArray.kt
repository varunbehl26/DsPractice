package com.company.dp

fun main() {
    println(maxSubArray(intArrayOf(-1)))
}

fun maxSubArray(nums: IntArray): Int {
    val dp = IntArray(nums.size)

    nums.forEachIndexed { index, i ->
        if (index == 0) {
            dp[0] = i
        } else {
            dp[index] = dp[index - 1] + i
            if (dp[index] < i) {
                dp[index] = i
            }
        }
    }

    return dp.max()!!
}