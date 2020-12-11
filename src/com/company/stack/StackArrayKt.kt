package com.company.stack

class StackArrayKt {
    var size: Int = 10
    var top: Int = -1
    var arr = IntArray(size)

    fun push(value: Int) {
        if (isFull()) {
            return
        } else {
            arr[++top] = value
        }
    }


    fun pop(): Int {
        return if (isEmpty()) {
            -1
        } else {
            arr[top--]
        }
    }

    fun peek(): Int {
        return if (isEmpty()) {
            -1
        } else {
            arr[top]
        }
    }

    private fun isEmpty(): Boolean {
        return top == -1
    }

    private fun isFull(): Boolean {
        return top == size - 1
    }
}

fun main() {
    val stack = StackArrayKt()
    stack.push(1)
    stack.push(2)
    val popped = stack.pop()
    println(popped)
    val peek = stack.peek()
    println(peek)


}