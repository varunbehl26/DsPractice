package com.company

import java.util.*


fun main() {
    println(longestSubsequence(intArrayOf(1, 5, 7, 8, 5, 3, 4, 2, 1), -2))
}

fun longestSubsequence(arr: IntArray, difference: Int): Int {
    var res = 1
    val map: MutableMap<Int, Int?> = HashMap()
    for (i in arr.indices) {
        if (map.containsKey(arr[i] - difference)) {
            map[arr[i]] = map[arr[i] - difference]!! + 1
        } else {
            map[arr[i]] = 1
        }
        res = Math.max(res, map[arr[i]]!!)
    }
    return res
}