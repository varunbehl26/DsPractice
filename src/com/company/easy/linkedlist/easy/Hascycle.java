package com.company.easy.linkedlist.easy;

import com.company.easy.linkedlist.LinkedList;
import com.company.easy.linkedlist.ListNode;

public class Hascycle extends LinkedList {
    ListNode head;

    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Hascycle linkedList = new Hascycle();

        ListNode listNode = new ListNode(3);
        linkedList.head = listNode;
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(0);
        listNode.next.next.next = new ListNode(4);
//        listNode.next.next.next.next = listNode.next;

        System.out.println(hasCycle(linkedList.head));
    }

}
