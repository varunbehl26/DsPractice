package com.company.leetcodeJuly

fun main() {
    println(arrangeCoins(6))
}


fun arrangeCoins(n: Int): Int {
    var inputMoney = n
    var count = 1
    var index = 1
    while (inputMoney >= index) {
        inputMoney -= index
        index++
        count++
    }

    return count - 1


}