package com.company.gfg.arrays

fun main() {
    val nums = arrayOf(1, 3, 5, 6)
    println(searchInsert(nums = nums, target = 2))
}

fun searchInsert(nums: Array<Int>, target: Int): Int {
    if (nums.isEmpty()) {
        return 0
    }
    for ((index, it) in nums.withIndex()) {
        if (it == target) {
            return index
        } else if (it > target) {
            return index
        }
    }
    if (nums[nums.size - 1] < target) {
        return nums.size
    }
    return 0
}
