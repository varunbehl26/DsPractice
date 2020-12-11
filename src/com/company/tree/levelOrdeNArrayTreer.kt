package com.company.tree

import com.company.bst.N_Array_Node
import com.company.bst.construct_N_Array_Tree
import java.util.*


fun levelOrderNArry(root: N_Array_Node?): List<List<Int?>> {
    val parentMutableList = mutableListOf<List<Int>>()
    root ?: return parentMutableList
    val queue = ArrayDeque<N_Array_Node>()
    queue.offer(root)

    while (queue.isNotEmpty()) {
        val sublist = mutableListOf<Int>()
        val len = queue.size
        for (i in 0 until len) {
            val peekNode = queue.poll()
            sublist.add(peekNode.`val`)
            for (child in peekNode.children) {
                if (child != null) {
                    queue.offer(child)
                }
            }
        }
        parentMutableList.add(sublist)
    }

    return parentMutableList.toList()
}

fun postorderNArry(root: N_Array_Node?): List<Int> {
    root ?: return emptyList()
    val list = mutableListOf<Int>()
    postOrderHelper(root, list)
    return list.toList()

}

fun postOrderHelper(root: N_Array_Node, list: MutableList<Int>) {
    if (root.children.isNotEmpty()) {
        root.children.forEach {
            if (it != null) {
                postOrderHelper(it, list)
            }
        }
    }
    list.add(root.`val`)
}

fun preorderNArry(root: N_Array_Node?): List<Int> {
    root ?: return emptyList()
    val list = mutableListOf<Int>()
    preOrderHelper(root, list)
    return list
}

fun preOrderHelper(root: N_Array_Node, list: MutableList<Int>) {
    list.add(root.`val`)
    if (root.children.isNotEmpty()) {
        root.children.forEach {
            if (it != null) {
                preOrderHelper(it, list)
            }
        }
    }
}

fun main() {
//    val root = construct_N_Array_Tree(arrayOf(1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10, null, null, 11, null, 12, null, 13, null, null, 14))
    val root = construct_N_Array_Tree(arrayOf(1, null, 3, 2, 4, null, 5, 6))

//    val list = levelOrderNArry(root)
//    val list = postorderNArry(root)
    val list = preorderNArry(root)
    list.forEach { println(it) }
}