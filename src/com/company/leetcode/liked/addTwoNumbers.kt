package com.company.leetcode.liked

import com.company.easy.linkedlist.ListNode

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var l1Node = l1
    var l2Node = l2

    val rootNode = ListNode(0)
    var nextNode = rootNode
    var rem = 0
    while (l1Node != null || l2Node != null) {
        var sum = l1Node?.`val` ?: 0 + rem
        if (l2Node != null) {
            sum += l2Node.`val`
        }
        rem = 0
        if (sum >= 10) {
            rem = sum / 10
            sum %= 10
        }
        nextNode.next = ListNode(sum)
        nextNode = nextNode.next
        if (l1Node != null) {
            l1Node = l1Node.next
        }
        if (l2Node != null) {
            l2Node = l2Node.next
        }
    }


    return rootNode.next
}

fun main() {
    val listNode = ListNode(9)
    listNode.next = ListNode(9)
    listNode.next.next = ListNode(9)
    listNode.next.next.next = ListNode(9)
    listNode.next.next.next.next = ListNode(9)
    listNode.next.next.next.next.next = ListNode(9)
    listNode.next.next.next.next.next.next = ListNode(9)

    val listNode1 = ListNode(9)
    listNode1.next = ListNode(9)
    listNode1.next.next = ListNode(9)
    listNode1.next.next.next = ListNode(9)

    var resultListNode = addTwoNumbers(listNode, listNode1)

    while (resultListNode != null) {
        print(resultListNode.`val`)
        print(" ")
        resultListNode = resultListNode.next
    }
}