package com.company.gfg.arrays

import java.util.*


//https://leetcode.com/problems/valid-parentheses/

//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Note that an empty string is also considered valid.

fun main() {

    print(isValid("]"))

}

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    val charArray = s.toCharArray()

    charArray.forEach {
        if (it == '(' || it == '{' || it == '[') {
            stack.push(it)
        } else if (it == ')' && stack.isNotEmpty() && stack.peek() == '(') {
            stack.pop()
        } else if (it == '}' && stack.isNotEmpty() && stack.peek() == '{') {
            stack.pop()
        } else if (it == ']' && stack.isNotEmpty() && stack.peek() == '[') {
            stack.pop()
        } else {
            return false
        }

    }
    return stack.isEmpty()
}