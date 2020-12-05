package com.company.tree

var max = 0

fun findMode(root: TreeNode?): IntArray {
    val list = mutableListOf<Int>()
    val map = hashMapOf<Int, Int>()
    traverseInOrder(root, map)
    for (key in map.keys) {
        if (map[key] == max) {
            list.add(key)
        }
    }
    return list.toIntArray()
}

fun traverseInOrder(root: TreeNode?, map: MutableMap<Int, Int>) {
    if (root == null) {
        return
    } else {
        map.put(root.`val`, map.getOrDefault(root.`val`, 0) + 1)
        max = Math.max(max, map.getOrDefault(root.`val`, 0))
        traverseInOrder(root.left, map)
        traverseInOrder(root.right, map)
    }
}


fun main() {
    val node = constructBinarySearchTreeInOrder(arrayOf(1, 2, null, 3))
    val array = findMode(node)
    array.forEach { println(it) }
}