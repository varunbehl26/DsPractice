package com.company.tree

import java.util.*

fun isBalanced(root: TreeNode?): Boolean {
    root ?: return true
    val queue = ArrayDeque<TreeNode>()
    queue.add(root)
    while (queue.isNotEmpty()) {
        val pollNode = queue.poll()
        var lh = 0
        var rh = 0
        if (pollNode.left != null) {
            lh = maxDepth(pollNode.left)
            queue.add(pollNode.left)
        }
        if (pollNode.right != null) {
            rh = maxDepth(pollNode.right)
            queue.add(pollNode.right)
        }

        if (lh - rh >= 2 || rh - lh >= 2) {
            return false
        }
    }
    return true
}


fun main() {
    val node1 = constructBTreeLevel(arrayOf(3, 9, 20, null, null, 15, 7))
    println(isBalanced(node1))

    val node = constructBTreeLevel(arrayOf(1, 2, 2, 3, 3, null, null, 4, 4))
    println(isBalanced(node))

    val node2 = constructBTreeLevel(arrayOf())
    println(isBalanced(node2))
}