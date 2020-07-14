package com.company.tree.iterativeTraversal;

import com.company.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



//Left->Root->Right
public class Inorder {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        list = inorderRecursive(root, list);

        for (Integer integer : list) {
            System.out.print(integer);
            System.out.print(" ");
        }


    }

    public static List<Integer> inorderTraversal(TreeNode root, List<Integer> list) {
       Stack<TreeNode> nodesStack=new Stack<>();

       TreeNode cur=root;
       //while tree is not fully traversed or stack is empty
       while (cur!=null ||!nodesStack.isEmpty()){

           //add left to stack and then start pulling
           while (cur!=null){
                nodesStack.push(cur);
                cur=cur.left;
           }

           //Poping from stack to get left node
           cur=nodesStack.pop();

           //Adding value to list
           list.add(cur.value);

           //moving towards right
           cur=cur.right;
       }
        return list;
    }


    public static List<Integer> inorderRecursive(TreeNode root, List<Integer> list){

        if (root==null){
            return list;
        }

        inorderTraversal(root.left,list);

        list.add(root.value);

        inorderTraversal(root.right,list);

        return list;

    }
}
