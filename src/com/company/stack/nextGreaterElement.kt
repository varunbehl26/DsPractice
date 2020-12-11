package com.company.stack

import java.util.*

fun nextGreaterElement(findNums: IntArray, nums: IntArray): IntArray? {
    val map: MutableMap<Int, Int> = HashMap()
    val stack = Stack<Int>()
    for (num in nums) {
        while (stack.isNotEmpty() && stack.peek() < num) {
            map[stack.pop()] = num
        }
        stack.push(num)
    }
    for (i in findNums.indices) {
        findNums[i] = map.getOrDefault(findNums[i], -1)
    }
    return findNums
}


fun main() {
    val arr = nextGreaterElement(intArrayOf(4, 1, 2), intArrayOf(1, 3, 4, 2))
    arr?.forEach { println(it) }
}