package com.company

fun main() {
    println(isPowerOfTwo(0))
}

fun isPowerOfTwo(n: Int): Boolean {
    var input = n
    if (input == 0) {
        return false;
    }
    while (input != 1) {
        if (input % 2 != 0) {
            return false
        } else {
            input /= 2
        }
    }
    return true
}