package com.company.gfg.must.easy

import java.util.*


//Input: 19
//Output: true
//Explanation:
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1

fun main() {
    println(isHappy(2))
}

//The idea is to use one hash set to record sum of every digit square of every number occurred.
// Once the current sum cannot be added to set, return false; once the current sum equals 1,
// return true;

fun isHappy(num: Int): Boolean {
    var value = num
    val mutableSet: MutableSet<Int> = HashSet()
    var squareSum: Int
    var remain: Int
    while (mutableSet.add(value)) {
        squareSum = 0
        while (value > 0) {
            remain = value % 10
            squareSum += remain * remain
            value /= 10
        }
        value = if (squareSum == 1) {
            return true
        } else {
            squareSum
        }
    }
    return false
}