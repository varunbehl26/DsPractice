package com.company.tree.iterativeTraversal

import com.company.tree.TreeNode

fun printPostorder(node: TreeNode?) {
    if (node == null) return

    // first recur on left subtree
    printPostorder(node.left)

    // then recur on right subtree
    printPostorder(node.right)

    // now deal with the node
    print(node.`val`.toString() + " ")
}

/* Given a binary tree, print its nodes in inorder*/
fun printInorder(node: TreeNode?) {
    if (node == null) return

    /* first recur on left child */
    printInorder(node.left)

    /* then print the data of node */
    print(node.`val`.toString() + " ")

    /* now recur on right child */
    printInorder(node.right)
}

/* Given a binary tree, print its nodes in preorder*/
fun printPreorder(node: TreeNode?) {
    if (node == null) return

    /* first print data of node */
    print(node.`val`.toString() + " ")

    /* then recur on left sutree */
    printPreorder(node.left)

    /* now recur on right subtree */
    printPreorder(node.right)
}


fun main() {
    val root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left?.left = TreeNode(4)
    root.left?.right = TreeNode(5)

    println("Preorder traversal of binary tree is ")
    printPreorder(root)

    println("\nInorder traversal of binary tree is ")
    printInorder(root)

    println("\nPostorder traversal of binary tree is ")
    printPostorder(root)
}

