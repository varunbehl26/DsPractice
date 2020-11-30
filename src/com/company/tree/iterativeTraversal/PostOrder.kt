package com.company.tree.iterativeTraversal

import com.company.tree.TreeNode
import java.util.*

object PostOrder {
    @JvmStatic
    fun main(args: Array<String>) {
        var list = LinkedList<Int?>()
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        root.left!!.left = TreeNode(4)
        root.left!!.right = TreeNode(5)
        list = postorderTraversal(root, list)
        for (i in list.indices) {
            print(list[i])
            print(" ")
        }
    }

    fun postorderTraversal(root: TreeNode?, list: LinkedList<Int?>?): LinkedList<Int?> {
        val result = LinkedList<Int?>()
        val stack: Deque<TreeNode> = ArrayDeque()
        var curr = root
        while (!stack.isEmpty() || curr != null) {
            curr = if (curr != null) {
                stack.push(curr)
                result.addFirst(curr.`val`) // Reverse the process of preorder
                curr.right // Reverse the process of preorder
            } else {
                val node = stack.pop()
                node.left // Reverse the process of preorder
            }
        }
        return result
    }

    fun postOrderRecursive(root: TreeNode?, linkedList: LinkedList<Int>): LinkedList<Int> {
        if (root == null) {
            return linkedList
        }
        postOrderRecursive(root.left, linkedList)
        postOrderRecursive(root.right, linkedList)
        linkedList.add(root.`val`)
        return linkedList
    }
}