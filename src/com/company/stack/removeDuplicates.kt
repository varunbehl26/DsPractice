package com.company.stack

import java.util.*

fun removeDuplicates(S: String): String {
    if (S.isEmpty()) return S
    val stack = Stack<Char>()
    for (char in S) {
        if (stack.isEmpty()) {
            stack.push(char)
        } else {
            if (char == stack.peek()) {
                stack.pop()
            } else {
                stack.push(char)
            }
        }
    }
    val stringBuilder = StringBuilder()
    while (stack.isNotEmpty()) {
        stringBuilder.append(stack.pop())
    }
    return stringBuilder.reverse().toString()
}

class CustomNode(var char: Char, var count: Int)

fun removeDuplicatesAdvanceOnlyKDuplicatesAllowed(s: String, k: Int): String {
    if (s.isEmpty()) return s
    val stack = Stack<CustomNode>()
    for (char in s) {
        if (stack.isEmpty()) {
            stack.push(CustomNode(char, 1))
        } else {
            val peekNode = stack.peek()
            if (peekNode.char == char) {
                if (peekNode.count == k - 1) {
                    stack.pop()
                } else {
                    peekNode.count = peekNode.count + 1
                }
            } else {
                stack.push(CustomNode(char, 1))
            }
        }
    }
    val sb = java.lang.StringBuilder()
    while (stack.isNotEmpty()) {
        val peekNode = stack.pop();
        if (peekNode.count > 1) {
            while (peekNode.count >= 1) {
                sb.append(peekNode.char)
                peekNode.count--
            }
        } else {
            sb.append(peekNode.char)
        }
    }

    return sb.reverse().toString()
}

fun main() {
    print(removeDuplicatesAdvanceOnlyKDuplicatesAllowed("pbbcggttciiippooaais", 2))
}