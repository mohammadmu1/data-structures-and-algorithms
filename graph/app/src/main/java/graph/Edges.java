package graph;

public class Edges <V>{
    private Vertex<V> from;
    private Vertex<V> to;
    private  int weight;

    public Edges(Vertex<V> from, Vertex<V> to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public Vertex<V> getFrom() {
        return from;
    }

    public void setFrom(Vertex<V> from) {
        this.from = from;
    }

    public Vertex<V> getTo() {
        return to;
    }

    public void setTo(Vertex<V> to) {
        this.to = to;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


}
