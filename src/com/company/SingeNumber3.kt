package com.company

fun main() {
    val numbers = singleNumber(intArrayOf())
    numbers.forEach {
        print(it)
    }
}

fun singleNumber(nums: IntArray): IntArray {
    val map = HashMap<Int, Int>()

    nums.forEach {
        if (map.containsKey(it)) {
            map.remove(it)
        } else {
            map[it] = 1
        }
    }
    val arr = IntArray(map.size)
    map.keys.forEachIndexed { index, i -> arr[index] = i }
    return arr
}