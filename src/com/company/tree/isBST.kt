package com.company.tree

private fun isValidBSTUtils(root: TreeNode?, minValue: Long, maxValue: Long): Boolean {
    return if (root == null) {
        true
    } else {
        root.`val`.toLong() > minValue && root.`val`.toLong() < maxValue &&
                isValidBSTUtils(root.left, minValue, root.`val`.toLong()) &&
                isValidBSTUtils(root.right, root.`val`.toLong(), maxValue)
    }
}

fun isValidBST(root: TreeNode?): Boolean {
    return isValidBSTUtils(root, Long.MIN_VALUE, Long.MAX_VALUE)
}
