package com.company.gfg.linkedList;

public class IntersectionList {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode pointA = headA;
        ListNode pointB = headB;

        while (pointA != pointB) {
            if (pointA != null) {
                pointA = pointA.next;
            } else {
                headB = headB.next;
            }
            if (pointB != null) {
                pointB = pointB.next;
            } else {
                headA = headA.next;
            }
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


}
