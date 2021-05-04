package com.company.tree

//class FindElements(root: TreeNode?) {
//    init {
//        if (root != null) {
//            recover(root)
//        }
//    }
//
//    private fun recover(root: TreeNode) {
//        if (root.left != null) {
//            root.left!!.`val` = (2 * root.`val` + 1)
//            recover(root.left)
//        }
//        if (root.right != null) {
//            root.right!!.`val` = (2 * root.`val` + 2)
//        }
//        return root
//
//
//    fun find(target: Int): Boolean {
//        return false
//    }
//
//
//}
//
//
//fun main() {
//    val treeNode = constructBTreeLevel(arrayOf(-1, -1, -1, -1, -1))
//    val findElements = FindElements(treeNode)
//    findElements.find(1)
//    findElements.find(3)
//    findElements.find(5)
//}