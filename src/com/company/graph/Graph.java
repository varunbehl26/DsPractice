package com.company.graph;

import java.util.LinkedList;

public class Graph {

    int vertices;
    LinkedList<Integer>[] adjListArray;


    Graph() {

    }

    Graph(int vertices) {
        this.vertices = vertices;

        adjListArray = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args) {

        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.printGraph();

    }

    void addEdge(int src, int dest) {
        // Add an edge from src to dest.
        adjListArray[src].add(dest);

        // Since graph is undirected, add an edge from dest to src also
//        adjListArray[dest].add(src);
    }

    private void printGraph() {
        for (int v = 0; v < vertices; v++) {
            System.out.println("Adjacency list of vertex " + v);
            System.out.print("head");
            for (Integer pCrawl : adjListArray[v]) {
                System.out.print(" -> " + pCrawl);
            }
            System.out.println("\n");
        }


    }


}
