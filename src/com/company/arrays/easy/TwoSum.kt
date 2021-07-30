package com.company.arrays.easy

//https://leetcode.com/problems/two-sum/
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

//first approach is to put all elements in map and then for loop on array
// if target - each element is present in the map those two numbers are the solution
fun main() {

    val arr = intArrayOf(3, 2, 4)

    val result = twoSum(arr, 6)
    result.forEach {
        print(it)
    }

}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>();
    for ((index, num) in nums.withIndex()) {
        if (map.containsKey(target - num)) {
            return intArrayOf(map.getOrDefault(target - num, 0), index)
        }
        map[num] = index
    }
    return intArrayOf()
}
