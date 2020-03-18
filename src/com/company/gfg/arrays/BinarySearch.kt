package com.company.gfg.arrays

fun main() {
    val arr = arrayOf(-1, 0, 3, 5, 9, 12)
    println(search(arr, 13))
}


fun search(nums: Array<Int>, target: Int): Int {
    var pivot: Int
    var left = 0
    var right = nums.size - 1
    while (left <= right) {
        pivot = left + (right - left) / 2
        if (nums[pivot] == target) return pivot
        if (target < nums[pivot]) {
            right = pivot - 1
        } else {
            left = pivot + 1
        }
    }
    return -1
}
