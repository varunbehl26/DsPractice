package com.company.arrays

fun main() {
    print(findNumbers(intArrayOf(555, 901, 482, 1771)))
}

fun findNumbers(nums: IntArray): Int {
    var count = 0
    nums.forEach {
        if (it.toString().length % 2 == 0) {
            count++
        }
    }
    return count
}