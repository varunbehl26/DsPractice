package com.company.tree

import java.util.*

fun sumEvenGrandparent(root: TreeNode?): Int {
    var sum = 0
    val queue = ArrayDeque<TreeNode>()
    queue.add(root!!)
    while (queue.isNotEmpty()) {
        val peekNode = queue.pop()

        if (peekNode.left != null) {
            if (peekNode.`val` % 2 == 0) {
                sum += (peekNode.left?.left?.`val` ?: 0) + (peekNode.left?.right?.`val` ?: 0)
            }
            queue.add(peekNode.left!!)
        }
        if (peekNode.right != null) {
            if (peekNode.`val` % 2 == 0) {
                sum += (peekNode.right?.left?.`val` ?: 0) + (peekNode.right?.right?.`val` ?: 0)
            }
            queue.add(peekNode.right!!)
        }
    }
    return sum
}

var sum = 0

fun sumEvenGrandparentRecursive(root: TreeNode?): Int {
    dfs(root, null, null)
    return sum
}

fun dfs(current: TreeNode?, parent: TreeNode?, grandParent: TreeNode?) {
    if (current == null) return  // base case
    if (grandParent != null && grandParent.`val` % 2 == 0) {
        sum += current.`val`
    }
    dfs(current.left, current, parent) // ( newChild, parent, GrandParent)
    dfs(current.right, current, parent)
}

fun main() {
//    val root = constructBTreeLevel(arrayOf(6, 7, 8, 2, 7, 1, 3, 9, null, 1, 4, null, null, null, 5))
//    val root = constructBTreeLevel(arrayOf(50,null,54,98,6,null,null,null,34))
    val root = constructBTreeLevel(arrayOf(61, 13, 46, null, null, null, 56, 72))
    println(sumEvenGrandparent(root))
}