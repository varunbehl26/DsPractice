package com.company.LinkedList.toDiscuss

import com.company.LinkedList.MyLinkedList

class RevereList : MyLinkedList() {
    fun reverse() {
        var prev: Node? = null
        var current = head
        var next: Node?
        while (current != null) {
            next = current.next
            current.next = prev
            prev = current
            current = next
        }
        head = prev
    }

    companion object {
        fun main(args: Array<String>) {
            val list = RevereList()
            val values = intArrayOf(18, 5, 11, 30, 5, 19, 19, 23, 15, 6, 6, 2)
            for (value in values) {
                list.insert(value)
            }
            list.reverse()
            list.print()
        }
    }
}