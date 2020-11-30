package com.company.tree


//TODO
fun increasingBST(root: TreeNode?): TreeNode? {
    return increasingBSTHelper(root, null)
}

fun increasingBSTHelper(root: TreeNode?, tail: TreeNode?): TreeNode? {
    root ?: return tail
    val treeNode = increasingBSTHelper(root.left, root)
    root.left = null
    root.right = increasingBSTHelper(root.right, tail)
    return treeNode
}

fun main(args: Array<String>) {
    val arr = arrayOf(5, 3, 6, 2, 4, null, 8, 1, null, null, null, 7, 9)
    val node = constructBinarySearchTreeInOrder(arr)
    val bst = increasingBST(node)
    println(bst)

}
