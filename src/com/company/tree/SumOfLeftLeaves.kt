package com.company.tree

import java.util.*

fun sumOfLeftLeaves(root: TreeNode?): Int {
    if (root == null) return 0
    val queue = ArrayDeque<TreeNode>()
    queue.offer(root)
    var sum = 0
    while (queue.isNotEmpty()) {
        val peekNode = queue.poll()
        if (peekNode.left != null && peekNode.left?.left == null && peekNode.left?.right == null) {
            sum += peekNode.left!!.`val`
        }
        if (peekNode.left != null) {
            queue.offer(peekNode.left!!)
        }
        if (peekNode.right != null) {
            queue.offer(peekNode.right!!)
        }
    }
    return sum
}

fun main() {
    val tree = TreeNode(3)
    val left = TreeNode(9)

    val right = TreeNode(20)
    right.left = TreeNode(15)
    right.right = TreeNode(7)

    tree.left = left
    tree.right = right

    println(sumOfLeftLeaves(tree))
}