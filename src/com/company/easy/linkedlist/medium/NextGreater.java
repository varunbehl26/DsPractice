package com.company.easy.linkedlist.medium;

import com.company.easy.linkedlist.LinkedList;
import com.company.easy.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextGreater extends LinkedList {


    private static int[] nextLargerNodes(ListNode head) {

        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        ListNode listNode = head;
        int index = 0;

        while (listNode != null) {

            list.add(listNode.val);

            while (!stack.isEmpty() && list.get(stack.peek()) < listNode.val) {
                list.set(stack.pop(), listNode.val);
            }

            stack.push(index++);
            listNode = listNode.next;
        }

        while (!stack.isEmpty()) {
            list.set(stack.pop(), 0);
        }

        return listToArray(list);
    }

    private static int[] listToArray(List<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }


    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(7);
        listNode1.next.next = new ListNode(5);
        listNode1.next.next.next = new ListNode(1);
        listNode1.next.next.next.next = new ListNode(9);

        int[] output = nextLargerNodes(listNode1);

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
            System.out.print(" ");
        }
    }

}
