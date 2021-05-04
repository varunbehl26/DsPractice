package com.company.arrays

import kotlin.math.abs

/*
    977. Squares of a Sorted Array
    The question input may have negative which when squared,output array may need to be sorted
    To optimise the solution
    Two pointers are used
    1. One starts from start and other from behind
    2. Loop begins from end(as numbers are sorted) therefore max number would be at the end

    Logic -> Check if abs number at start index is less than the number at end index,
             if yes, square it and replace at the end index,
             if no continue squaring number from last index
 */

//NLOGN
fun sortedSquaresNLOGN(A: IntArray): IntArray {
    val num = mutableListOf<Int>()

    A.forEach {
        num.add(it * it)
    }
    num.sort()
    return num.toIntArray()
}

//TWO POINTERS SOLUTION
fun sortedSquares(A: IntArray): IntArray {
    val arrayLenth = A.size

    val dp = IntArray(arrayLenth)

    var i = 0
    var j = A.lastIndex // size-1

    (A.lastIndex downTo 0).forEach { k ->
        if (abs(A[i]) > abs(A[j])) {
            dp[k] = A[i] * A[i]
            i++
        } else {
            dp[k] = A[j] * A[j]
            j--
        }
    }
    return dp
}

fun main() {
    val outputArray = sortedSquares(intArrayOf(-4, -1, 0, 3, 10))
    for (sortedSquare in outputArray) {
        println(sortedSquare)
    }
}
