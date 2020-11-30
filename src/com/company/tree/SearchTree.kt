package com.company.tree

object SearchTree {
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        return if (root == null) {
            null
        } else {
            if (`val` < root.`val`) {
                searchBST(root.left, `val`)
            } else if (`val` > root.`val`) {
                searchBST(root.right, `val`)
            } else {
                root
            }
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val root1 = TreeNode(4)
        root1.left = TreeNode(2)
        root1.right = TreeNode(7)
        root1.left?.left = TreeNode(1)
        root1.left?.right = TreeNode(3)
        val search = searchBST(root1, 2)
        println(search.toString())
    }
}