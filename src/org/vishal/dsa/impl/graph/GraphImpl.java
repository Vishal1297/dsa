package org.vishal.dsa.impl.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GraphImpl<T> {

    private final Map<T, List<T>> map;
    private boolean isBidirectional;

    public GraphImpl() {
        this.map = new HashMap<>();
    }

    public GraphImpl(boolean isBidirectional) {
        this.isBidirectional = isBidirectional;
        this.map = new HashMap<>();
    }

    public void setBidirectional(boolean isBidirectional) {
        this.isBidirectional = isBidirectional;
    }

    public void addEdge(T source, T destination) {
        if (!map.containsKey(source)) {
            addVertex(source);
        }

        if (!map.containsKey(destination)) {
            addVertex(destination);
        }

        map.get(source).add(destination);

        if (this.isBidirectional) map.get(destination).add(source);
    }

    public void addVertex(T source) {
        map.put(source, new LinkedList<>());
    }

    public int getVertexCount() {
        return map.keySet().size();
    }

    public int getEdgesCount() {
        int count = 0;
        for (T key : map.keySet()) {
            count += map.get(key).size();
        }
        return this.isBidirectional ? count / 2 : count;
    }

    public boolean hasVertex(T s) {
        return map.containsKey(s);
    }

    public boolean hasEdge(T s, T d) {
        return map.get(s) != null && map.get(s).contains(d);
    }

    public void print() {
        for (T key : map.keySet()) {
            System.out.println("Source: " + key + "\t| Destinations: " + map.get(key));
        }
    }

    public static void main(String[] args) {
        GraphImpl<Integer> graph = new GraphImpl<>();
        graph.setBidirectional(true);
        for (int i = 1; i <= 6; i++) {
            graph.addEdge(i, i + 2);
        }
        graph.print();

        System.out.println("Total vertex : " + graph.getVertexCount());
        System.out.println("Total edges : " + graph.getEdgesCount());

        if (graph.hasEdge(1, 3)) {
            System.out.println("Edge exists");
        }

        if (graph.hasVertex(1)) {
            System.out.println("Vertex exists");
        }
    }
}
