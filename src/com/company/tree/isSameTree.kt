package com.company.tree


fun isSameTree(root1: TreeNode?, root2: TreeNode?): Boolean {
    return when {
        root1 == null && root2 == null -> {
            true
        }
        root1?.`val` == root2?.`val` -> {
            isSameTree(root1?.left, root2?.left) && isSameTree(root1?.right, root2?.right)
        }
        else -> {
            false
        }
    }
}

fun main() {
//    val p = TreeNode(1)
//    p.left = TreeNode(2)
//    p.right = TreeNode(3)
//
//    val q = TreeNode(1)
//    q.left = TreeNode(2)
//    q.right = TreeNode(1)

    print(isSameTree(null, TreeNode(0)))
}