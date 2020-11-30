package com.company.tree

fun findTilt(root: TreeNode?): Int {
    if (root == null) return 0
    root.`val` = Math.abs(sumSubTree(root.left) - sumSubTree(root.right))
    return root.`val` + findTilt(root.left) + findTilt(root.right)
}

private fun sumSubTree(root: TreeNode?): Int {
    return if (root == null) {
        0
    } else {
        root.`val` + sumSubTree(root.left) + sumSubTree(root.right)
    }
}

fun main() {
    val tree = TreeNode(4)
    val left = TreeNode(2)
    left.left = TreeNode(3)
    left.right = TreeNode(5)

    val right = TreeNode(9)
    right.right = TreeNode(7)

    tree.left = left
    tree.right = right

//    val root = constructTreeInOrder(arrayOf(4, 2, 9, 3, 5, null, 7))
    println(findTilt(tree))
}