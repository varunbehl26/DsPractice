package com.company.tree

import java.util.*
//TODO

fun sumRootToLeaf(node: TreeNode?): Int {
    var root = node
    var sumRootToLeaf = 0
    var currNumber: Int

    val stack: Deque<Pair<TreeNode, Int>> = ArrayDeque()
    stack.push(Pair(root!!, 0))

    while (stack.isNotEmpty()) {
        val pair = stack.pop()
        root = pair.first
        currNumber = pair.second

        currNumber = currNumber shl 1 or root.`val`

        // if it's a leaf, update root-to-leaf sum
        if (root.left == null && root.right == null) {
            sumRootToLeaf += currNumber
        } else {
            stack.push(Pair(root.right!!, currNumber))
            stack.push(Pair(root.left!!, currNumber))
        }
    }
    return sumRootToLeaf
}

//---------------------------------------------------------------------------------------------\\
var rootToLeaf = 0

fun customPreorder(treeNode: TreeNode?, number: Int) {
    var currNumber = number
    if (treeNode != null) {
        //multiplied by 2 as there is a left shift
        currNumber = currNumber * 2 + treeNode.`val`

        // if it's a leaf, update root-to-leaf sum
        if (treeNode.left == null && treeNode.right == null) {
            rootToLeaf += currNumber
        }

        customPreorder(treeNode.left, currNumber)
        customPreorder(treeNode.right, currNumber)
    }
}

fun sumRootToLeafRecursive(root: TreeNode?): Int {
    customPreorder(root, 0)
    return rootToLeaf
}

fun main() {
    val arr = arrayOf(1, 0, 1, 0, 1, 0, 1, null, null)
    val node = constructBinarySearchTree(arr)
    val sum = sumRootToLeafRecursive(node)
    print(sum)
}