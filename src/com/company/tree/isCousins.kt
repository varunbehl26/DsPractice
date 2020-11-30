package com.company.tree

import java.util.*

//When the question require to get values from left and right simultaneously use queue
fun isCousins(root: TreeNode?, x: Int, y: Int): Boolean {

    if (root == null) return false

    val queue: Queue<TreeNode?> = LinkedList()
    queue.offer(root)

    while (queue.isNotEmpty()) {
        val size: Int = queue.size

        var foundX = false
        var foundY = false

        for (i in 0 until size) {
            val peekNode = queue.poll()
            if (peekNode?.`val` == x) foundX = true

            if (peekNode?.`val` == y) foundY = true

            //cousins only if same depth but different parents
            if (peekNode?.left != null && peekNode.right != null) {
                if (peekNode.left?.`val` == x && peekNode.right?.`val` == y ||
                        peekNode.left?.`val` == y && peekNode.right?.`val` == x) {
                    return false
                }
            }

            if (peekNode?.left != null) {
                queue.offer(peekNode.left)
            }
            if (peekNode?.right != null) {
                queue.offer(peekNode.right)
            }
        }

        if (foundX && foundY) return true

    }
    return false
}

fun main() {
    val root = constructBTreeLevel(arrayOf(1, 2, 3, null, 4))
    println(isCousins(root, 2, 3))
}