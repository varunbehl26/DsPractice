package com.company.easy.linkedlist;

public class LinkedList {

    ListNode head;

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        ListNode listNode = new ListNode(1);
        linkedList.head = listNode;
        listNode.next = new ListNode(2);
//        listNode.next.next = new ListNode(6);
//        listNode.next.next.next = new ListNode(7);

        ListNode listNode1 = new ListNode(2);
//        listNode1.next = new ListNode(2);
        listNode1.next = new ListNode(1);
//        listNode1.next.next = new ListNode(5);
        linkedList.head = mergeTwoLists(listNode, listNode1);

//        linkedList.head = linkedList.reverseList(linkedList.head);
//        linkedList.deleteNode(listNode.next.next);
//        linkedList.head = linkedList.removeNthFromEnd(linkedList.head, 2);

        System.out.println(linkedList.isPalindrome(linkedList.head));
//        linkedList.print();
//        System.out.println("------------");
//        linkedList.print();

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head = new ListNode(0);
        ListNode headIndex = head;

        while (l1 != null && l2 != null) {
            int value;
            if (l1.val <= l2.val) {
                value = l1.val;
                l1 = l1.next;
            } else {
                value = l2.val;
                l2 = l2.next;
            }
            headIndex.next = new ListNode(value);
            headIndex = headIndex.next;
        }

        if (l1 == null) headIndex.next = l2;
        if (l2 == null) headIndex.next = l1;

        return head.next;
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

    //TODO
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n < 1) {
            return head;
        }
        int length = findLength(head);
        int count = length - n + 1;

        ListNode prev = head;
        ListNode curr = prev;
        while (count >= 0) {
            curr = curr.next;
            count--;
        }
        prev = curr;
        return prev;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode reverse = reverseList(head);

        return false;
    }

    int findLength(ListNode headNode) {
        int curr = -1;
        while (headNode != null) {
            headNode = headNode.next;
            curr++;
        }
        return curr;
    }

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

    void print() {
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
}

