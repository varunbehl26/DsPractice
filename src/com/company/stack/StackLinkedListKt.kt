package com.company.stack

class StackLinkedListKt {
    var root: StackNode<Int>? = null

    fun push(value: Int) {
        if (root == null) {
            root = StackNode(value)
        } else {
            val insertNode = StackNode(value)
            insertNode.next = root
            root = insertNode
        }
    }

    fun pop(): Int {
        root ?: return -1
        val data = root?.data
        root = root?.next
        return data!!
    }

    fun peek(): Int {
        root ?: return -1
        return root?.data!!
    }

}

fun main() {
    val stack = StackLinkedListKt()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    val popped = stack.pop()
    println(popped)
    val peek = stack.peek()
    println(peek)

}