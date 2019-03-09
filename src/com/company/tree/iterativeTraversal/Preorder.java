package com.company.tree.iterativeTraversal;


import com.company.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//PreOrder
//Root->Left->Right
class Preorder {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        list = preorderTraversal(root, list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print(" ");
        }


    }

    public static List<Integer> preorderTraversal(TreeNode root, List<Integer> list) {
        Stack<TreeNode> rightNode = new Stack<>();

        while (root != null) {
            //adding root value
            list.add(root.val);

            //if right is not null adding to stack
            if (root.right != null) {
                rightNode.push(root.right);
            }

            //after root going towards left
            root = root.left;

            //poping from stack if node doesnt have a left node
            if (root == null && !rightNode.isEmpty()) {
                root = rightNode.pop();
            }

        }

        return list;
    }


    public static  List<Integer> preOrder(TreeNode root, List<Integer> list){
        //root->left->right;
        Stack<TreeNode> rightNodes=new Stack<>();

        if (root==null){
            return list;
        }

        while (root!=null){
            list.add(root.val);

            if (root.right!=null){
                rightNodes.add(root.right);
            }
            root=root.left;

            if (root==null && !rightNodes.isEmpty()){
                root=rightNodes.pop();
            }
        }
        return list;

    }

    public static List<Integer> preOrderRecursive(TreeNode root, List<Integer> list) {

        if (root == null)
            return list;

        /* first print data of node */
        list.add(root.val);

        /* then recur on left sutree */
        preOrderRecursive(root.left, list);

        /* now recur on right child */
        preOrderRecursive(root.right, list);

        return list;
    }

}

