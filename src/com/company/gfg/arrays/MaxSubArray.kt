package com.company.gfg.arrays

//https://www.youtube.com/watch?v=2MmGzdiKR9Y
//https://medium.com/@rsinghal757/kadanes-algorithm-dynamic-programming-how-and-why-does-it-work-3fd8849ed73d

fun main() {
//    println(maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    println(maxSubArray(intArrayOf(5, -3, 5, 5, -3, 5)))
}

fun maxSubArray(nums: IntArray): Int {
    if (nums.isEmpty()) {
        return Int.MIN_VALUE
    }
    var max = nums[0]
    var sumSoFar = nums[0]

    for (i in 1 until nums.size) {
        sumSoFar = Math.max(nums[i], nums[i] + sumSoFar)
        max = Math.max(max, sumSoFar)
    }

    return max
}


