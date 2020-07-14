package com.company.gfg;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {

    int delta[][] = new int[][]{
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
    };

    public static void main(String[] args) {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        com.company.gfg.arrays.RottingOranges rottingOranges = new com.company.gfg.arrays.RottingOranges();
        System.out.println(rottingOranges.orangesRotting(grid));


    }

    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        final int m = grid.length;
        final int n = grid[0].length;

        Queue<Orange> oranges = new LinkedList<>();
        int totalOranges = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If the orange is rotten, put it into queue
                if (grid[i][j] == 2)
                    oranges.offer(new Orange(i, j, 0));
                if (grid[i][j] != 0) {
                    totalOranges++;
                }
            }
        }

        int answer = 0;
        int rottenOranges = 0;
        while (!oranges.isEmpty()) {
            Orange orange = oranges.poll();
            rottenOranges++;
            answer = orange.distance;
            for (int i = 0; i < 4; i++) {
                int dx = delta[i][0], dy = delta[i][1];
                int x = orange.row + dx;
                int y = orange.col + dy;
                if (x >= 0 && y >= 0 && x < m && y < n && grid[x][y] == 1) {
                    // If x and y are valid co-ordinates and orange at
                    // co-ordinate (x, y) is fresh => put it in queue
                    // and make it rotten
                    oranges.offer(new Orange(x, y, orange.distance + 1));
                    grid[x][y] = 2;
                }
            }
        }
        if (rottenOranges < totalOranges) {
            return -1;
        }
        return answer;
    }

    class Orange {
        int row, col, distance;

        // Here distance denotes the number of days required
        // to change state of this orange from fresh to rotten
        public Orange(int row, int col, int distance) {
            this.row = row;
            this.col = col;
            this.distance = distance;
        }
    }
}
