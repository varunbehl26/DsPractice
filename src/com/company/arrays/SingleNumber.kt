package com.company.arrays

fun main() {
//    println(bitWiseSingleNumber(intArrayOf(0,1,0,1,0,1,99)))
    println(1010 and 10)
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
