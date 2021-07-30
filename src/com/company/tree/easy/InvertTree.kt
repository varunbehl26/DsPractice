package com.company.tree.easy

import com.company.tree.TreeNode
import com.company.tree.constructBinarySearchTree
import com.company.tree.traverseInOrder
import java.util.*


//BFS with slight modification
fun invertTree(root: TreeNode?): TreeNode? {
    if (root == null) return null

    val queue: Queue<TreeNode> = ArrayDeque()
    queue.offer(root)

    while (queue.isNotEmpty()) {
        val node: TreeNode = queue.poll()

        val temp = node.left
        node.left = node.right
        node.right = temp

        if (node.left != null) queue.offer(node.left)
        if (node.right != null) queue.offer(node.right)

    }
    return root
}

//Recursive
fun invertTreeRecursive(root: TreeNode?): TreeNode? {
    if (root == null) return null

    val tempNode = root.left
    root.left = root.right
    root.right = tempNode

    invertTreeRecursive(root.left)
    invertTreeRecursive(root.right)

    return root
}

fun main() {
    val root = constructBinarySearchTree(arrayOf(4, 2, 7, 1, 3, 6, 9))
    val invertRoot = invertTree(root)
    traverseInOrder(invertRoot) { print(it) }

}