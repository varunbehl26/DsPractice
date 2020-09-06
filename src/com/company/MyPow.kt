package com.company

import java.lang.Math.abs


fun main() {
    print(myPow(0.0000, -2147483648))
}

fun myPow(x: Double, n: Int): Double {
    var value = x
    var times = n

    if (times == 0) return 1.0
    if (times == Int.MIN_VALUE) {
        return if (abs(x) == 1.0) 1.0 else 0.0
    }
    if (times < 0) {
        times = -times
        value = 1 / value
    }
    return if (times % 2 == 0) {
        myPow(value * value, times / 2)
    } else {
        value * myPow(value * value, times / 2)
    }
}