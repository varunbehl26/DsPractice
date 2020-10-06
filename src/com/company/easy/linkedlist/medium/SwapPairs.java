package com.company.easy.linkedlist.medium;

import com.company.easy.linkedlist.LinkedList;
import com.company.easy.linkedlist.ListNode;

public class SwapPairs extends LinkedList {

    //These kind of problems require dummy node
    //Wherever the placement of first node changes
    //it requires 3 pointers
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
            current.next = second;
            current = first;
            first.next = second.next;
            second.next = first;
        }
        return dummy.next;
    }


    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(3);
        listNode1.next.next.next = new ListNode(4);
        ListNode listNode2 = swapPairs(listNode1);

        print(listNode2);

    }
}
