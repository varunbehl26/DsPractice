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
    print(reverse(-2147483648))

}

fun reverse(x: Int): Int {
    var input = x
    var output = 0L
    while (input != 0) {
        output = (output * 10) + (input % 10)
        input /= 10
        if (output >= Int.MAX_VALUE || output <= Int.MIN_VALUE) {
            return 0
        }
    }
    return output.toInt()
}
