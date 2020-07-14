package com.company.gfg.must.easy

fun main() {
    println(checkPossibility(intArrayOf(4, 3, 2)))
}

fun checkPossibility(nums: IntArray): Boolean {

    val hashSet = HashSet<Int>()

    var temp = nums[0]

    for (i in 1 until nums.size) {
        hashSet.add(nums[i] - temp)
        temp = nums[i]
    }


    val values = hashSet.filter { it < 0 }
    return values.size == 1
}