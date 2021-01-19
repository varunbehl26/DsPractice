package com.company.tree.iterativeTraversal

import com.company.tree.TreeNode
import com.company.tree.constructBTreeLevel
import java.util.*


private fun levelOrder(root: TreeNode?): List<List<Int>> {
    val queue: Queue<TreeNode> = LinkedList()
    val list: MutableList<List<Int>> = LinkedList()
    if (root == null) return list
    queue.add(root)
    while (queue.isNotEmpty()) {
        val size = queue.size
        val subList: MutableList<Int> = LinkedList()
        for (i in 0 until size) {
            val queuePoll = queue.poll()
            if (queuePoll != null) {
                if (queuePoll.left != null) {
                    queue.add(queuePoll.left)
                }
                if (queuePoll.right != null) {
                    queue.add(queuePoll.right)
                }
            }
            subList.add(queuePoll.`val`)
        }
        list.add(subList)
    }
    return list
}


fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
    val resultList: MutableList<List<Int>> = ArrayList()
    if (root == null) {
        return resultList
    }
    val queue: Queue<TreeNode> = LinkedList()
    queue.add(root)

    var zigzag = false
    while (queue.isNotEmpty()) {
        val levelList = LinkedList<Int>()
        for (i in 0 until queue.size) {
            val node = queue.poll()
            if (node.left != null) {
                queue.add(node.left)
            }
            if (node.right != null) {
                queue.add(node.right)
            }
            if (zigzag) {
                levelList.addFirst(node.`val`)
            } else {
                levelList.add(node.`val`)
            }
        }
        resultList.add(levelList)
        zigzag = !zigzag
    }
    return resultList
}

fun main() {
    val root = constructBTreeLevel(arrayOf(1, 2, 3, 4, 5, null, 6, 7, null, null, null, null, 8))
    val list = levelOrder(root)
    for (list in list) {
        for (i in list) {
            print(i)
            print(" ")
        }
        println()
    }
}
