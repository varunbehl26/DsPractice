package com.company.tree.easy

import com.company.tree.TreeNode
import com.company.tree.printLevelOrder


/*
    The logic is simple
    Use one tree and keep adding the second one using recursion

 */
fun mergeTrees(t1: TreeNode?, t2: TreeNode?): TreeNode? {
    when {
        t1 == null -> {
            return t2
        }
        t2 == null -> {
            return t1
        }
        else -> {
            t1.`val` = t1.`val` + t2.`val`
            t1.left = mergeTrees(t1.left, t2.left)
            t1.right = mergeTrees(t1.right, t2.right)
        }
    }
    return t1
}

fun main(args: Array<String>) {
    val root = TreeNode(1)
    root.left = TreeNode(3)
    root.right = TreeNode(2)
    root.left?.left = TreeNode(5)
    val root1 = TreeNode(2)
    root1.left = TreeNode(1)
    root1.right = TreeNode(3)
    root1.left?.right = TreeNode(4)
    root1.right?.right = TreeNode(7)
    val merged = mergeTrees(root, root1)
    printLevelOrder(merged)

}