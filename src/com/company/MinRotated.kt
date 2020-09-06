package com.company

fun main() {
    println(findMin(intArrayOf(3, 5, 1)))
}

fun findMin(nums: IntArray): Int {

    var min = Int.MAX_VALUE
    for (it in nums) {
        if (it < min) {
            min = it
        }
    }
    return min
}