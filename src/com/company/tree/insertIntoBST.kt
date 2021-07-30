package com.company.tree

fun insertIntoBST(root: TreeNode?, `val`: Int): TreeNode? {
    root ?: return TreeNode(`val`)
    if (`val` < root.`val`) {
        root.left = insertIntoBST(root.left, `val`)
    } else {
        root.right = insertIntoBST(root.right, `val`)
    }
    return root
}

fun insertIntoBSTIterative(root: TreeNode?, `val`: Int): TreeNode? {
    root ?: return TreeNode(`val`)
    var curr = root
    var prev: TreeNode? = null
    while (curr != null) {
        prev = curr
        curr = if (`val` > curr.`val`) {
            curr.right
        } else {
            curr.left
        }
    }
    if (`val` > prev!!.`val`) {
        prev.right = TreeNode(`val`)
    } else {
        prev.left = TreeNode(`val`)
    }
    return root
}

fun main() {
    val root = constructBinarySearchTree(arrayOf(4, 2, 7, 1, 3))
    val tree = insertIntoBST(root, 5)
    traverseInOrder(tree) { println(it) }

}