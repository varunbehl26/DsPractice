package com.company.tree.iterativeTraversal;

import com.company.tree.TreeNode;

import java.util.*;

public class PostOrder {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        list = postorderTraversal(root, (LinkedList<Integer>) list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print(" ");
        }

    }


    public static LinkedList<Integer> postorderTraversal(TreeNode root, LinkedList<Integer> list) {
        LinkedList<Integer> result = new LinkedList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = root;

        while(!stack.isEmpty() || curr != null) {

            if(curr != null) {
                stack.push(curr);
                result.addFirst(curr.val);  // Reverse the process of preorder
                curr = curr.right;             // Reverse the process of preorder
            } else {
                TreeNode node = stack.pop();
                curr = node.left;           // Reverse the process of preorder
            }

        }
        return result;

      }

    public static LinkedList<Integer> postOrderRecursive(TreeNode root,LinkedList<Integer> linkedList){
        if (root==null){
            return linkedList;
        }
        postOrderRecursive(root.left,linkedList);
        postOrderRecursive(root.right,linkedList);
        linkedList.add(root.val);
        return linkedList;
    }

}