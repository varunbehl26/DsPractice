package com.company.tree

fun maxDepth(root: TreeNode?): Int {
    root ?: return 0
    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1
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
