package com.company.tree

import java.util.*


fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
    val leaves1: MutableList<Int?> = ArrayList()
    val leaves2: MutableList<Int?> = ArrayList()
    dfs(root1, leaves1)
    dfs(root2, leaves2)
    return leaves1 == leaves2
}

fun dfs(node: TreeNode?, leafValues: MutableList<Int?>) {
    if (node != null) {
        if (node.left == null && node.right == null) {
            leafValues.add(node.`val`)
        }
        dfs(node.left, leafValues)
        dfs(node.right, leafValues)
    }
}


fun main() {
//    val root1 = insertLevelOrder(arrayOf(3, 5, 1, 6, 2, 9, 8, null, null, 7, 4))
//    val root2 = insertLevelOrder(arrayOf(3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8))
//    print(leafSimilar(root1, root2))
}


