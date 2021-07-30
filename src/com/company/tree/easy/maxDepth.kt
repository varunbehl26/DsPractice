package com.company.tree.easy

import com.company.tree.TreeNode
import com.company.tree.constructBTreeLevel

/*
    Check the boundary condition and call the function again
    everytime incrementing by 1 and check who has more height by using math max
 */

fun maxDepth(root: TreeNode?): Int {
    root ?: return 0
    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1
}

fun main() {
    val root = constructBTreeLevel(arrayOf())
    println(maxDepth(root))
}