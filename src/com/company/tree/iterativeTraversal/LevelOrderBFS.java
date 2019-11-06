package com.company.tree.iterativeTraversal;

import com.company.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBFS {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left= new TreeNode(2);
        root.right= new TreeNode(3);
        root.left.left= new TreeNode(4);
        root.left.right= new TreeNode(5);

        List list= levelOrder(root);

        for (Object o : list) {
            System.out.println(o);
        }

    }

    private static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> wrapList = new LinkedList<>();

        if (root == null) return wrapList;

        queue.add(root);

        while (!queue.isEmpty()) {
            int levelNum = queue.size();

            List<Integer> subList = new LinkedList<>();
            for (int i = 0; i < levelNum; i++) {
                TreeNode peek = queue.peek();
                if (peek != null) {
                    if (peek.left != null) queue.add(peek.left);
                    if (peek.right != null) queue.add(peek.right);
                }
                subList.add(queue.poll().val);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }



}
