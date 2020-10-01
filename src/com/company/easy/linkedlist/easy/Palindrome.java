package com.company.easy.linkedlist.easy;

import com.company.easy.linkedlist.LinkedList;
import com.company.easy.linkedlist.ListNode;

import java.util.Stack;

public class Palindrome extends LinkedList {
    ListNode head;

//    public static boolean isPalindrome(ListNode head) {
//        if (head == null) {
//            return true;
//        }
//
//        Stack<Integer> stack = new Stack<>();
//
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//
//        ListNode slow = dummy;
//        ListNode fast = dummy;
//
//
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        if (slow.next == null) {
//            return true;
//        } else if (slow.next.next == null) {
//            return slow.val == slow.next.val;
//        } else {
//            fast = slow;
//
//            while (slow != null) {
//                stack.push(slow.val);
//                slow = slow.next;
//            }
//            slow = dummy.next;
//            while (slow != fast) {
//                if (slow.val == stack.peek()) {
//                    stack.pop();
//                    slow = slow.next;
//                } else {
//                    return false;
//                }
//            }
//            return true;
//        }
//    }

    public static boolean isPalindrome(ListNode head) {
        ListNode listNode = head;
        Stack<Integer> stack = new Stack();

        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        listNode = head;
        while (listNode != null) {
            if (listNode.val != stack.pop()) {
                return false;
            }
            listNode = listNode.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome linkedList = new Palindrome();

        ListNode listNode = new ListNode(1);
        linkedList.head = listNode;
        listNode.next = new ListNode(2);
//        listNode.next.next = new ListNode(2);
//        listNode.next.next.next = new ListNode(1);
//        listNode.next.next.next.next = new ListNode(2);

        System.out.println(isPalindrome(linkedList.head));
        linkedList.print(linkedList.head);

    }


}
