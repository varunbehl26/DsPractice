package com.company

fun main() {
    val arr = plusOne(intArrayOf(4, 3, 9, 9))
    arr.forEach { print("$it ") }
}

fun plusOne(digits: IntArray): IntArray {
    val output = IntArray(digits.size + 1)
    var carr = 0
    digits.reversed().forEachIndexed { index, value ->
        if (index == 0) {
            output[index] = value + 1
            if (output[index] > 9) {
                carr = output[index] % 10
                output[index] = output[index] / 10
            }
        } else {
            output[index] = digits[index] + 1 + carr
            if (output[index] > 9) {
                carr = output[index] % 10
                output[index] = output[index] / 10
            }
        }
    }
    return output
}
