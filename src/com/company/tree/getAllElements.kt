package com.company.tree

fun getAllElements(root1: TreeNode?, root2: TreeNode?): List<Int> {
    val list1 = mutableListOf<Int>()
    traverseInOrder(root1, list1)
    traverseInOrder(root2, list1)
    list1.sort()
    return list1
}


fun main() {
    val root1 = constructBinarySearchTree(arrayOf(2, 1, 4))
    val root2 = constructBinarySearchTree(arrayOf(1, 0, 3))
    val list = getAllElements(root1, root2)
    for (i in list) {
        println(i)
    }
}