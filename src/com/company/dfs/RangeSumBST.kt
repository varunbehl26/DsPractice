package com.company.dfs

import com.company.tree.TreeNode
import java.util.*

object RangeSumBST {
    //using recursion dfs
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        if (root == null) {
            return 0
        }
        var sum = 0

        // left child is a possible candidate.
        if (root.`val` > low) {
            sum += rangeSumBST(root.left, low, high)
        }

        // right child is a possible candidate.
        if (root.`val` < high) {
            sum += rangeSumBST(root.right, low, high)
        }

        // count root in.
        if (root.`val` >= low && root.`val` <= high) {
            sum += root.`val`
        }
        return sum
    }

    //iterative
    fun rangeSumBSTIterative(root: TreeNode?, L: Int, H: Int): Int {
        val stack = Stack<TreeNode?>()
        stack.push(root)
        var sum = 0
        while (!stack.isEmpty()) {
            val treeNode = stack.pop() ?: continue
            if (treeNode.`val` < L) {
                stack.push(treeNode.left)
            }
            if (treeNode.`val` > H) {
                stack.push(treeNode.right)
            }
            if (treeNode.`val` >= L && treeNode.`val` <= H) {
                sum += treeNode.`val`
            }
        }
        return sum
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val root = TreeNode(10)
        root.left = TreeNode(5)
        root.right = TreeNode(15)
        root.left!!.left = TreeNode(3)
        root.left!!.right = TreeNode(7)
        //        root.left.left.left = new TreeNode(7);
//        root.left.left.right = new TreeNode(7);
//        root.right.left = new TreeNode(13);
        root.right!!.right = TreeNode(18)
        println(rangeSumBST(root, 7, 15))
    }
}