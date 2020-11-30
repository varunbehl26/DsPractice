package com.company.tree.iterativeTraversal

import com.company.tree.TreeNode
import java.util.*

//Left->Root->Right
object Inorder {
    @JvmStatic
    fun main(args: Array<String>) {
        var list: MutableList<Int?> = ArrayList()
        val root = TreeNode(1)
        root.left = TreeNode(2)
        root.right = TreeNode(3)
        root.left!!.left = TreeNode(4)
        root.left!!.right = TreeNode(5)
        root.right!!.left = TreeNode(6)
        root.right!!.right = TreeNode(7)
        list = inorderRecursive(root, list)
        for (integer in list) {
            print(integer)
            print(" ")
        }
    }

    fun inorderTraversal(root: TreeNode?, list: MutableList<Int?>): List<Int?> {
        val nodesStack = Stack<TreeNode>()
        var cur = root
        //while tree is not fully traversed or stack is empty
        while (cur != null || !nodesStack.isEmpty()) {

            //add left to stack and then start pulling
            while (cur != null) {
                nodesStack.push(cur)
                cur = cur.left
            }

            //Poping from stack to get left node
            cur = nodesStack.pop()

            //Adding value to list
            list.add(cur.`val`)

            //moving towards right
            cur = cur.right
        }
        return list
    }

    fun inorderRecursive(root: TreeNode?, list: MutableList<Int?>): MutableList<Int?> {
        if (root == null) {
            return list
        }
        inorderTraversal(root.left, list)
        list.add(root.`val`)
        inorderTraversal(root.right, list)
        return list
    }
}