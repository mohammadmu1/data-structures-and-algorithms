# businessTrip Algorithm Explanation

The `businessTrip` algorithm determines whether a trip between a sequence of cities is possible with direct flights and calculates the total cost of the trip if it is possible.

![DFASDF](./Whiteboard%2021.png)
```java
public static Integer businessTrip(Graph<String> graph, String[] cities) {
   
    if (cities == null || cities.length <= 1) {
        return 0;
    }

    
    int totalCost = 0;

  
    for (int i = 0; i < cities.length - 1; i++) {
        String currentCity = cities[i];
        String nextCity = cities[i + 1];

        if (!graph.isContainValue(currentCity) || !graph.isContainValue(nextCity)) {
            return null;
        }

        Vertex<String> currentVertex = graph.getVertices().stream()
                .filter(v -> v.getValue().equals(currentCity))
                .findFirst()
                .orElse(null);

      
        if (currentVertex == null || !graph.isConnected(currentVertex, new Vertex<>(nextCity))) {
            return null;
        }

        totalCost += graph.getNeighbors(currentVertex).stream()
                .filter(e -> e.getTo().getValue().equals(nextCity))
                .findFirst()
                .orElseThrow(IllegalStateException::new)
                .getWeight();
    }

   
    return totalCost;
}

```

## Algorithm Steps:

1. **Base Case Check:**
   - The algorithm starts by checking if the `cities` array is null or contains only one city. If so, it returns `0` to indicate that no travel is involved.

2. **Iterating through City Pairs:**
   - The algorithm then iterates through the array of city names, considering each pair of consecutive cities.

3. **City Existence Check:**
   - For each pair of consecutive cities, it checks whether both cities exist in the graph. If either city is not in the graph, the algorithm returns `null`, indicating that the trip is not possible.

4. **Getting Current Vertex:**
   - The algorithm retrieves the corresponding vertex for the current city from the graph. If the vertex is not found, it returns `null`.

5. **Direct Flight Check:**
   - It checks if there is a direct flight between the current city and the next city. If there is no direct flight, the algorithm returns `null`.

6. **Calculating Total Cost:**
   - If all the above checks pass, the algorithm adds the cost of the direct flight between the current city and the next city to the total cost.

7. **Returning Total Cost:**
   - Finally, the algorithm returns the total cost of the trip if it is possible. If the trip is not possible due to any of the checks, it returns `null`.

## Assumptions:
- The algorithm assumes that the graph is implemented in a way that vertices represent cities, edges represent direct flights between cities, and edge weights represent the cost of the flights.

This algorithm provides a way to verify the feasibility and cost of a trip based on direct flights between cities in a graph. It is important to adapt the algorithm to the specific implementation details of the graph used in your context.

