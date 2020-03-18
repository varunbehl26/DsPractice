package com.company.gfg.arrays


//https://leetcode.com/problems/valid-parentheses/

//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Note that an empty string is also considered valid.

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
