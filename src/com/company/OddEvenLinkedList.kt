package com.company

class ListNode(var `val`: Int) {
    var next: ListNode? = null

}

fun main() {
    val listNode1 = ListNode(1)
    val listNode2 = ListNode(2)
    val listNode3 = ListNode(3)
    val listNode4 = ListNode(4)
    val listNode5 = ListNode(5)

    listNode1.next = listNode2
    listNode2.next = listNode3
    listNode3.next = listNode4
    listNode4.next = listNode5

    val head = listNode1
//    val list2 = oddEvenList(head)
//    print(list2)
}

fun oddEvenList(head: ListNode?): ListNode? {
    if (head == null) {
        return null
    }
    var odd = head
    var even = head.next
    val evenHead = even
    while (even?.next != null) {
        odd?.next = even.next
        odd = odd?.next
        even.next = odd?.next
        even = even.next
    }
    odd!!.next = evenHead
    return head

}