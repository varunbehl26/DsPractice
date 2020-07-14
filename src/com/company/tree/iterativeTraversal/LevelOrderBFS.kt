package com.company.tree.iterativeTraversal

import com.company.tree.TreeNode
import java.util.*


object LevelOrderBFS {
    @JvmStatic
    fun main(args: Array<String>) {
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        root.left?.left = TreeNode(4)
        root.left?.right = TreeNode(5)
        val list = levelOrder(root)
        for (o in list) {
            println(o)
        }
    }

    private fun levelOrder(root: TreeNode?): List<List<Int>> {
        val queue: Queue<TreeNode> = LinkedList()
        val wrapList: MutableList<List<Int>> = LinkedList()
        if (root == null) return wrapList
        queue.add(root)
        while (queue.isNotEmpty()) {
            val levelNum = queue.size
            val subList: MutableList<Int> = LinkedList()
            for (i in 0 until levelNum) {
                val queuePoll = queue.poll()
                if (queuePoll != null) {
                    if (queuePoll.left != null) {
                        queue.add(queuePoll.left)
                    }
                    if (queuePoll.right != null) {
                        queue.add(queuePoll.right)
                    }
                }
                subList.add(queuePoll.value)
            }
            wrapList.add(subList)
        }
        return wrapList
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
                    levelList.addFirst(node.value)
                } else {
                    levelList.add(node.value)
                }
            }
            resultList.add(levelList)
            zigzag = !zigzag
        }
        return resultList
    }
}