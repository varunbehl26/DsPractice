package com.company.gfg

import java.util.*


fun main() {
    val grid = arrayOf(intArrayOf(2, 1, 1),
            intArrayOf(1, 1, 0),
            intArrayOf(0, 1, 1))

    println(orangesRotting(grid))
}

fun orangesRotting(grid: Array<IntArray>?): Int {
    if (grid == null || grid.isEmpty()) {
        return 0
    }
    val rows = grid.size
    val cols: Int = grid[0].size
    val queue: Queue<IntArray> = LinkedList()
    var countFresh = 0
    //Put the position of all rotten oranges in queue
    //count the number of fresh oranges
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            if (grid[i][j] == 2) {
                queue.offer(intArrayOf(i, j))
            } else if (grid[i][j] == 1) {
                countFresh++
            }
        }
    }
    //if count of fresh oranges is zero --> return 0
    if (countFresh == 0) {
        return 0
    }
    var count = 0
    val dirs = arrayOf(intArrayOf(1, 0),
            intArrayOf(-1, 0),
            intArrayOf(0, 1),
            intArrayOf(0, -1))

    //bfs starting from initially rotten oranges
    while (!queue.isEmpty()) {
        ++count
        val size: Int = queue.size
        for (i in 0 until size) {
            val point = queue.poll()
            for (dir in dirs) {
                val x = point[0] + dir[0]
                val y = point[1] + dir[1]
                //if x or y is out of bound
                //or the orange at (x , y) is already rotten
                //or the cell at (x , y) is empty
                //we do nothing
                if (x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] == 0 || grid[x][y] == 2) continue
                //mark the orange at (x , y) as rotten
                grid[x][y] = 2
                //put the new rotten orange at (x , y) in queue
                queue.offer(intArrayOf(x, y))
                //decrease the count of fresh oranges by 1
                countFresh--
            }
        }
    }
    return if (countFresh == 0) {
        count - 1
    } else {
        -1
    }
}