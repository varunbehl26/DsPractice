package com.company.easy.linkedlist.easy;

import com.company.easy.linkedlist.LinkedList;
import com.company.easy.linkedlist.ListNode;

public class Reverse extends LinkedList {
    public static void main(String[] args) {
        Reverse linkedList = new Reverse();

        ListNode listNode = new ListNode(1);
        linkedList.head = listNode;
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
//        listNode1.next.next.next.next = new ListNode(2);

        linkedList.head = linkedList.reverseList(linkedList.head);
        linkedList.print(linkedList.head);

    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
