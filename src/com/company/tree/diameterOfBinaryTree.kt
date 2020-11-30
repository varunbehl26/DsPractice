package com.company.tree

fun diameterOfBinaryTree(root: TreeNode?): Int {
    if (root == null) return 0


}

fun main() {
    val root = constructBTreeLevel(arrayOf(1, 2, 3, 4, 5))
    print(diameterOfBinaryTree(root))
}