package com.company.tree

import java.util.*

//TODO
fun binaryTreePaths(root: TreeNode?): List<String>? {
    val res: MutableList<String> = ArrayList()
    val stringBuilder = StringBuilder()
    helper(res, root, stringBuilder)
    return res
}

private fun helper(resultList: MutableList<String>, root: TreeNode?, stringBuilder: StringBuilder) {
    if (root == null) return

    val len = stringBuilder.length

    stringBuilder.append(root.`val`)

    if (root.left == null && root.right == null) {
        resultList.add(stringBuilder.toString())
    } else {
        stringBuilder.append("->")
        helper(resultList, root.left, stringBuilder)
        helper(resultList, root.right, stringBuilder)
    }
    stringBuilder.setLength(len)
}


fun main() {

    val tree = constructBTreeLevel(arrayOf(3, 9, 20, null, null, 15, 7))
    val list = binaryTreePaths(tree)

    list?.forEach { println(it) }

}