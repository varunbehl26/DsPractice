package com.company.easy.linkedlist.medium;

import com.company.easy.linkedlist.LinkedList;
import com.company.easy.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;

public class NextGreater extends LinkedList {

//    public static int[] nextLargerNodes(ListNode head) {
//        List<Integer> list = new ArrayList<>();
//        ListNode listNode = head;
//        Stack<Integer> stack = new Stack();
//
//        while (listNode != null) {
//            stack.push(listNode.val);
//            listNode = listNode.next;
//        }
//
//        int max = Integer.MIN_VALUE;
//        while (!stack.isEmpty()) {
//            int pop = stack.pop();
//            if (pop > max) {
//                max = pop;
//                list.add(0);
//            } else {
//                list.add(max);
//            }
//        }
//        int[] ints = new int[list.size()];
//
//        int j = 0;
//        for (int i = list.size() - 1; i >= 0; i--) {
//            ints[j++] = list.get(i);
//        }
//
//        return ints;
//    }

    public static int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();

        ListNode listNode = head;

        while (listNode != null) {
            ListNode start = listNode;
            ListNode working = start.next;
            while (start.next != null && working.val < start.val) {
                working = working.next;
            }
            list.add(working.val);
            listNode = listNode.next;
        }


        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

        return listToArray(list);
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

    private static int[] listToArray(List<Integer> list) {
        int[] ints = new int[list.size()];
        for (int i = list.size() - 1, j = 0; i >= 0; i--) {
            ints[j++] = list.get(i);
        }
        return ints;
    }
}
