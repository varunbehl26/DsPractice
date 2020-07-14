package com.company

import java.util.*

fun intervalIntersection(A: Array<IntArray>, B: Array<IntArray>): Array<IntArray?> {
    val ans: MutableList<IntArray?> = ArrayList()
    var i = 0
    var j = 0
    while (i < A.size && j < B.size) {
        // Let's check if A[i] intersects B[j].
        // lo - the startPoint of the intersection
        // hi - the endpoint of the intersection
        val lo = Math.max(A[i][0], B[j][0])
        val hi = Math.min(A[i][1], B[j][1])

        if (lo <= hi) {
            ans.add(intArrayOf(lo, hi))
        }

        // Remove the interval with the smallest endpoint
        if (A[i][1] < B[j][1]) {
            i++
        } else {
            j++
        }
    }
    return ans.toTypedArray()
}

fun main() {
    val A = arrayOf(intArrayOf(0, 2), intArrayOf(5, 10), intArrayOf(13, 23), intArrayOf(24, 25))
    val B = arrayOf(intArrayOf(1, 5), intArrayOf(8, 12), intArrayOf(15, 24), intArrayOf(25, 26))
    val C = intervalIntersection(A, B)
    C.forEach {
        it?.forEach {
            print(it)
            print(" ")
        }
        println()
    }
}