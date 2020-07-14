package com.company.tree

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

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    if (p == null && q == null) {
        return true
    } else if (p?.value == q?.value && p?.value == q?.value) {
        return isSameTree(p?.left, q?.left) && isSameTree(p?.right, q?.right)
    }
    return false
}