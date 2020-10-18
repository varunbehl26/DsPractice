package com.company.easy.linkedlist.medium;

import com.company.easy.linkedlist.LinkedList;
import com.company.easy.linkedlist.ListNode;

public class RemoveZeroSumSublists extends LinkedList {

    public static void main(String[] args) {
        RemoveZeroSumSublists linkedList = new RemoveZeroSumSublists();
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(3);
        listNode1.next.next.next = new ListNode(-3);
        listNode1.next.next.next.next = new ListNode(-2);
        ListNode listNode2 = linkedList.removeZeroSumSublists(listNode1);
        print(listNode2);
    }

    public ListNode removeZeroSumSublists(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode();
        ListNode prevHead = new ListNode();
        dummy.next = head;
        prevHead.next = head;
        ListNode prev = prevHead.next;
        ListNode curr = prev.next;
        ListNode next = curr.next;
        while (curr != null && next != null) {
            if (prev.val + curr.val + next.val == 0) {
                prev = next;
                curr = next.next;
                prevHead.next = next.next;
            } else if (curr.val + next.val == 0) {
                prev.next = next.next;
                curr = next;
            } else {
                prev = curr;
                curr = curr.next;
            }
            if (curr != null) {
                next = curr.next;
            }
        }
        return prevHead.next;
    }

}
