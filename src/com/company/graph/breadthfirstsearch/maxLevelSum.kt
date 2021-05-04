package com.company.graph.breadthfirstsearch

import com.company.tree.TreeNode
import com.company.tree.constructBTreeLevel
import java.util.*

fun maxLevelSum(root: TreeNode?): Int {
    if (root == null) return 0

    val queue = ArrayDeque<TreeNode>()
    val list: MutableList<Int> = mutableListOf()
    queue.offer(root)
    while (queue.isNotEmpty()) {
        val size = queue.size
        var currentTotal = 0
        for (i in 0 until size) {
            val poll = queue.poll()
            currentTotal += poll.`val`
            if (poll.left != null) {
                queue.offer(poll.left!!)
            }
            if (poll.right != null) {
                queue.offer(poll.right!!)
            }
        }
        list.add(currentTotal)
    }
    var maxIndex = 0
    var maxValue = Int.MIN_VALUE
    for ((index, i) in list.withIndex()) {
        if (i > maxValue) {
            maxValue = i
            maxIndex = index
        }
    }
    return maxIndex + 1

}

fun main() {
//    val tree = constructBTreeLevel(arrayOf(1, 7, 0, 7, -8, null, null))
//    val tree = constructBTreeLevel(arrayOf(989,null,10250,98693,-89388,null,null,null,-32127))
    val tree = constructBTreeLevel(arrayOf(-100, -200, -300, -20, -5, -10, null))
    println(maxLevelSum(tree))

}