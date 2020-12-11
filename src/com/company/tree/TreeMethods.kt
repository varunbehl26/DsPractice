package com.company.tree

import java.util.*
import kotlin.collections.ArrayList

typealias Visitor<Int> = (Int) -> Unit

fun traverseInOrder(root: TreeNode?, visit: Visitor<Int>) {
    if (root == null) {
        return
    }
    traverseInOrder(root.left, visit)
    visit(root.`val`)
    traverseInOrder(root.right, visit)
}

fun constructBinarySearchTreeInOrder(arr: Array<Int?>): TreeNode {
    var node = arr[0]?.let { TreeNode(it) }
    for (i in 1 until arr.size)
        if (arr[i] != null) {
            node = insertBst(node, arr[i]!!)
        }
    return node!!
}


private fun insertBst(node: TreeNode?, value: Int): TreeNode {
    node ?: return TreeNode(value)
    if (value < node.`val`) {
        node.left = insertBst(node.left, value)
    } else {
        node.right = insertBst(node.right, value)
    }
    return node
}

fun constructBTreeLevel(array: Array<Int?>?): TreeNode? {
    if (array.isNullOrEmpty()) return null

    val treeNodeQueue: Queue<TreeNode> = ArrayDeque()

    val integerQueue: Queue<Int?> = LinkedList()

    val root = TreeNode(array[0]!!)

    for (i in 1 until array.size) {
        integerQueue.offer(array[i])
    }

    treeNodeQueue.offer(root)

    while (integerQueue.isNotEmpty()) {
        val leftVal = integerQueue.poll()
        val rightVal = integerQueue.poll()

        val peekNode = treeNodeQueue.poll()

        if (leftVal != null) {
            val left = TreeNode(leftVal)
            peekNode.left = left
            treeNodeQueue.offer(left)
        }
        if (rightVal != null) {
            val right = TreeNode(rightVal)
            peekNode.right = right
            treeNodeQueue.offer(right)
        }
    }
    return root
}

fun levelOrder(root: TreeNode?): MutableList<Int> {
    val list = ArrayList<Int>()
    if (root == null) {
        return list
    }
    val queue: Queue<TreeNode> = LinkedList()
    queue.offer(root)
    while (queue.isNotEmpty()) {
        val subList = ArrayList<Int>()
        for (i in 0 until queue.size) {
            val peekNode = queue.peek()
            if (peekNode != null) {
                if (peekNode.right != null) queue.offer(peekNode?.right)
                if (peekNode.left != null) queue.offer(peekNode.left)
            }
            subList.add(queue.poll().`val`)
        }
        list.addAll(subList)
    }
    return list
}

fun printLevelOrder(root: TreeNode?) {
    val queue: Queue<TreeNode> = ArrayDeque()
    if (root != null) {
        queue.offer(root)

        while (queue.isNotEmpty()) {
            val poolNode = queue.poll()

            print("${poolNode.`val`} ")

            if (poolNode.left != null) queue.offer(poolNode.left)
            if (poolNode.right != null) queue.offer(poolNode.right)
        }
    }
}


