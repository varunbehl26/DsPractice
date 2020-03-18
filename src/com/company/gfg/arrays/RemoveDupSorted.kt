package com.company.gfg.arrays

fun main() {
    val nums = arrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    val size = removeDuplicates(nums)

    println("size $size")

    for ((index, it) in nums.withIndex()) {
        if (index < size) {
            print(it)
        } else {
            break
        }
    }
}

fun removeDuplicates(nums: Array<Int>): Int {
    if (nums.isEmpty()) {
        return 0
    }
    var curr = 0
    var next = 1
    while (next != nums.size) {
        if (nums[next] > nums[curr]) {
            curr++
            nums[curr] = nums[next]
        }
        next++
    }

    return curr + 1
}

