package com.company.graph.breadthfirstsearch

import com.company.tree.TreeNode
import java.util.*


/** Solution 1: DFS
 * Key point:
 * if a node only has one child -> MUST return the depth of the side with child, i.e. MAX(left, right) + 1
 * if a node has two children on both side -> return min depth of two sides, i.e. MIN(left, right) + 1
 * */
fun minDepth(root: TreeNode?): Int {
    if (root == null) return 0

    val left: Int = minDepth(root.left)
    val right: Int = minDepth(root.right)
    return if (left == 0 || right == 0) {
        Math.max(left, right) + 1
    } else {
        Math.min(left, right) + 1
    }
}


/** Solution 2: BFS level order traversal  */
fun minDepth2(root: TreeNode?): Int {
    if (root == null) return 0

    val queue: Queue<TreeNode> = LinkedList()
    queue.offer(root)

    var level = 1
    while (queue.isNotEmpty()) {
        val size: Int = queue.size
        for (i in 0 until size) {
            val curNode: TreeNode = queue.poll()
            if (curNode.left == null && curNode.right == null) {
                return level
            }
            if (curNode.left != null) {
                queue.offer(curNode.left)
            }
            if (curNode.right != null) {
                queue.offer(curNode.right)
            }
        }
        level++
    }
    return level
}