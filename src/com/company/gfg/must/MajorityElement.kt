package com.company.gfg.must

import java.util.*

//TODO
fun main() {
    val nums = intArrayOf(2, 2, 1, 1, 1, 2, 2)
    println(majorityElement(nums))
}


fun majorityElement(nums: IntArray): Int {
    val map = TreeMap<Int, Int>()

    nums.forEach {
        val mapValue = map.getOrDefault(it, 0)
        map[it] = mapValue + 1
    }

    map.keys.forEach {
        if (map[it]!! >= (nums.size / 2)) {
            return it
        }
    }
    return -1
}