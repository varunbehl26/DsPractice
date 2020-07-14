package com.company

import java.util.*


fun main() {
    val list = threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))
    list?.forEach {
        it.forEach {
            print(it)
            print(" ")
        }
        println()
    }
}

fun threeSum(nums: IntArray): List<List<Int>>? {
    nums.sort()
    val res: MutableList<List<Int>> = LinkedList()
    for (i in 0..nums.size - 2) {
        if (i == 0 || i > 0 && nums[i] != nums[i - 1]) {
            var start = i + 1
            var end = nums.size - 1
            val sum = 0 - nums[i]
            while (start < end) {
                if (nums[start] + nums[end] == sum) {
                    res.add(listOf(nums[i], nums[start], nums[end]))
                    while (start < end && nums[start] == nums[start + 1]) {
                        start++
                    }
                    while (start < end && nums[end] == nums[end - 1]) {
                        end--
                    }
                    start++
                    end--
                } else if (nums[start] + nums[end] < sum) {
                    start++
                } else {
                    end--
                }
            }
        }
    }
    return res
}