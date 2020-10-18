package com.company.easy.linkedlist.medium;

import com.company.easy.linkedlist.LinkedList;
import com.company.easy.linkedlist.ListNode;

//TODO need to do it again
public class RotateRightLinkedList extends LinkedList {

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return null;
        // since we are already at head node
        int size = 1;
        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null) {
            size++;
            fast = fast.next;
        }

        // i>1 because we need to put slow.next at the start.
        for (int i = size - k % size; i > 1; i--) {
            slow = slow.next;
        }

        fast.next = head;
        head = slow.next;
        slow.next = null;

        return head;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(3);
        listNode1.next.next.next = new ListNode(4);
        listNode1.next.next.next.next = new ListNode(5);

        ListNode head = rotateRight(listNode1, 2);
        print(head);
    }

}
