package com.company.tree


fun bstFromPreorder(preorder: IntArray): TreeNode? {
    return if (preorder.isNotEmpty()) {
        val treeNode = TreeNode(preorder[0])
        for (i in 1 until preorder.size) {
            insertIntoBST(treeNode, preorder[i])
        }
        treeNode
    } else {
        null;
    }
}


fun main() {
    val root = bstFromPreorder(intArrayOf(8, 5, 1, 7, 10, 12))

    printLevelOrder(root)
}
