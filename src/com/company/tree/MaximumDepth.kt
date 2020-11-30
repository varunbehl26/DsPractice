package com.company.tree

private fun maxDepth(root: TreeNode?): Int {
    if (root == null) {
        return 0
    }
    val leftDepth = maxDepth(root.left)
    val rightDepth = maxDepth(root.right)
    return Math.max(leftDepth, rightDepth) + 1
}

fun main(args: Array<String>) {
    val root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left?.left = TreeNode(4)
    root.left?.right = TreeNode(5)
    val depth = maxDepth(root)
    println(depth)
}
