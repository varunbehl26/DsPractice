package com.company.amazonInterview;

import java.util.*;

// "static void main" must be defined in a public class.
public class Zombie {
    public static void main(String[] args) {

        ArrayList<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1, 1, 0, 0));
        list.add(Arrays.asList(0, 0, 1, 0));
        list.add(Arrays.asList(0, 0, 0, 0));
        list.add(Arrays.asList(1, 0, 1, 1));
        list.add(Arrays.asList(1, 1, 1, 1));

        Zombie z = new Zombie();
        int result = z.calculateParks(list);

        System.out.println(result);
    }

    public static int getZombies(List<List<Integer>> grid, int m, int n, Queue<int[]> queue, int zombies, int[] rowOffset, int[] colOffset, int size) {
        for (int i = 0; i < size; i++) {
            int[] cur = queue.poll();
            for (int k = 0; k < 4; k++) {
                // check neighbours
                int newRow = cur[0] + rowOffset[k];
                int newCol = cur[1] + colOffset[k];
                if (newRow < 0 || newRow >= m || newCol < 0 || newCol >= n || grid.get(newRow).get(newCol) == 1)
                    continue;

                zombies++;
                queue.offer(new int[]{newRow, newCol});
                grid.get(newRow).set(newCol, 1);
            }
        }
        return zombies;
    }

    public int calculateParks(List<List<Integer>> grid) {
        int m = grid.size();
        int n = grid.get(0).size();

        Queue<int[]> queue = new LinkedList<>();

        int target = m * n; // total no of zombies
        int zombies = 0, hours = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) == 1) {
                    queue.offer(new int[]{i, j});
                    zombies++;
                }
            }
        }

        int[] rowOffset = {1, 0, -1, 0};
        int[] colOffset = {0, 1, 0, -1};

        while (!queue.isEmpty()) {
            int size = queue.size();
            if (zombies == target) {
                return hours;
            }
            zombies = getZombies(grid, m, n, queue, zombies, rowOffset, colOffset, size);
            hours++;
        }
        return -1;
    }
}