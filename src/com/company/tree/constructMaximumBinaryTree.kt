package com.company.tree

import java.util.*

fun constructMaximumBinaryTree(nums: IntArray): TreeNode? {
    if (nums.isEmpty()) {
        return null
    }
    val max = findMax(nums)
    val leftArray = nums.sliceArray(IntRange(0, nums.indexOf(max) - 1))
    val rightArray = nums.sliceArray(IntRange(nums.indexOf(max) + 1, nums.lastIndex))
    return constructHelper(max, leftArray, rightArray)
}

fun constructHelper(max: Int, leftArray: IntArray, rightArray: IntArray): TreeNode? {
    val treeNode = TreeNode(max)
    if (leftArray.isNotEmpty()) {
        treeNode.left = constructMaximumBinaryTree(leftArray)
    }
    if (rightArray.isNotEmpty()) {
        treeNode.right = constructMaximumBinaryTree(rightArray)
    }
    return treeNode
}

fun findMax(nums: IntArray): Int {
    var max = nums[0]
    nums.forEach {
        max = Math.max(max, it)
    }
    return max
}

//Did not understand but
fun constructMaximumBinaryTreeOptimised(nums: IntArray): TreeNode? {
    val stack: LinkedList<TreeNode> = LinkedList()
    nums.forEach { num ->
        val cur = TreeNode(num)
        while (stack.isNotEmpty() && stack.peekFirst().`val` < cur.`val`) {
            cur.left = stack.pop()
        }
        if (stack.isNotEmpty()) {
            stack.peekFirst().right = cur
        }
        stack.push(cur)
    }
    return stack.peekLast()
}

fun main() {
    val nums = intArrayOf(3, 2, 1, 6, 0, 5)
    val node = constructMaximumBinaryTreeOptimised(nums)
    printLevelOrder(node)
}