package com.company.graph

class AdjacencyList<T> : Graph<T> {

    private val adjacencyListMap: HashMap<Vertex<T>, ArrayList<Edge<T>>> = HashMap()

    override fun createVertex(data: T): Vertex<T> {
        val vertex = Vertex(adjacencyListMap.count(), data)
        adjacencyListMap[vertex] = ArrayList()
        return vertex
    }

    override fun addDirectedEdge(source: Vertex<T>, destination: Vertex<T>, weight: Double?) {
        val edge = Edge(source, destination, weight)
        adjacencyListMap[source]?.add(edge)
    }

    override fun edges(source: Vertex<T>) = adjacencyListMap[source] ?: arrayListOf()

    override fun weight(source: Vertex<T>, destination: Vertex<T>): Double? {
        return edges(source).firstOrNull { it.destination == destination }?.weight
    }

    override fun toString(): String {
        return buildString {
            adjacencyListMap.forEach { (vertex, edges) ->
                val edgeString = edges.joinToString { it.destination.data.toString() }
                append("${vertex.data} ---> [ $edgeString ]\n")
            }

        }
    }
}
