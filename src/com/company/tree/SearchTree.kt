package com.company.tree

fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
    return if (root == null) {
        null
    } else {
        when {
            `val` < root.`val` -> {
                searchBST(root.left, `val`)
            }
            `val` > root.`val` -> {
                searchBST(root.right, `val`)
            }
            else -> {
                root
            }
        }
    }
}
