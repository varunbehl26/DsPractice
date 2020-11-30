package com.company.tree

fun height(root: TreeNode?): Int {
    return if (root == null) {
        0
    } else {
        val lHeight = height(root.left)
        val rHeight = height(root.right)
        if (lHeight > rHeight) {
            lHeight + 1
        } else {
            rHeight + 1
        }
    }
}
