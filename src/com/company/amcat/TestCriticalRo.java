package com.company.amcat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class TestCriticalRo {


    public static void main(String[] args) {
        int numRouters1 = 7;
        int numLinks1 = 7;

        TestCriticalRo obj = new TestCriticalRo();

        List<List<Integer>> list = asList(
                asList(1, 2),
                asList(1, 3),
                asList(2, 4),
                asList(3, 4),
                asList(3, 6),
                asList(6, 7),
                asList(4, 5)
        );
        List<List<Integer>> lists = obj.criticalConnections(7, list);
        System.out.println(lists);
    }

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (List<Integer> oneConnection : connections) {
            graph[oneConnection.get(0)].add(oneConnection.get(1));
            graph[oneConnection.get(1)].add(oneConnection.get(0));
        }
        int timer[] = new int[1];
        List<List<Integer>> results = new ArrayList<>();
        boolean[] visited = new boolean[n];
        int[] timeStampAtThatNode = new int[n];
        criticalConnectionsUtil(graph, -1, 0, timer, visited, results, timeStampAtThatNode);
        return results;
    }


    public void criticalConnectionsUtil(List<Integer>[] graph, int parent, int node, int timer[], boolean[] visited, List<List<Integer>> results, int[] timeStampAtThatNode) {
        visited[node] = true;
        timeStampAtThatNode[node] = timer[0]++;
        int currentTimeStamp = timeStampAtThatNode[node];

        for (int oneNeighbour : graph[node]) {
            if (oneNeighbour == parent) continue;
            if (!visited[oneNeighbour])
                criticalConnectionsUtil(graph, node, oneNeighbour, timer, visited, results, timeStampAtThatNode);
            timeStampAtThatNode[node] = Math.min(timeStampAtThatNode[node], timeStampAtThatNode[oneNeighbour]);
            if (currentTimeStamp < timeStampAtThatNode[oneNeighbour]) results.add(Arrays.asList(node, oneNeighbour));
        }


    }
}