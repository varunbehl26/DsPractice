package com.company.tree

import com.company.tree.iterativeTraversal.inorderRecursive
import java.util.*


fun findTarget(root: TreeNode?, i: Int): Boolean {
    val hashSet = hashSetOf<Int>()
    return findTargetHelper(root, i, hashSet)
}

fun findTargetHelper(root: TreeNode?, target: Int, hashSet: HashSet<Int>): Boolean {
    if (root == null) return false
    if (hashSet.contains(target - root.`val`)) return true
    hashSet.add(root.`val`)
    return findTargetHelper(root.left, target, hashSet) || findTargetHelper(root.right, target, hashSet)
}


//Inorder traversal makes the tree sorted and then values can be searched
fun findTargetInorderVersion(root: TreeNode?, k: Int): Boolean {
    val nums: MutableList<Int> = ArrayList()
    inorderRecursive(root, nums)
    var start = 0
    var end = nums.size - 1
    while (start < end) {
        if (nums[start] + nums[end] == k) return true
        if (nums[start] + nums[end] < k) start++ else end--
    }
    return false
}

fun main() {
    val array = arrayOf(5, 3, 6, 2, 4, null, 7)
    val root = constructBinarySearchTree(array)
    println(findTarget(root, 9))
}
