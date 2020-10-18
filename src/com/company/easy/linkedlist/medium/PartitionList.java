package com.company.easy.linkedlist.medium;

import com.company.easy.linkedlist.LinkedList;
import com.company.easy.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;

public class PartitionList extends LinkedList {

    public static ListNode partition(ListNode head, int x) {
        if (head == null) {
            return head;
        } else {
            List<Integer> numbers = new ArrayList<Integer>();
            ListNode prev = head;
            ListNode curr = head;
            while (curr != null && curr.val != x) {
                prev = curr;
                curr = curr.next;
            }
            while (curr != null) {
                if (curr.val < x) {
                    numbers.add(curr.val);
                    prev.next = curr.next;
                    curr = prev.next;
                } else {
                    prev = curr;
                    curr = curr.next;
                }
            }
            if (numbers.isEmpty()) {
                return head;
            } else {
                int index = 0;
                ListNode dummyHead = new ListNode();
                dummyHead.next = head;
                prev = dummyHead;
                curr = dummyHead;
                while ((curr != null) && !numbers.isEmpty()) {
                    if (curr.val >= numbers.get(index)) {
                        ListNode temp = new ListNode(numbers.get(0));
                        temp.next = prev.next;
                        prev.next = temp;
                        curr = temp;
                        numbers.remove(0);
                    }
                    if (curr.next != null) {
                        prev = curr;
                        curr = curr.next;
                    }
                }
                return dummyHead.next;
            }
        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(3);
        listNode1.next = new ListNode(1);
//        listNode1.next.next = new ListNode(3);
//        listNode1.next.next.next = new ListNode(2);
//        listNode1.next.next.next.next = new ListNode(5);
//        listNode1.next.next.next.next.next = new ListNode(2);
        ListNode node = partition(listNode1, 2);
        print(node);

    }
}
