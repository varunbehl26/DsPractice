package com.company.arrays


//https://leetcode.com/problems/single-number/
/*
    ((2^2)^(1^1)^(4^4)^(5)) => (0^0^0^5) => 5.
    A number when xor with itself produce 0
    therefore we can XOR all the numbers and the number which
    do not have a pair will remain

 */

fun bitWiseSingleNumber(nums: IntArray): Int {
    var ans = 0
    for (i in 0..31) {
        var sum = 0
        for (j in nums.indices) {
            if (nums[j] shr i and 1 == 1) {
                sum++
                sum %= 3
            }
        }
        if (sum != 0) {
            ans = ans or (sum shl i)
        }
    }
    return ans
}

fun singleNumber(nums: IntArray): Int {
    val map = HashMap<Int, Int>()
    nums.forEach {
        if (map.containsKey(it)) {
            map[it] = map[it]!! - 1
        } else {
            map[it] = 3
        }
    }

    nums.forEach {
        if (map[it] == 3) {
            return it
        }
    }
    return -1
}

//XOR
fun singleNumber(A: IntArray, n: Int): Int {
    var result = 0
    for (i in 0 until n) {
        result = result xor A[i]
    }
    return result
}

fun main() {
//    println(singleNumber(intArrayOf(0,1,0,1,0,1,99)))
    println(singleNumber(intArrayOf(0, 1, 0, 1, 0, 1, 99)))
}