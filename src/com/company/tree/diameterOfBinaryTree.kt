package com.company.tree
// refer this https://www.youtube.com/watch?v=9bCqmaIY2as
// There can be a subtree which does not include root
// a child node can have lot of left and rigth child, so a new path without root
fun diameterOfBinaryTree(root: TreeNode?): Int {
    val diameter = IntArray(1)
    height(root, diameter)
    return diameter[0]
}

private fun height(node: TreeNode?, diameter: IntArray): Int {
    if (node == null) return 0
    val lh = height(node.left, diameter)
    val rh = height(node.right, diameter)
    diameter[0] = Math.max(diameter[0], lh + rh)
    return 1 + Math.max(lh, rh)
}

fun main() {
    val root = constructBTreeLevel(arrayOf(4, -7, -3, null, null, -9, -3, 9, -7, -4, null, 6, null, -6, -6, null, null, 0, 6, 5, null, 9, null, null, -1, -4, null, null, null, -2))
    print(diameterOfBinaryTree(root))
}