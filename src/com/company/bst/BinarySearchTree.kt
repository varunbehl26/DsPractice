package com.company.bst

class BinarySearchTree<T : Comparable<T>> {

    var root: BinaryNode<T>? = null

    fun insert(value: T) {
        root = insertHelper(root, value)
    }

    private fun insertHelper(node: BinaryNode<T>?, value: T): BinaryNode<T> {
        node ?: return BinaryNode(value)
        if (value < node.value) {
            node.leftChild = insertHelper(node.leftChild, value)
        } else {
            node.rightChild = insertHelper(node.rightChild, value)
        }
        return node
    }

    fun remove(value: T) {
        root = removeHelper(root, value)
    }

    private fun removeHelper(node: BinaryNode<T>?, value: T): BinaryNode<T>? {
        node ?: return null
        when {
            value == node.value -> {
                // 1
                if (node.leftChild == null && node.rightChild == null) {
                    return null
                }
                // 2
                if (node.leftChild == null) {
                    return node.rightChild
                }
                // 3
                if (node.rightChild == null) {
                    return node.leftChild
                }
                // 4
                node.rightChild?.min?.value?.let {
                    node.value = it
                }
                node.rightChild = removeHelper(node.rightChild, node.value)
            }
            value < node.value -> node.leftChild = removeHelper(node.leftChild, value)
            else -> node.rightChild = removeHelper(node.rightChild, value)
        }
        return node
    }

    override fun toString() = root?.toString() ?: "empty tree"

    fun contains(value: T): Boolean {
        var current = root

        while (current != null) {
            if (current.value == value) {
                return true
            }
            current = if (value < current.value) {
                current.leftChild
            } else {
                current.rightChild
            }
        }
        return false
    }

    val isBinarySearchTree: Boolean
        get() = isBST(this as BinaryNode<T>, min = null, max = null)

    // 1
    private fun isBST(tree: BinaryNode<T>?, min: T?, max: T?): Boolean {
        // 2
        tree ?: return true

        // 3
        if (min != null && tree.value <= min) {
            return false
        } else if (max != null && tree.value > max) {
            return false
        }

        // 4
        return isBST(tree.leftChild, min, tree.value) && isBST(tree.rightChild, tree.value, max)
    }


}
