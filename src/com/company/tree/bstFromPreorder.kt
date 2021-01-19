package com.company.tree

//TODO
fun bstFromPreorder(preorder: IntArray?): TreeNode? {
    if (preorder == null || preorder.isEmpty()) return null
    val root = TreeNode(preorder[0])

    for (i in 1 until preorder.size) {
        generateBST(preorder[i], root)
    }

    return root
}

fun generateBST(target: Int, tree: TreeNode?) {
    var root = tree
    val node = TreeNode(target)
    while (root != null) {
        if (target < root.`val`) {
            if (root.left != null) {
                root = root.left
            } else {
                root.left = node
                break
            }
        } else {
            if (root.right != null) {
                root = root.right
            } else {
                root.right = node
                break
            }
        }
    }
}

fun main() {
    val root = bstFromPreorder(intArrayOf(8, 5, 1, 7, 10, 12))

    printLevelOrder(root)
}

var nodeIndex = 0
fun bstFromPreorderRecursive(preorder: IntArray?): TreeNode? {
    if (preorder == null) {
        return null
    }
    nodeIndex = 0
    return bstHelper(preorder, Int.MIN_VALUE, Int.MAX_VALUE)
}

private fun bstHelper(preorder: IntArray, start: Int, end: Int): TreeNode? {
    if (nodeIndex == preorder.size || preorder[nodeIndex] < start || preorder[nodeIndex] > end) {
        return null
    }
    val `val` = preorder[nodeIndex++]
    val node = TreeNode(`val`)
    node.left = bstHelper(preorder, start, `val`)
    node.right = bstHelper(preorder, `val`, end)
    return node
}