package com.company.gfg.tree

class SortedArrBST {
    inner class TreeNode internal constructor(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null

    }

    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        return helper(nums, 0, nums.size - 1)
    }

    private fun helper(nums: IntArray, start: Int, end: Int): TreeNode? {
        if (start > end) {
            return null
        }
        if (start == end) {
            return TreeNode(nums[start])
        }
        val mid = (start + end) / 2
        val node = TreeNode(nums[mid])
        node.left = helper(nums, start, mid - 1)
        node.right = helper(nums, mid + 1, end)
        return node
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val bst = SortedArrBST()
            val result = bst.sortedArrayToBST(intArrayOf(-10, -3, 0, 5, 9))
            println(result.toString())
        }
    }
}