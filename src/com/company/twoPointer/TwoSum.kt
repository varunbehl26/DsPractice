package com.company.twoPointer

import java.util.*

fun main() {
    val arr = twoSum(intArrayOf(2, 7, 11, 15), 9)
    arr.forEach {
        println(it)
    }
}

// NOT recommended
fun twoSumHasMap(nums: IntArray, target: Int): IntArray? {
    val map = HashMap<Int, Int?>()
    val values = IntArray(2)
    for (i in nums.indices) {
        val num = nums[i]
        map[num] = i
    }
    for (i in nums.indices) {
        val num = nums[i]
        if (map.containsKey(target - num) && map[target - num] != i) {
            values[1] = map[target - num]!!
            values[0] = i
        }
    }
    return values
}

//Two pointer solution recommended
fun twoSum(numbers: IntArray, target: Int): IntArray {
    val result = IntArray(2)
    var ptr1 = 0
    var ptr2 = numbers.lastIndex

    while (ptr1 < ptr2) {
        if (((numbers[ptr1] + numbers[ptr2]) == target)) {
            result[0] = ptr1 + 1
            result[1] = ptr2 + 1
            break
        } else if (((numbers[ptr1] + numbers[ptr2]) < target)) {
            ptr1++
        } else {
            ptr2--
        }
    }
    return result
}