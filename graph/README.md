# Data Structure

The graph is implemented using an adjacency list. Vertices are stored in a HashMap, where the key is the vertex value and the value is the corresponding Vertex object. Edges are represented as a HashSet of Edges in each Vertex object.

## Methods

### `addVertex(V value)`

Adds a new vertex to the graph.

**Time Complexity:** O(1)

### `addEdge(Vertex vertex1, Vertex vertex2, int weight)`

Adds a weighted edge between two vertices.

**Time Complexity:** O(1)

### `addEdge(Vertex vertex1, Vertex vertex2)`

Adds an unweighted edge between two vertices.

**Time Complexity:** O(1)

### `getVertices()`

Returns a collection of all vertices in the graph.

**Time Complexity:** O(1)

### `getNeighbors(Vertex vertex)`

Returns a HashSet of edges connected to the specified vertex.

**Time Complexity:** O(1)

### `size()`

Returns the number of vertices in the graph.

**Time Complexity:** O(1)

### `isContainVertex(Vertex vertex)`

Checks if the graph contains a specific vertex.

**Time Complexity:** O(1)

### `isContainValue(V value)`

Checks if the graph contains a vertex with a specific value.

**Time Complexity:** O(1)

### `isConnected(Vertex vertex, Vertex connectedVertex)`

Checks if there is a connection (edge) between two vertices.

**Time Complexity:** O(E), where E is the number of edges.
