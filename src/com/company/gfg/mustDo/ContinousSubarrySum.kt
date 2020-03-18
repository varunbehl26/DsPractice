package com.company.gfg.mustDo

fun main() {
    val nums = intArrayOf(23, 2, 4, 6, 7)
    println(checkSubarraySum(nums, 12))
}

fun checkSubarraySum(nums: IntArray, k: Int): Boolean {
    var startIndex = 0
    var currIndex: Int = startIndex
    val endIndex = nums.size - 1
    var contSum: Int
    while (startIndex <= endIndex) {
        contSum = nums[startIndex]
        currIndex = startIndex + 1
        while (currIndex <= endIndex) {
            if (contSum == k) {
                if (currIndex - startIndex >= 1)
                    return true
            } else if (contSum > k) {
                break
            }
            if (currIndex != endIndex + 1) {
                contSum += nums[currIndex]
                currIndex++
            }
        }
        startIndex++
    }
    return false
}