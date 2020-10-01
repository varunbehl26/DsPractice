package com.company.easy.linkedlist.easy;

import com.company.easy.linkedlist.LinkedList;
import com.company.easy.linkedlist.ListNode;

public class RemoveNthFromEnd extends LinkedList {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        //i is from 1, as 0 is dummy node
        // will be next to the number (n+1)
        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        RemoveNthFromEnd linkedList = new RemoveNthFromEnd();

        ListNode listNode = new ListNode(1);
        linkedList.head = listNode;
        listNode.next = new ListNode(2);
//        listNode.next.next = new ListNode(2);
//        listNode.next.next.next = new ListNode(1);
//        listNode1.next.next.next.next = new ListNode(2);

        System.out.println(removeNthFromEnd(linkedList.head, 2));
        linkedList.print(linkedList.head);

    }

}
