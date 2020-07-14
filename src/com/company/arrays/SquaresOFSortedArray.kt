package com.company.arrays

fun main() {
    val sortedSquares = sortedSquares(intArrayOf(-4, -1, 0, 3, 10))
    for (sortedSquare in sortedSquares) {
        println(sortedSquare)
    }
}

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
    val n = A.size

    val dp = IntArray(n)

    var i = 0
    var j = A.lastIndex // size-1

    for (k in A.lastIndex downTo 0) {
        if (Math.abs(A[i]) > Math.abs(A[j])) {
            dp[k] = A[i] * A[i]
            i++
        } else {
            dp[k] = A[j] * A[j]
            j--
        }
    }
    return dp
}
