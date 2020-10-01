package com.company.easy.linkedlist.easy;

import com.company.easy.linkedlist.LinkedList;
import com.company.easy.linkedlist.ListNode;

public class MergeTwoList extends LinkedList {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head = new ListNode(0);
        ListNode headIndex = head;

        while (l1 != null && l2 != null) {
            int value;
            if (l1.val <= l2.val) {
                value = l1.val;
                l1 = l1.next;
            } else {
                value = l2.val;
                l2 = l2.next;
            }
            headIndex.next = new ListNode(value);
            headIndex = headIndex.next;
        }

        if (l1 == null) headIndex.next = l2;
        if (l2 == null) headIndex.next = l1;

        return head.next;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        ListNode listNode = new ListNode(1);
        linkedList.head = listNode;
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(1);

        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next = new ListNode(6);
        listNode1.next.next = new ListNode(5);
        linkedList.head = mergeTwoLists(listNode, listNode1);


        print(linkedList.head);


    }


}
