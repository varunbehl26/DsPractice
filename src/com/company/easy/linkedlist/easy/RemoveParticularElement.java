package com.company.easy.linkedlist.easy;

import com.company.easy.linkedlist.LinkedList;
import com.company.easy.linkedlist.ListNode;

public class RemoveParticularElement extends LinkedList {


    public static ListNode removeElements(ListNode head, int val) {
        ListNode listNode = new ListNode(0);
        listNode.next = head;

        ListNode prev = listNode;
        ListNode after = listNode;

        while (after != null) {
            if (after.val == val) {
                prev.next = after.next;
            } else {
                prev = after;
            }
            after = after.next;
        }
        return listNode.next;
    }


    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(5);

        print(removeElements(listNode, 1));
    }
}
