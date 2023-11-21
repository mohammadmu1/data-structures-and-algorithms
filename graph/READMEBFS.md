# prplem domain 

Apply BFS on Graph

## White Board

![WB](./Whiteboard%2020.png)

# Breadth-First Search Algorithm Explanation

## Initialization
```java

public List<V> breadthFirst(Vertex<V> root) {
        List<V> out = new ArrayList<>();
        Set<Vertex<V>> visited = new HashSet<>();
        Queue<Vertex<V>> queue = new ArrayDeque<>();
        if (vertex.get(root.getValue()) == null)
            return out;
        queue.add(vertex.get(root.getValue()));
        while (!queue.isEmpty()) {
            Vertex<V> node = queue.remove();
            if (visited.contains(node)) {
                continue;
            }
            out.add(node.getValue());
            visited.add(node);
            for (Edges<V> e : node.getEdges()) {
                if (!visited.contains(e.getTo()))
                    queue.add(vertex.get(e.getTo().getValue()));
            }
        }

        return out;
    }
```
Breadth-First Search (BFS) implementation for traversing a graph. BFS starts from a specified "root" vertex and systematically explores the graph, visiting neighbors before moving on to the next level of vertices. The algorithm uses a queue to manage the order in which vertices are processed, ensuring that vertices closer to the starting point are visited first. Additionally, it maintains a set to keep track of visited vertices, preventing the algorithm from revisiting them. The traversal process continues until all reachable vertices in the graph have been visited. The algorithm outputs a list of visited vertices, representing the order in which they were encountered during the breadth-first exploration



# Breadth-First Search Algorithm Complexity Analysis

## Time Complexity
The time complexity of this Breadth-First Search (BFS) algorithm is O(V + E), where V is the number of vertices and E is the number of edges in the graph. The algorithm processes each vertex and edge once, and the presence of both terms in the expression reflects a linear relationship with the size of the input graph.

## Space Complexity
The space complexity is O(V), where V is the number of vertices. This is because, in the worst case, the algorithm needs to store information about all vertices in the graph. The queue, set of visited vertices, and the output list contribute to this space complexity.
