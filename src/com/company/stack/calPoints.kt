package com.company.stack

import java.util.*

fun calPoints(ops: Array<String>): Int {
    if (ops.isEmpty()) return 0
    val stack = Stack<String>()
    for (char in ops) {
        when {
            char.toIntOrNull() != null -> {
                stack.push(char)
            }
            char == "+" -> {
                //Sum of all
                val peek = stack.pop()
                val lastPeek = stack.pop()
                val sum = peek.toInt() + lastPeek.toInt()
                stack.push(lastPeek)
                stack.push(peek)
                stack.push(sum.toString())
            }
            char == "D" -> {
                val toInt = stack.peek().toInt()
                val double = toInt * 2
                stack.push(double.toString())
            }
            char == "C" -> {
                stack.pop()
            }
            else -> {

            }
        }
    }
    var sum = 0
    while (stack.isNotEmpty()) {
        sum += stack.pop().toInt()
    }
    return sum
}

fun main() {
    print(calPoints(arrayOf("5", "-2", "4", "C", "D", "9", "+", "+")))
}