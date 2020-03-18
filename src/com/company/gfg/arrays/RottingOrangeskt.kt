package com.company.gfg.arrays

import java.util.*

fun main() {
    val grid = arrayOf(intArrayOf(2, 1, 1), intArrayOf(1, 1, 0), intArrayOf(0, 1, 1))
    val rottingOranges = RottingOranges()
    println(rottingOranges.orangesRotting(grid))
}

class RottingOranges {
    // Here distance denotes the number of days required
    // to change state of this orange from fresh to rotten
    internal inner class Orange(var row: Int, var col: Int, var distance: Int)

    var delta = arrayOf(intArrayOf(-1, 0), intArrayOf(1, 0), intArrayOf(0, -1), intArrayOf(0, 1))

    fun orangesRotting(grid: Array<IntArray>?): Int {
        if (grid == null || grid.isEmpty()) return 0
        val m = grid.size
        val n = grid[0].size
        val oranges: Queue<Orange> = LinkedList()

        var totalOranges = 0
        for (i in 0 until m) {
            for (j in 0 until n) {
                // If the orange is rotten, put it into queue
                if (grid[i][j] == 2) oranges.offer(Orange(i, j, 0))
                if (grid[i][j] != 0) {
                    totalOranges++
                }
            }
        }
        var answer = 0
        var rottenOranges = 0
        while (!oranges.isEmpty()) {
            val orange = oranges.poll()
            rottenOranges++
            answer = orange.distance
            for (i in 0..3) {
                val dx = delta[i][0]
                val dy = delta[i][1]
                val x = orange.row + dx
                val y = orange.col + dy
                if (x >= 0 && y >= 0 && x < m && y < n && grid[x][y] == 1) {
                    // If x and y are valid co-ordinates and orange at
                    // co-ordinate (x, y) is fresh => put it in queue
                    // and make it rotten
                    oranges.offer(Orange(x, y, orange.distance + 1))
                    grid[x][y] = 2
                }
            }
        }
        return if (rottenOranges < totalOranges) {
            -1
        } else answer
    }


}