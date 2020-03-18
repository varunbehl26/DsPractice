package com.company.gfg.arrays

//https://leetcode.com/problems/two-sum/
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

//first approach is to put all elements in map and then for loop on array
// if target - each element is present in the map those two numbers are the solution
fun main() {

    val arr = IntArray(2)
    arr[0] = 3
    arr[1] = 3
    val target = 6

    val result = twoSum(arr, target)
    result.forEach {
        print(it)
    }

}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val output = IntArray(2)

    val map = HashMap<Int, Int>()

    for ((index, it) in nums.withIndex()) {
        if (!map.containsKey(it)) {
            map[it] = index
        }
    }

    for ((index, it) in nums.withIndex()) {
        if (map.containsKey(target - it) && map[target - it] != index) {
            output[0] = index
            output[1] = map[target - it]!!
            break
        }
    }

    return output
}
