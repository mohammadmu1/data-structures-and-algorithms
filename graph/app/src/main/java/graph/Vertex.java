package graph;


import java.util.HashSet;

public class Vertex<V> {
    private V value;

    private HashSet<Edges<V>> edges = new HashSet<>();


    public Vertex(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void addEdges(Vertex<V> to, int weight ) {
        edges.add(new Edges<>(this, to, weight ));
    }



    public void addEdges(Vertex<V> to) {
        edges.add(new Edges<>(this, to, 0));
    }



    public HashSet<Edges<V>> getEdges() {
        return edges;
    }

    public void setEdges(HashSet<Edges<V>> edges) {
        this.edges = edges;
    }
}
