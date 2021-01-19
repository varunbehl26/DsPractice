package com.company.tree.iterativeTraversal

import com.company.tree.TreeNode
import com.company.tree.constructBinarySearchTree
import java.util.*

fun inorderTraversal(root: TreeNode?, list: MutableList<Int>): List<Int?> {
    val stack = Stack<TreeNode>()
    var cur = root
    //while tree is not fully traversed or stack is empty
    while (cur != null || !stack.isEmpty()) {

        //add left to stack and then start pulling
        while (cur != null) {
            stack.push(cur)
            cur = cur.left
        }

        //Popping from stack to get left node
        cur = stack.pop()

        //Adding value to list
        list.add(cur.`val`)

        //moving towards right
        cur = cur.right
    }
    return list
}

fun inorderRecursive(root: TreeNode?, list: MutableList<Int>): MutableList<Int> {
    root ?: return list
    inorderRecursive(root.left, list)
    list.add(root.`val`)
    inorderRecursive(root.right, list)
    return list
}

fun main() {
    val node = constructBinarySearchTree(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, null, 9, 10))
    var list1 = mutableListOf<Int>()
    list1 = inorderTraversal(node, list1) as MutableList<Int>
    for (i in list1) {
        print(i)
        print(" ")
    }
}