package com.company.tree.toDiscuss;
//https://www.geeksforgeeks.org/print-left-view-binary-tree/
//https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1


import com.company.tree.BinaryTree;

public class LeftViewTree extends BinaryTree {

    private static int max_level = 0;

    public static void main(String[] args) {
        LeftViewTree tree = new LeftViewTree();
        tree.root = new Node(12);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(40);
        tree.leftView();
    }

    void leftViewUtil(BinaryTree.Node node, int level) {
        // Base Case
        if (node == null) return;

        // If this is the first node of its level
        if (max_level < level) {
            System.out.print(" " + node.data);
            max_level = level;
        }

        // Recur for left and right subtrees
        leftViewUtil(node.left, level + 1);
        leftViewUtil(node.right, level + 1);
    }

    // A wrapper over leftViewUtil()
    void leftView() {
        leftViewUtil(root, 1);
    }
}
