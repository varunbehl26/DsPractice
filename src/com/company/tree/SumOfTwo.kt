package com.company.tree

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
    inorder(root, nums)
    var i = 0
    var j = nums.size - 1
    while (i < j) {
        if (nums[i] + nums[j] == k) return true
        if (nums[i] + nums[j] < k) i++ else j--
    }
    return false
}

fun inorder(root: TreeNode?, nums: MutableList<Int>) {
    if (root == null) return
    inorder(root.left, nums)
    nums.add(root.`val`)
    inorder(root.right, nums)
}

fun main() {
    val array = arrayOf(5, 3, 6, 2, 4, null, 7)
    val root = constructBinarySearchTreeInOrder(array)
    println(findTarget(root, 9))
}
