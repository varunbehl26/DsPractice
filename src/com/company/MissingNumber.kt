package com.company

fun main() {
    println(missingNumber(intArrayOf(6, 4, 2, 3, 5, 7, 0, 1, 9)))
}

fun missingNumber(nums: IntArray): Int {
    var start = 0
    var num = 0
    while (start < nums.lastIndex) {
        num = nums[start]
        if (num < nums.lastIndex && num != start) {
            val temp = nums[start]
            nums[start] = nums[num]
            nums[num] = temp
        } else {
            start += 1
        }
    }
    for (i in 0..nums.lastIndex) {
        if (nums[i] != i) {
            return i
        }
    }
    return -1
}


//using sum formulae
fun missingNumberSumFormulae(nums: IntArray): Int {
    val sum = nums.size * (nums.size + 1) / 2
    var numberSum = 0
    nums.forEach {
        numberSum += it
    }
    return sum - numberSum
}