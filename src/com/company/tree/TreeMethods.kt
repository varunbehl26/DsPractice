package com.company.tree

import java.util.*


typealias Visitor<Int> = (Int) -> Unit

//left -> root -> right
fun traverseInOrder(root: TreeNode?, visit: Visitor<Int>) {
    if (root == null) {
        return
    }
    traverseInOrder(root.left, visit)
    visit(root.`val`)
    traverseInOrder(root.right, visit)
}

//root->left->right
fun traversePreOrder(root: TreeNode?, visit: Visitor<Int>) {
    if (root == null) {
        return
    }
    visit(root.`val`)
    traversePreOrder(root.left, visit)
    traversePreOrder(root.right, visit)
}

fun constructBinarySearchTree(arr: Array<Int?>): TreeNode? {
    var node = arr.get(0)?.let { TreeNode(it) }
    for (i in 1 until arr.size)
        if (arr[i] != null) {
            node = insertBst(node, arr[i]!!)
        }
    return node
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

    for (element in array) {
        integerQueue.offer(element)
    }
    val root = TreeNode(integerQueue.poll()!!)

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


