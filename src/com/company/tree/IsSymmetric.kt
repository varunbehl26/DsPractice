package com.company.tree

fun isSymmetric(root: TreeNode?): Boolean {
    return root == null || isSymmetricHelper(root.left, root.right)
}

private fun isSymmetricHelper(left: TreeNode?, right: TreeNode?): Boolean {
    if (left == null || right == null) {
        return left === right
    }
    return if (left.`val` == right.`val`) {
        isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left)
    } else {
        false
    }
}

fun main() {
    val root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(2)
    root.left?.left = TreeNode(3)
    root.left?.right = TreeNode(4)
    root.right?.left = TreeNode(5)
    root.right?.right = TreeNode(3)
    println(isSymmetric(root))
}
