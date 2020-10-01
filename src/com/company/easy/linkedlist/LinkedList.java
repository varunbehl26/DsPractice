package com.company.easy.linkedlist;

public class LinkedList {

    public ListNode head;

    void insert(int value) {
        ListNode node = new ListNode(value);
        if (head == null) {
            head = node;
        } else {
            ListNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = node;
        }
    }

    public static void print(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            System.out.print(" ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        ListNode listNode = new ListNode(1);
        linkedList.head = listNode;
        listNode.next = new ListNode(2);
//        listNode.next.next = new ListNode(2);
//        listNode.next.next.next = new ListNode(1);

//        ListNode listNode1 = new ListNode(1);
//        listNode1.next = new ListNode(2);
//        listNode1.next = new ListNode(6);
//        listNode1.next.next = new ListNode(5);
//        linkedList.head = mergeTwoLists(listNode, listNode1);

//        linkedList.head = linkedList.reverseList(linkedList.head);
//        linkedList.deleteNode(listNode.next.next);
//        linkedList.head = linkedList.removeNthFromEnd(linkedList.head, 2);

        linkedList.print(linkedList.head);
//        System.out.println("------------");
//        linkedList.print();

    }

    public void deleteNodeValue(ListNode node) {
        ListNode start = null;
        ListNode after = head;

        while (after.val != node.val) {
            start = after;
            after = after.next;
        }
        if (start != null) {
            start.next = after.next;
        }
    }

    public void deleteNode(ListNode node) {
        System.out.println(node.val);
        node.val = node.next.val;
        node.next = node.next.next;
    }

}

