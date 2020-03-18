package com.company.gfg.sorting

import java.util.*


fun main() {
    println(bubbleSortKotlin(arrayListOf(3, 44, 38, 5, 47, 15, 36)))
}

fun sort(arr: IntArray) {
    for (i in 0 until arr.size - 1) {
        for (j in 0 until arr.size - 1 - i) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
        println("===========")
    }
}

fun bubbleSortKotlin(arr: ArrayList<Int>): Int {
    var left: Int
    var right: Int
    var swap = true

    while (swap) {
        swap = false
        arr.withIndex().forEach { (index, it) ->
            if (index != arr.size - 1) {
                left = it
                right = arr[index + 1]
                if (left > right) {
                    val temp = left
                    arr[index] = right
                    arr[index + 1] = temp
                    swap = true
                }
            }
        }
    }

    arr.forEach {
        println(it)
    }
    return 0
}

