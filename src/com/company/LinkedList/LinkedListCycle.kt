package com.company.LinkedList


class ListNode internal constructor(var value: Int) {
    var next: ListNode? = null

}

fun main() {

}


fun hasCycle(head: ListNode?): Boolean {
    if (head == null) {
        return false
    }
    var curr: ListNode? = head
    var next: ListNode? = curr?.next

    while (next?.next != null || next?.next?.next != null) {
        curr = curr?.next
        next = next.next?.next

        if (curr == next) {
            return true
        }
    }
    return false
}