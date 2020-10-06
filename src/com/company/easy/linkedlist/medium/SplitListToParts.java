package com.company.easy.linkedlist.medium;

import com.company.easy.linkedlist.LinkedList;
import com.company.easy.linkedlist.ListNode;

public class SplitListToParts extends LinkedList {

    //creating new linkedList
    public static ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] result = new ListNode[k];
        int[] lengths = cal(findLength(root), k);
        if (lengths == null || lengths.length == 0) {
            result = new ListNode[k];
            ;
        } else {
            for (int j = 0; j < lengths.length; j++) {
                int length = lengths[j];
                ListNode listNode = new ListNode(0);
                ListNode rootCopy = root;
                if (rootCopy != null) {
                    for (int i = 0; i < length; i++) {
                        insert(listNode, rootCopy.val);
                        rootCopy = rootCopy.next;
                    }
                    root = rootCopy;
                    result[j] = listNode.next;
                }
                listNode.next = rootCopy;

            }
        }

        return result;
    }

    static int[] cal(int listLength, int division) {
        if (division == 0) {
            return null;
        }
        int[] resultArray = new int[division];

        int len = listLength / division;
        int rem = listLength - (len * division);

        for (int i = 0; i < division; i++) {
            if (rem > 0) {
                resultArray[i] = len + 1;
                rem--;
            } else {
                resultArray[i] = len;
            }
        }

        return resultArray;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            insert(listNode, arr[i]);
        }

        ListNode[] node = splitListToParts(listNode.next, 12);

        for (int i = 0; i < node.length; i++) {
            print(node[i]);
            System.out.println("------------");
        }
    }
}
