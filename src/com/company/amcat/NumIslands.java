package com.company.amcat;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static java.util.Arrays.asList;

public class NumIslands {

    public static void main(String[] args) {

        NumIslands numIslands = new NumIslands();

        List<List<Integer>> list = asList(
                asList(1, 1, 0, 0),
                asList(0, 0, 1, 0),
                asList(1, 0, 1, 1),
                asList(1, 1, 1, 1)
        );

        System.out.println(numIslands.numIslands(4, 4, list));
    }

    public int numIslands(int rows, int column,
                          List<List<Integer>> grid) {
        if (rows == 0 || column == 0 || grid == null) {
            return 0;
        }

        Queue<int[]> q = new LinkedList<>();

        int result = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                if (grid.get(i).get(j) == 1) {
                    q.offer(new int[]{i, j});
                }
            }
        }

        int[] rowOffset = {1, 0, -1, 0};
        int[] colOffset = {0, 1, 0, -1};


        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] cur = q.poll();
                for (int k = 0; k < 4; k++) {
                    // check neighbours
                    int newRow = cur[0] + rowOffset[k];
                    int newCol = cur[1] + colOffset[k];
                    if (newRow < 0 || newRow >= rows || newCol < 0 || newCol >= column || grid.get(newRow).get(newCol) == 1)
                        continue;

                    result++;
                    q.offer(new int[]{newRow, newCol});
                    grid.get(newRow).set(newCol, 1);
                }
            }
        }
        return result;
    }
}

