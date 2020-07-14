package com.company.dp

fun main() {
    println(coinChange(intArrayOf(1, 2, 5), 11))
}

fun coinChange(coins: IntArray, amount: Int): Int {
    //declare the size of array to one plus amount, as we need to check from 0 to the amount
    //the number ways for each amount
    val dp = IntArray(amount + 1)

    for (i in 1..amount) {
        var min = Int.MAX_VALUE
        //checking number of ways for each coin and then using the minimum one
        for (coin in coins) {
            //check if there is no way to get a sum we say -1
            if (i - coin >= 0 && dp[i - coin] != -1) {
                min = kotlin.math.min(dp[i - coin], min)
            }
        }
        // Set dp[i] to -1 if i (current amount) can not be reach by  coins array
        dp[i] = if (min == Int.MAX_VALUE) -1 else 1 + min
    }
    return dp[amount]
}