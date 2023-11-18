package graph;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Graph<V> {


    private int size;


    private final HashMap<V, Vertex<V>> vertex = new HashMap<>();

    public Graph() {
    }


    public Vertex<V> addVertex(V value) {

        Vertex<V> newVertex = new Vertex<>(value);

        vertex.putIfAbsent(value, newVertex);

        size++;
        return newVertex;
    }


    public void addEdge(Vertex<V> vertex1, Vertex<V> vertex2, int weight) {
        if (vertex.get(vertex2.getValue()) == null || vertex.get(vertex2.getValue()) == null)
            throw new IllegalArgumentException();
        vertex.get(vertex1.getValue()).addEdges(vertex2, weight);
        vertex.get(vertex2.getValue()).addEdges(vertex1, weight);
    }



    public void addEdge(Vertex<V> vertex1, Vertex<V> vertex2) {
        if (vertex.get(vertex2.getValue()) == null || vertex.get(vertex2.getValue()) == null)
            throw new IllegalArgumentException();
        vertex.get(vertex1.getValue()).addEdges(vertex2);
        vertex.get(vertex2.getValue()).addEdges(vertex1);
    }


    public Collection<Vertex<V>> getVertices() {
        return vertex.values();
    }


    public HashSet<Edges<V>> getNeighbors(Vertex<V> vertex) {
        if (this.vertex.containsKey(vertex.getValue()))
            return this.vertex.get(vertex.getValue()).getEdges();
        return null;
    }

    public int size() {
        return this.size;
    }


    public boolean isContainVertex(Vertex<V> vertex) {
        return this.vertex.containsKey(vertex.getValue());
    }

    public boolean isContainValue(V value) {
        return vertex.containsKey(value);
    }


    public boolean isConnected(Vertex<V> vertex, Vertex<V> connectedVertex) {
        for (Edges<V> e : this.vertex.get(vertex.getValue()).getEdges()) {
            if (e.getTo().getValue().equals(connectedVertex.getValue())) return true;
        }

        return false;
    }


}