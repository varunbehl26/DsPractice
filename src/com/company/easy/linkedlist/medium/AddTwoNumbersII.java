package com.company.easy.linkedlist.medium;

import com.company.easy.linkedlist.LinkedList;
import com.company.easy.linkedlist.ListNode;

import java.util.Stack;

public class AddTwoNumbersII extends LinkedList {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> stack3 = new Stack();

        Stack<Integer> stack1 = new Stack();
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        Stack<Integer> stack2 = new Stack();
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }

        int rem = 0;
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            int sum = stack1.pop() + stack2.pop() + rem;
            if (sum >= 10) {
                rem = sum / 10;
                sum = sum % 10;
            } else {
                rem = 0;
            }
            stack3.push(sum);
        }

        while (!stack1.isEmpty()) {
            int sum = stack1.pop() + rem;
            if (sum >= 10) {
                rem = sum / 10;
                sum = sum % 10;
            } else {
                rem = 0;
            }
            stack3.push(sum);
        }
        while (!stack2.isEmpty()) {
            int sum = stack2.pop() + rem;
            if (sum >= 10) {
                rem = sum / 10;
                sum = sum % 10;
            } else {
                rem = 0;
            }
            stack3.push(sum);
        }

        if (rem != 0) {
            stack3.push(rem);
        }

        ListNode l3New = new ListNode(0);
        while (!stack3.isEmpty()) {
            insert(l3New, stack3.pop());
        }

        return l3New.next;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        ListNode listNode = new ListNode(9);
        linkedList.head = listNode;
        listNode.next = new ListNode(9);
        listNode.next.next = new ListNode(9);
        listNode.next.next.next = new ListNode(9);

        ListNode listNode1 = new ListNode(9);
        listNode1.next = new ListNode(9);
        listNode1.next.next = new ListNode(9);

        ListNode node = addTwoNumbers(listNode, listNode1);

        print(node);


    }
}
