package com.company.graph

import java.util.*
import kotlin.collections.ArrayList

interface Graph<T> {

    fun createVertex(data: T): Vertex<T>
    fun addDirectedEdge(source: Vertex<T>, destination: Vertex<T>, weight: Double?)
    fun addUndirectedEdge(source: Vertex<T>, destination: Vertex<T>, weight: Double?) {
        addDirectedEdge(source, destination, weight)
        addDirectedEdge(destination, source, weight)
    }

    fun add(edge: EdgeType, source: Vertex<T>, destination: Vertex<T>, weight: Double?) {
        when (edge) {
            EdgeType.DIRECTED -> addDirectedEdge(source, destination, weight)
            EdgeType.UNDIRECTED -> addUndirectedEdge(source, destination, weight)
        }
    }

    fun edges(source: Vertex<T>): ArrayList<Edge<T>>
    fun weight(source: Vertex<T>, destination: Vertex<T>): Double?

    fun numberOfPaths(source: Vertex<T>, destination: Vertex<T>): Int {
        val numberOfPaths = Ref(0) // 1
        val visited: ArrayList<Vertex<T>> = arrayListOf() // 2
        paths(source, destination, visited, numberOfPaths) // 3
        return numberOfPaths.value
    }

    fun breadthFirstSearch(source: Vertex<T>): ArrayList<Vertex<T>> {
        val queue = ArrayDeque<Vertex<T>>()
        val enqueued = ArrayList<Vertex<T>>()
        val visited = ArrayList<Vertex<T>>()

        queue.push(source) // 1

        while (queue.isNotEmpty()) {
            val vertex = queue.poll() // 2

            visited.add(vertex) // 3

            val neighborEdges = edges(vertex) // 4

            neighborEdges.forEach {
                if (!enqueued.contains(it.destination)) { // 5
                    queue.push(it.destination)
                    enqueued.add(it.destination)
                }
            }
        }
        return visited
    }

    fun paths(source: Vertex<T>, destination: Vertex<T>, visited: ArrayList<Vertex<T>>, pathCount: Ref<Int>) {
        visited.add(source) // 1
        if (source == destination) { // 2
            pathCount.value += 1
        } else {
            val neighbors = edges(source) // 3
            neighbors.forEach { edge ->
                // 4
                if (!visited.contains(edge.destination)) {
                    paths(edge.destination, destination, visited, pathCount)
                }
            }
        }
        // 5
        visited.remove(source)
    }

    fun depthFirstSearch(source: Vertex<T>): ArrayList<Vertex<T>> {
        val stack = Stack<Vertex<T>>()
        val visited = arrayListOf<Vertex<T>>()
        val pushed = mutableSetOf<Vertex<T>>()

        stack.push(source)
        pushed.add(source)
        visited.add(source)

        while (stack.isNotEmpty()) {
            val vertex = stack.peek()
            val neighbors = edges(vertex)

            neighbors.forEach { neighbor ->
                val destination = neighbor.destination
                if (!pushed.contains(destination)) {
                    stack.push(destination)
                    pushed.add(destination)
                    visited.add(destination)
                    return@forEach
                }
            }

            stack.pop()
        }

        return visited
    }

    fun depthFirstSearchRecursive(start: Vertex<T>): ArrayList<Vertex<T>> {
        val visited = arrayListOf<Vertex<T>>() // 1
        val pushed = mutableSetOf<Vertex<T>>() // 2

        depthFirstSearchHelper(start, visited, pushed) // 3

        return visited
    }

    fun depthFirstSearchHelper(
            source: Vertex<T>,
            visited: ArrayList<Vertex<T>>,
            pushed: MutableSet<Vertex<T>>
    ) {
        pushed.add(source) // 1
        visited.add(source)

        val neighbors = edges(source)
        neighbors.forEach { // 2
            if (!pushed.contains(it.destination)) {
                depthFirstSearchHelper(it.destination, visited, pushed) // 3
            }
        }
    }

    fun hasCycle(source: Vertex<T>): Boolean {
        val pushed = arrayListOf<Vertex<T>>() // 1
        return hasCycleHelper(source, pushed) // 2
    }

    fun hasCycleHelper(source: Vertex<T>, pushed: ArrayList<Vertex<T>>): Boolean {
        pushed.add(source) // 1

        val neighbors = edges(source) // 2
        neighbors.forEach {
            if (!pushed.contains(it.destination) && hasCycleHelper(it.destination, pushed)) { // 3
                return true
            } else if (pushed.contains(it.destination)) { // 4
                return true
            }
        }

        pushed.remove(source) // 5
        return false // 6

    }


}


enum class EdgeType {
    DIRECTED,
    UNDIRECTED
}