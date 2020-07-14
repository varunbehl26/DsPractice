package com.company.arrays

fun main() {
    print(findMaxConsecutiveOnes(intArrayOf(1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1)))
}

fun findMaxConsecutiveOnes(nums: IntArray): Int {
    val countArray = HashSet<Int>()
    var count = 0
    var prevDigit = -1
    if (nums.isNotEmpty()) {
        nums.forEach { element ->
            if (prevDigit == 0) {
                countArray.add(count)
                count = 0
            }
            if (element == 0) {
                prevDigit = 0
            } else {
                prevDigit = 1
                count++
            }
        }
        countArray.add(count)
        return countArray.max()!!
    }

    return 0
}