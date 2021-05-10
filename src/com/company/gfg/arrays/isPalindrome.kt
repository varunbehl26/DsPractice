package com.company.gfg.arrays


fun main() {
    print(isPalindrome(121))
}

fun isPalindrome(x: Int): Boolean {
    if (x < 0) {
        return false
    }
    var output = 0L
    var input = x

    while (input != 0) {
        output = (output * 10) + input % 10
        input /= 10
    }

    return output.toInt() == x
}
