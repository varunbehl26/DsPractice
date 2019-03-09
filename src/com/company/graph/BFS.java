package com.company.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS extends Graph {
    public static void main(String[] args) {

        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
    }

    private void BFS(int src) {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean[] visited = new boolean[vertices];

        // Create a queue for BFS
        Queue<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[src] = true;
        queue.add(src);

        while (queue.size() != 0) {
            // Dequeue a vertex from queue and print it
            src = queue.poll();
            System.out.print(src + " ");

            // Get all adjacent vertices of the dequeued vertex src
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            for (int val : adjListArray[src]) {
                if (!visited[val]) {
                    visited[val] = true;
                    queue.add(val);
                }
            }
        }
    }

}
