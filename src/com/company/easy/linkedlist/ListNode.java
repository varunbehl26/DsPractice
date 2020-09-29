package com.company.easy.linkedlist;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {

    }

    ListNode(int x) {
        val = x;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
