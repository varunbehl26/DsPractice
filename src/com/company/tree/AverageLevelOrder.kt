package com.company.tree

import java.util.*


fun averageOfLevels(root: TreeNode?): DoubleArray {
    root ?: doubleArrayOf()

    val list = ArrayList<Double>()
    val queue: Queue<TreeNode> = ArrayDeque()
    queue.offer(root)
    while (queue.isNotEmpty()) {
        val subList = ArrayList<Double>()
        for (i in 0 until queue.size) {
            val peekNode = queue.peek()
            if (peekNode != null) {
                if (peekNode.right != null) queue.offer(peekNode.right)
                if (peekNode.left != null) queue.offer(peekNode.left)
            }
            subList.add(queue.poll().`val`.toDouble())
        }
        val avg = subList.map { it }.average()
        list.add(avg)
    }
    val arr = list.map { it }.toTypedArray()
    return arr.toDoubleArray()
}


fun main() {
    val root = TreeNode(3)
    root.left = TreeNode(9)
    root.right = TreeNode(20)
    root.right?.left = TreeNode(15)
    root.right?.right = TreeNode(7)

    val array = averageOfLevels(root)
    array.forEach {
        println(it)
    }
}