package com.company.tree

fun isUnivalTree(root: TreeNode?): Boolean {
    val rootValue = root?.`val`
    val list = mutableListOf<Int>()
    traverseInOrder(root, list = list)
    list.forEach {
        if (it != rootValue) {
            return false
        }
    }
    return true
}

fun traverseInOrder(root: TreeNode?, list: MutableList<Int>) {
    if (root == null) {
        return
    } else {
        traverseInOrder(root.left, list)
        list.add(root.`val`)
        traverseInOrder(root.right, list)
    }
}

fun isUnivalTreeRecursion(root: TreeNode): Boolean {
    return (root.left == null || root.left?.`val` == root.`val` && isUnivalTreeRecursion(root.left!!)) &&
            (root.right == null || root.right?.`val` == root.`val` && isUnivalTreeRecursion(root.right!!))
}


fun main() {
    val arr = arrayOf(1, 1, 1, 2, 1, null, 1)
    val node = constructBinarySearchTreeInOrder(arr)
    print(isUnivalTree(node))
}