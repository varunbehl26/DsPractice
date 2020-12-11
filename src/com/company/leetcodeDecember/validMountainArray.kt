package com.company.leetcodeDecember


fun validMountainArray(arr: IntArray): Boolean {
    val size = arr.size
    var start = 0

    //walking up the mountain
    while (start < size - 1 && arr[start + 1] > arr[start]) {
        start++
    }
    //peek was the end return false or peek never came
    if (start == 0 || start == size - 1) {
        return false
    }
    //walking down the mountain
    while (start < size - 1 && arr[start + 1] < arr[start]) {
        start++
    }

    return start == size - 1
}

fun main() {
    println(validMountainArray(intArrayOf(7, 20, 21)))
    println(validMountainArray(intArrayOf(15, 14, 10)))
    println(validMountainArray(intArrayOf(7, 20, 14, 15, 14, 10)))
    println(validMountainArray(intArrayOf(7, 20, 14, 10)))
}