package com.company.leetcodeDecember

import com.company.tree.TreeNode
import com.company.tree.constructBTreeLevel


fun maxDepth(root: TreeNode?): Int {
    root ?: return 0
    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1
}

fun main() {
    val root = constructBTreeLevel(arrayOf())
    println(maxDepth(root))
}