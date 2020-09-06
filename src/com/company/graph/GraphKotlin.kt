package com.company.graph

import java.util.*

class GraphKotlin(var vertices: Int) {
    var adjListArray: Array<LinkedList<Int>?> = arrayOfNulls(vertices)

    init {
        for (i in 0 until vertices) {
            adjListArray[i] = LinkedList()
        }
    }

    fun addEdge(src: Int, dest: Int) {
        // Add an edge from src to dest.
        adjListArray[src]?.add(dest)

        // Since graph is undirected, add an edge from dest to src also
//        adjListArray[dest].add(src);
    }

    private fun printGraph() {
        for (v in 0 until vertices) {
            println("Adjacency list of vertex $v")
            print("head")
            for (value in adjListArray[v]!!) {
                print(" -> $value")
            }
            println("\n")
        }
    }


    private fun DFSUtil(v: Int, visited: BooleanArray) {
        // Mark the current node as visited and print it
        visited[v] = true
        print("$v ")

        // Recur for all the vertices adjacent to this vertex
        for (n in adjListArray[v]!!) {
            if (visited[n]) {
                continue
            } else {
                DFSUtil(n, visited)
            }
        }
    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    fun DFS(v: Int) {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        val visited = BooleanArray(vertices)

        // Call the recursive helper function to print DFS traversal
        DFSUtil(v, visited)
    }
}

fun main() {
    val graph = GraphKotlin(5)
    graph.addEdge(0, 1)
    graph.addEdge(0, 4)
    graph.addEdge(1, 2)
    graph.addEdge(1, 3)
    graph.addEdge(1, 4)
    graph.addEdge(2, 3)
    graph.addEdge(3, 4)
//            graph.printGraph()
    graph.DFS(0)
}

