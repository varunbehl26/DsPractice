package com.company.bst

import java.util.*


class N_Array_Node(var `val`: Int) {
    var children: ArrayList<N_Array_Node?> = arrayListOf()
}

fun construct_N_Array_Tree(arr: Array<Int?>): N_Array_Node? {
    if (arr.isEmpty()) return null
    val queue: Queue<N_Array_Node> = LinkedList()

    val root = N_Array_Node(arr[0]!!)
    queue.add(root)

    var i = 0
    while (queue.isNotEmpty() && i < arr.size) {
        val node: N_Array_Node = queue.poll()
        i++
        //to handle the case after the root
        if (arr[i] == null && queue.isEmpty() && i < arr.size) {
            i++
        }
        while (i < arr.size && arr[i] != null) {
            val childNode = N_Array_Node(arr[i]!!.toInt())
            node.children.add(childNode)
            queue.add(childNode)
            i++
        }
    }
    return root
}

fun main() {
    val root = construct_N_Array_Tree(arrayOf(1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10, null, null, 11, null, 12, null, 13, null, null, 14))

    print(root)
}

