package com.company.easy.linkedlist.medium;

import com.company.easy.linkedlist.LinkedList;
import com.company.easy.linkedlist.ListNode;

//TODO need to do it again

public class SortLinkedList extends LinkedList {

    public static void main(String[] args) {
        SortLinkedList linkedList = new SortLinkedList();
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(5);
        listNode1.next.next = new ListNode(4);
        listNode1.next.next.next = new ListNode(2);
        listNode1.next.next.next.next = new ListNode(3);
        ListNode listNode2 = linkedList.sortList(listNode1);
        print(listNode2);
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);
    }

    ListNode getMid(ListNode head) {
        ListNode slow = null;
        while (head != null && head.next != null) {
            if (slow == null) {
                slow = head;
            } else {
                slow = slow.next;
            }
            head = head.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        return mid;
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (left != null && right != null) {
            if (left.val < right.val) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }
        tail.next = (left != null) ? left : right;

        return dummyHead.next;
    }

}