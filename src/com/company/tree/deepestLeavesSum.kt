package com.company.tree

import java.util.*

//fun deepestLeavesSum(root: TreeNode?): Int {
//    if (root == null) {
//        return 0
//    }
//    if (root.left == null && root.right == null) {
//        return root.`val`
//    }
//    return deepestLeavesSum(root.left) + deepestLeavesSum(root.right)
//}
fun deepestLeavesSum(root: TreeNode?): Int {
    if (root == null) return 0
    val queue = ArrayDeque<TreeNode>()
    queue.add(root)
    val maxDepth = maxCustomDepth(root)
    var count = 0
    var sum = 0
    while (queue.isNotEmpty()) {
        val size = queue.size
        for (i in 0 until size) {
            val popNode = queue.pop()
            if (popNode.left == null && popNode.right == null && count == maxDepth - 1) {
                sum += popNode.`val`
                println("popNode.`val` = ${popNode.`val`}")
                println("count = $count")
            }
            if (popNode.left != null) queue.add(popNode.left)
            if (popNode.right != null) queue.add(popNode.right)
        }
        count++
    }
    return sum
}

fun maxCustomDepth(root: TreeNode?): Int {
    if (root == null) return 0
    val left = maxCustomDepth(root.left)
    val right = maxCustomDepth(root.right)

    return Math.max(left, right) + 1
}

fun main() {
    val root = constructBTreeLevel(arrayOf(1, 2, 3, 4, 5, null, 6, 7, null, null, null, null, 8))
//    println(maxCustomDepth(root))
    print(deepestLeavesSum(root))
}