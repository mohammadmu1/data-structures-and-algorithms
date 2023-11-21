package graph;
import java.util.*;

import java.util.*;

public class Graph<V> {

    private int size;
    private final HashMap<V, Vertex<V>> vertices = new HashMap<>();

    public Vertex<V> addVertex(V value) {
        Vertex<V> newVertex = new Vertex<>(value);
        vertices.putIfAbsent(value, newVertex);
        size++;
        return newVertex;
    }

    public void addEdge(Vertex<V> vertex1, Vertex<V> vertex2, int weight) {
        if (vertices.get(vertex2.getValue()) == null || vertices.get(vertex2.getValue()) == null)
            throw new IllegalArgumentException();
        vertices.get(vertex1.getValue()).addEdges(vertex2, weight);
        vertices.get(vertex2.getValue()).addEdges(vertex1, weight);
    }

    public void addEdge(Vertex<V> vertex1, Vertex<V> vertex2) {
        if (vertices.get(vertex2.getValue()) == null || vertices.get(vertex2.getValue()) == null)
            throw new IllegalArgumentException();
        vertices.get(vertex1.getValue()).addEdges(vertex2);
        vertices.get(vertex2.getValue()).addEdges(vertex1);
    }

    public Collection<Vertex<V>> getVertices() {
        return vertices.values();
    }

    public HashSet<Edges<V>> getNeighbors(Vertex<V> vertex) {
        if (this.vertices.containsKey(vertex.getValue()))
            return this.vertices.get(vertex.getValue()).getEdges();
        return null;
    }

    public int size() {
        return this.size;
    }

    public boolean isContainVertex(Vertex<V> vertex) {
        return this.vertices.containsKey(vertex.getValue());
    }

    public boolean isContainValue(V value) {
        return vertices.containsKey(value);
    }

    public boolean isConnected(Vertex<V> vertex, Vertex<V> connectedVertex) {
        for (Edges<V> e : this.vertices.get(vertex.getValue()).getEdges()) {
            if (e.getTo().getValue().equals(connectedVertex.getValue())) return true;
        }
        return false;
    }

    public List<V> breadthFirst(Vertex<V> root) {
        List<V> out = new ArrayList<>();
        Set<Vertex<V>> visited = new HashSet<>();
        Queue<Vertex<V>> queue = new LinkedList<>();

        Vertex<V> rootNode = vertices.get(root.getValue());

        if (rootNode == null) {
            return out;
        }

        queue.add(rootNode);

        while (!queue.isEmpty()) {
            Vertex<V> node = queue.poll();  // Use poll() instead of remove() for consistent order

            if (visited.contains(node)) {
                continue;
            }

            out.add(node.getValue());
            visited.add(node);

            for (Edges<V> e : node.getEdges()) {
                Vertex<V> neighbor = vertices.get(e.getTo().getValue());
                if (neighbor != null && !visited.contains(neighbor)) {
                    queue.add(neighbor);
                }
            }
        }

        return out;
    }
}





