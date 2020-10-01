package com.company.easy.linkedlist.easy;

import com.company.easy.linkedlist.LinkedList;
import com.company.easy.linkedlist.ListNode;

public class DeleteDuplicates extends LinkedList {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode prev = dummyNode.next;
        ListNode after = prev.next;

        while (after != null) {
            if (after.val == prev.val) {
                prev.next = after.next;
            } else {
                prev = after;
            }
            after = after.next;
        }

        return dummyNode.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
//        listNode.next = new ListNode(1);
//        listNode.next.next = new ListNode(2);
//        listNode.next.next.next = new ListNode(4);
//        listNode.next.next.next.next = new ListNode(4);

        listNode = deleteDuplicates(listNode);

        print(listNode);
    }
}
