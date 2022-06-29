package org.vishal.dsa.Impl.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GraphImpl<T> {

    private final Map<T, List<T>> map;

    public GraphImpl() {
        map = new HashMap<>();
    }

    public void addEdge(T source, T destination, Boolean isBidirectional) {
        if (!map.containsKey(source)) {
            addVertex(source);
        }

        if (!map.containsKey(destination)) {
            addVertex(destination);
        }

        map.get(source).add(destination);

        if (isBidirectional) map.get(destination).add(source);
    }

    public void addVertex(T source) {
        map.put(source, new LinkedList<>());
    }

    public int getVertexCount() {
        return map.keySet().size();
    }

    public int getEdgesCount(Boolean isBidirectional) {
        int count = 0;
        for (T key : map.keySet()) {
            count += map.get(key).size();
        }
        if (isBidirectional) {
            count = count / 2;
        }
        return count;
    }

    public void hasVertex(T s) {
        System.out.println("The graph " + (!map.containsKey(s) ? "does not contain" : "")  + "contain "
                + s + " as a vertex.");
    }

    public void hasEdge(T s, T d) {
        System.out.println("The graph has " + (map.get(s).contains(d) ? "an" : "no")
                + " edge between " + s + " and " + d + ".");
    }

    public void print() {
        for (T key : map.keySet()) {
            System.out.println("Source : " + key + "\nDestinations " + map.get(key));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphImpl<Integer> graph = new GraphImpl<>();
        for (int i = 1; i < 11; i++) {
            graph.addEdge(i, i + 2, true);
        }
        graph.print();

        System.out.println("Total vertex : " + graph.getVertexCount());
        System.out.println("Total edges : " + graph.getEdgesCount(false));

        graph.hasEdge(1, 3);

        graph.hasVertex(3);
    }
}
