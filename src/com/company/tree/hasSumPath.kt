package com.company.tree

fun hasPathSum(root: TreeNode?, sum: Int): Boolean {
    if (root == null) return false
    return if (root.left == null && root.right == null && root.`val` == sum) {
        true
    } else {
        hasPathSum(root.left, sum - root.`val`) || hasPathSum(root.right, sum - root.`val`)
    }
}

fun main() {
    val root = TreeNode(5)
    root.left = TreeNode(4)
    root.right = TreeNode(8)
    root.left?.left = TreeNode(11)
    root.left?.left?.left = TreeNode(7)
    root.left?.left?.right = TreeNode(2)
    root.right?.left = TreeNode(13)
    root.right?.right = TreeNode(4)
    println(hasPathSum(root, 22))
}
