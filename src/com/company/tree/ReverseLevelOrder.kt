package com.company.tree

import java.util.*


fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
    val list = mutableListOf<List<Int>>()
    if (root == null) return list
    val queue = ArrayDeque<TreeNode>()
    queue.add(root)
    while (queue.isNotEmpty()) {
        val sublist = mutableListOf<Int>()
        val size = queue.size
        for (i in 1..size) {
            val peekNode = queue.peek()
            sublist.add(peekNode.`val`)
            if (peekNode.left != null) queue.offer(peekNode.left)
            if (peekNode.right != null) queue.offer(peekNode.right)
            queue.pop()
        }
        list.add(sublist)
    }
    return list.reversed()
}

fun main() {
    val root = TreeNode(3)
    root.left = TreeNode(9)
    root.right = TreeNode(20)
    root.right?.left = TreeNode(15)
    root.right?.right = TreeNode(7)

    val list = levelOrderBottom(root)
    println(list)
}