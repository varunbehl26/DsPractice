package com.company.tree.iterativeTraversal

import com.company.tree.TreeNode
import java.util.*

//Left, Right, Root
fun postorderTraversal(root: TreeNode?): List<Int?> {
    var root = root
    val list = mutableListOf<Int>()
    val stack = Stack<TreeNode>()

    while (stack.isNotEmpty() || root != null) {
        if (root != null) {
            stack.add(root)
            root = root.left
        } else {
            var peekNode = stack.peek().right
            if (peekNode == null) {
                peekNode = stack.pop()
                list.add(peekNode.`val`)
                while (stack.isNotEmpty() && peekNode === stack.peek().right) {
                    peekNode = stack.pop()
                    list.add(peekNode.`val`)
                }
            } else {
                root = peekNode
            }
        }
    }
    return list
}

fun postOrderRecursive(root: TreeNode?, linkedList: MutableList<Int>): MutableList<Int> {
    root ?: return linkedList
    postOrderRecursive(root.left, linkedList)
    postOrderRecursive(root.right, linkedList)
    linkedList.add(root.`val`)
    return linkedList
}

fun main() {
    val root = TreeNode(1)
    val left = TreeNode(2)
    val right = TreeNode(3)
    val leftLeft = TreeNode(4)
    val leftRight = TreeNode(5)

    root.left = left
    root.right = right
    root.left!!.left = leftLeft
    root.left!!.right = leftRight

    val list1 = postorderTraversal(root)
    for (i in list1) {
        print(i)
        print(" ")
    }
}