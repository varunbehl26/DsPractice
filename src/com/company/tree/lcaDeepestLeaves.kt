package com.company.tree

fun lcaDeepestLeaves(root: TreeNode?): TreeNode? {
    return depth(root)?.second
}

private fun depth(root: TreeNode?): Pair<Int?, TreeNode?>? {
    if (root == null) return Pair(0, null)

    val left = depth(root.left)
    val right = depth(root.right)

    val leftHeight: Int? = left?.first
    val rightHeight: Int? = right?.first

    if (leftHeight != null && rightHeight != null) {
        return if (leftHeight == rightHeight) {
            Pair(leftHeight + 1, root)
        } else if (leftHeight < rightHeight) {
            Pair(rightHeight + 1, right.second)
        } else {
            Pair(leftHeight + 1, left.second)
        }
    }
    return Pair(0, null)
}

fun main() {
    val node = constructBTreeLevel(arrayOf(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4))
    val output = lcaDeepestLeaves(node)
    traversePreOrder(output) {
        println(it)
    }
}