package com.company.gfg.linkedList

//TODO
fun main() {

}


class ListNode(var value: Int) {
    var next: ListNode? = null
}

fun reverseList(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var curr: ListNode? = head
    var next: ListNode? = null

    while (curr != null) {
        next = curr.next
        curr.next = prev
        prev = curr
        curr = next
    }
    return prev
}