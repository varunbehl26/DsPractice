package com.company.LinkedList;

public class MiddleElementList extends MyLinkedList {

    public static void main(String[] args) {
        MiddleElementList list = new MiddleElementList();
        list.insert(5);
        list.insert(4);
        list.insert(2);
        list.insert(9);
        list.insert(7);
        list.insert(10);
        System.out.println(list.findMiddleElement());
    }

    int findMiddleElement() {
        if (isEmpty()) {
            return -1;
        } else {
            Node currentNode = head;
            Node fastNode = head;
            while (fastNode != null && fastNode.next != null) {
                fastNode = fastNode.next.next;
                currentNode = currentNode.next;
            }
            return currentNode.data;
        }
    }

}
