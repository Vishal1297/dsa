package org.vishal.dsa.impl.graph;

public class GraphImplUsingAdjMatrix {

    private final int[][] graph;
    private final int vertex;
    private int edges;

    public GraphImplUsingAdjMatrix(int vertex) {
        this.vertex = vertex;
        this.edges = 0;
        this.graph = new int[vertex][vertex];
    }

    public void addEdge(int source, int destination, Boolean isBidirectional) {
        validateEdge(source, destination);
        if (source == destination) return;
        graph[source][destination] = 1;
        if (isBidirectional) {
            graph[destination][source] = 1;
            edges++;
        }
        edges++;
    }

    public void  removeEdge(int source, int destination, Boolean isBidirectional) {
        validateEdge(source, destination);
        if (source == destination) return;
        graph[source][destination] = 0;
        if (isBidirectional) {
            graph[destination][source] = 0;
            edges--;
        }
        edges--;
    }

    public boolean containsEdge(int source, int destination, Boolean isBidirectional) {
        validateEdge(source, destination);
        if (source == destination) throw new IllegalStateException("Both vertex can't be same.");
        if (isBidirectional) return graph[destination][source] != 0;
        return graph[source][destination] != 0;
    }

    public int getEdges() {
        return edges;
    }

    public void printGraph() {
        System.out.println("\nGraph : ");
        System.out.println("All Edges");
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                if (graph[i][j] != 0) {
                    System.out.println("" + i + " " + j + "");
                }
            }
        }
    }

    public void validateEdge(int source, int destination) {
        if (source < 0 || destination < 0) throw new IllegalStateException("Invalid vertex.");
        if (source >= graph.length || destination >= graph.length) throw new IllegalStateException("Invalid vertex.");
    }

    public static void main(String[] args) {
        int vertex = 10;
        boolean biDirectional = false;
        GraphImplUsingAdjMatrix impl = new GraphImplUsingAdjMatrix(vertex);
        for (int i = 0; i < vertex; i++) {
            impl.addEdge(getRandomValue(vertex), getRandomValue(vertex), biDirectional);
        }
        impl.printGraph();
        int source = 2, destination = 4;
        System.out.println("Contains edge : " + impl.containsEdge(source, destination, biDirectional));
        System.out.println("Total edges : " + impl.getEdges());
        System.out.println("Remove edge : " + source + " " + destination);
        impl.removeEdge(source, destination, biDirectional);
        impl.printGraph();
    }

    public static int getRandomValue(int upperBound) {
        return (int) (Math.random() * (upperBound - 1)) + 1;
    }
}
