package com.company.tree.iterativeTraversal

import com.company.tree.TreeNode
import java.util.*


//PreOrder
//Root->Left->Right

fun preorderTraversal(root: TreeNode?): List<Int?>? {
    var root = root
    val list = mutableListOf<Int?>()

    if (root == null) return list

    val stack = Stack<TreeNode>()
    stack.add(root)

    while (stack.isNotEmpty()) {
        root = stack.pop()
        list.add(root.`val`)
        if (root.right != null) stack.add(root.right)
        if (root.left != null) stack.add(root.left)
    }
    return list
}

fun preOrderRecursive(root: TreeNode?, list: MutableList<Int>): List<Int> {
    if (root == null) return list

    list.add(root.`val`)

    preOrderRecursive(root.left, list)

    preOrderRecursive(root.right, list)
    return list

}