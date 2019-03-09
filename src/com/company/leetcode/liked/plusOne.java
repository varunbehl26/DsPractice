package com.company.leetcode.liked;


class plusOne {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        listNode1.next = new ListNode(4);
        listNode1.next.next = new ListNode(3);

        ListNode listNode2 = new ListNode(5);
        listNode2.next = new ListNode(6);
        listNode2.next.next = new ListNode(4);

        ListNode listNode = addTwoNumbers(listNode1, listNode2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode listNode = new ListNode(0);
        ListNode pointer = listNode;
        while (l1 != null || l2 != null) {
            int val = l1 != null ? l1.val : 0;
            int val1 = l2 != null ? l2.val : 0;

            int temp = val + val1 + carry;
            if (temp > 9) {
                temp = temp % 10;
                carry = 1;
            } else {
                carry = 0;
            }

            pointer.next = new ListNode(temp);
            pointer = pointer.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry > 0) {
            pointer.next = new ListNode(carry);

        }
        return listNode.next;

    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


}
