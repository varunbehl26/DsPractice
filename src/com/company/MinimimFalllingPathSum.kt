package com.company

fun main() {
    val A: Array<IntArray> = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
    )
    println(minFallingPathSum(A))
}

fun minFallingPathSum(A: Array<IntArray>): Int {
    val row = A.size
    val column = A[0].size
    var k = 0
    val dp = intArrayOf(row * column)


    for (i in 0 until column) {
        for (j in 0 until row) {
            print(A[i][j])
            print(" ")
        }
    }


    return -1
}