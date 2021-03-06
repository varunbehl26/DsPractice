package com.company;

import java.util.ArrayDeque;
import java.util.Queue;

public class RottingOranges {

    //0 nothing
    //1 new
    //2 rotten
    public static int orangesRotting(int[][] grid) {
        int countFresh = 0;
        if (grid == null || grid.length == 0) return 0;
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    countFresh++;
                }
            }
        }
        if (countFresh == 0) return 0;
        int count = 0;
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!queue.isEmpty()) {
            count++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] point = queue.poll();
                for (int[] dir : dirs) {
                    int x = point[0] + dir[0];
                    int y = point[1] + dir[1];

                    if (x < 0 || y < 0 || x >= rows
                            || y >= cols
                            || grid[x][y] == 0 || grid[x][y] == 2)
                        continue;
                    grid[x][y] = 2;

                    queue.offer(new int[]{x, y});
                    countFresh--;
                }
            }
        }
        return countFresh == 0 ? count - 1 : -1;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };

        System.out.println(orangesRotting(grid));
    }
}