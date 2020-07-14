package com.company.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    void printLevelQueue() {
        Queue<Node> queue = new LinkedList();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node tmp = queue.poll();

            System.out.print(tmp.data + " ");
            if (tmp.left != null) {
                queue.add(tmp.left);
            }
            if (tmp.right != null) {
                queue.add(tmp.right);
            }
        }

    }

    public Node root;

    public BinaryTree() {
        root = null;
    }

    public int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            int lHeight = height(root.left);
            int rHeight = height(root.right);

            if (lHeight > rHeight) {
                return lHeight + 1;
            } else {
                return rHeight + 1;
            }
        }
    }

    public static class Node {
        public int data;
        public Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    private void printLevelRecursive() {
        int height = (int) height(root);
        for (int i = 0; i <= height; i++) {
            printGivenLevel(root, i);
        }
    }

    private void printGivenLevel(Node root, int level) {
        if (root == null) {
            return;
        } else if (level == 1) {
            System.out.print(root.data + " ");
        } else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }



}
