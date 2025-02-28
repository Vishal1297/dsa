package org.vishal.dsa.impl.graph;

import java.util.*;

public class GraphImplUsingAdjList {

    private final List<List<Integer>> graph;
    private boolean isBidirectional;
    private int vertex;
    private int edges;
    boolean[] visited;

    int[] levels;

    public GraphImplUsingAdjList(int vertex) {
        this.vertex = vertex + 1;
        this.edges = 0;
        this.graph = new ArrayList<>(this.vertex);
        this.visited = new boolean[this.vertex];
        this.levels = new int[this.vertex];
        init();
    }

    public void init() {
        for (int i = 0; i < vertex; i++)
            graph.add(new ArrayList<>());
        for (int i = 0; i < vertex; i++) {
            visited[i] = false;
        }
    }

    public void setBidirectional(boolean bidirectional) {
        this.isBidirectional = bidirectional;
    }

    public boolean addEdge(Integer source, Integer destination) {
        if (Objects.equals(source, destination)) return false;
        isValidEdge(source, destination);
        if (!graph.get(source).contains(destination)) {
            graph.get(source).add(destination);
            edges++;
        }
        if (this.isBidirectional && !graph.get(destination).contains(source)) {
            graph.get(destination).add(source);
            edges++;
            return true;
        }
        return true;
    }

    public boolean removeEdge(Integer source, Integer destination) {
        isValidEdge(source, destination);
        if (graph.get(source) == null || graph.get(source).isEmpty()) return false;
        if (!graph.get(source).contains(destination)) return false;
        graph.get(source).remove(destination);
        edges--;
        return true;
    }

    public boolean containsEdge(Integer source, Integer destination) {
        if (source >= graph.size()) return false;
        return graph.get(source).contains(destination);
    }

    public boolean containsVertex(Integer v) {
        return graph.get(v) != null;
    }

    public int getEdges() {
        return edges;
    }

    public int getVertex() {
        return vertex;
    }

    public boolean isValidEdge(int source, int destination) {
        if (source < 0 || destination < 0) return false;
        return source < graph.size() && destination < graph.size();
    }

    public void printGraph() {
        System.out.println("All Edges");
        for (int i = 0; i < graph.size(); i++) {
            List<Integer> edges = graph.get(i);
            if (edges != null && !edges.isEmpty()) {
                System.out.println("Vertex " + i + " connected to " + edges);
            }
        }
    }

    @Override
    public String toString() {
        return this.graph.toString();
    }

    public void dfs(int vertex) {
        if (visited[vertex]) return;
        visited[vertex] = true;
        for (Integer child : graph.get(vertex)) {
            System.out.println("Parent: " + vertex + " Child: " + child);
            dfs(child);
        }
    }

    public void bfs(int source) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(source);
        visited[source] = true;
        while (!queue.isEmpty()) {
            int curr_v = queue.peek();
            queue.poll();
            System.out.println("Level: " + (levels[curr_v] + 1));
            System.out.print("Parent: " + curr_v + " => Child: ");
            for (int child : graph.get(curr_v)) {
                if (!visited[child]) {
                    System.out.print(child + "\t");
                    queue.add(child);
                    visited[child] = true;
                    levels[child] = levels[curr_v] + 1;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int vertex = 8;
        GraphImplUsingAdjList impl = new GraphImplUsingAdjList(vertex);
        impl.setBidirectional(true);
        for (int i = 1; i < vertex - 1; i++) {
            impl.addEdge(i, i + 2);
        }
        System.out.println(impl);

        impl.printGraph();
        impl.bfs(5);
//        impl.bfs(1);

        int source = 1, destination = 3;
        System.out.println("Total edges : " + impl.getEdges());
        System.out.println("Contains vertex " + destination + " : " + impl.containsVertex(destination));
        System.out.println("Contains edge : " + source + "-" + destination + " : " + impl.containsEdge(source, destination));
        System.out.println("Edge removed : " + source + "-" + destination + " : " + impl.removeEdge(source, destination));
        System.out.println("Edge removed : " + destination + "-" + source + " : " + impl.removeEdge(destination, source));
        System.out.println("Total edges : " + impl.getEdges());
        impl.printGraph();

    }
}
