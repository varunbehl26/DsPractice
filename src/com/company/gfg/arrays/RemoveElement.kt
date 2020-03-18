package com.company.gfg.arrays

//TODO
fun main() {
    val nums = arrayOf(0, 1, 2, 2, 3, 0, 4, 2)
    val size = removeElement(nums, 2)

    println("size $size")

    for ((index, it) in nums.withIndex()) {
        if (index < size) {
            println(it)
        } else {
            break
        }
    }
}

fun removeElement(nums: Array<Int>, value: Int): Int {
    if (nums.isEmpty()) {
        return 0
    }


    return nums.size
}