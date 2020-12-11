package com.company.leetcodeDecember

fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    var count = 0
    flowerbed.forEachIndexed { i, it ->
        if (flowerbed[i] == 0) {
            //get next and prev flower bed slot values. If i lies at the ends the next and prev are considered as 0.
            val next = if (i == flowerbed.size - 1) 0 else flowerbed[i + 1]
            val prev = if (i == 0) 0 else flowerbed[i - 1]
            if (next == 0 && prev == 0) {
                flowerbed[i] = 1
                count++
            }
        }
    }
    return count == n
}

fun main() {
    print(canPlaceFlowers(intArrayOf(0, 1, 0), 1))
}