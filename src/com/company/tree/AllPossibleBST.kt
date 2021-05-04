package com.company.tree

import java.util.*

//TODO Confusing
object AllPossibleBST {
    fun allPossibleFBT(N: Int): List<TreeNode> {
        if (N <= 0) {
            return ArrayList()
        }

        val dp = Array<MutableList<TreeNode>>(N + 1) { i -> ArrayList() }
        dp[1].add(TreeNode(0))

        var numNode = 1

        while (numNode <= N) {
            var leftNode = 1
            while (leftNode < numNode) {
                for (left in dp[leftNode]) {
                    for (right in dp[numNode - 1 - leftNode]) {
                        val root = TreeNode(0)
                        root.left = left
                        root.right = right
                        dp[numNode].add(root)
                    }
                }
                leftNode += 2
            }
            numNode += 2
        }
        return dp[N]
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val node = allPossibleFBT(7)
        node.forEach {
            printLevelOrder(it)
            println()
        }
    }
}