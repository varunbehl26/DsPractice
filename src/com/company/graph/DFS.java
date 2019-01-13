package com.company.graph;

public class DFS extends Graph {

    public static void main(String[] args) {

        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
//        graph.printGraph();

    }

    private void DFSUtil(int v, boolean[] visited) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this vertex
        for (int n : adjListArray[v]) {
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    private void DFS(int v) {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean[] visited = new boolean[vertices];

        // Call the recursive helper function to print DFS traversal
        DFSUtil(v, visited);
    }

}
