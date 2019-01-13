package com.company.tree;

import java.util.ArrayList;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}


public class InorderTraversalWORecursion extends BinaryTree {

    public static void main(String[] args) {
        InorderTraversalWORecursion tree = new InorderTraversalWORecursion();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

//
//        tree.root = new Node(1);
//        tree.root.right = new Node(2);
//        tree.root.right.left = new Node(3);


//        ArrayList<Integer> arrayList = tree.postOrderIterative(tree.root);
//        for (int i : arrayList) {
//            System.out.print(i);
//            System.out.print(" ");
//        }

    }

    private void inOrderTraverse() {
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node curr = root;

        while (curr != null || stack.size() > 0) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();

            System.out.println(curr.data);
            curr = curr.right;
        }
    }

    public ArrayList inorderTraversal(Node A) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        Stack<Node> stack = new Stack<Node>();
        Node curr = A;

        while (curr != null || stack.size() > 0) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            result.add(curr.data);
            curr = curr.right;
        }
        return result;
    }

    public ArrayList<Integer> postorderTraversal(TreeNode a) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode lastNode = null;

        while (!stack.isEmpty() || a != null) {
            if (a != null) {
                stack.push(a);
                a = a.left;
            } else {
                TreeNode peekNode = stack.peek();
                if (peekNode.right != null && lastNode != peekNode.right) {
                    a = peekNode.right;
                } else {
                    result.add(peekNode.val);
                    lastNode = stack.pop();
                }

            }
        }

        return result;

    }

    public void preorderTraversal(Node a) {

        // Base Case
        if (a == null) {
            return;
        }

        // Create an empty stack and push root to it
        Stack<Node> nodeStack = new Stack<Node>();
        nodeStack.push(root);

        /* Pop all items one by one. Do following for every popped item
         a) print it
         b) push its right child
         c) push its left child
         Note that right child is pushed first so that left is processed first */
        while (!nodeStack.empty()) {

            // Pop the top item from stack and print it
            Node peekNode = nodeStack.peek();
            System.out.print(peekNode.data + " ");
            nodeStack.pop();

            // Push right and left children of the popped node to stack
            if (peekNode.right != null) {
                nodeStack.push(peekNode.right);
            }
            if (peekNode.left != null) {
                nodeStack.push(peekNode.left);
            }
        }
    }
}
