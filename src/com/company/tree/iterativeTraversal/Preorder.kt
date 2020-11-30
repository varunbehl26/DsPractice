package com.company.tree.iterativeTraversal

import com.company.tree.TreeNode
import java.util.*

//PreOrder
//Root->Left->Right

fun preorderTraversal(root: TreeNode?, list: MutableList<Int?>): MutableList<Int?> {
    var root = root
    val rightNode = Stack<TreeNode?>()
    while (root != null) {
        //adding root value
        list.add(root.`val`)

        //if right is not null adding to stack
        if (root.right != null) {
            rightNode.push(root.right)
        }

        //after root going towards left
        root = root.left

        //poping from stack if node doesnt have a left node
        if (root == null && !rightNode.isEmpty()) {
            root = rightNode.pop()
        }
    }
    return list
}

fun preOrder(root: TreeNode?, list: MutableList<Int>): List<Int> {
    //root->left->right;
    var root = root
    val rightNodes = Stack<TreeNode?>()
    if (root == null) {
        return list
    }
    while (root != null) {
        list.add(root.`val`)
        if (root.right != null) {
            rightNodes.add(root.right)
        }
        root = root.left
        if (root == null && !rightNodes.isEmpty()) {
            root = rightNodes.pop()
        }
    }
    return list
}

fun preOrderRecursive(root: TreeNode?, list: MutableList<Int>): List<Int> {
    if (root == null) return list

    /* first print data of node */list.add(root.`val`)

    /* then recur on left sutree */preOrderRecursive(root.left, list)

    /* now recur on right child */preOrderRecursive(root.right, list)
    return list

}