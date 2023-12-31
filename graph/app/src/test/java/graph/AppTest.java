/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    Graph<String> stringGraph;
    Graph<Integer> integerGraph;

    @BeforeEach
    void createGraph() {
        stringGraph = new Graph<>();
        integerGraph = new Graph<>();
    }

    @Test
    void assertAddVertex(){
        stringGraph.addVertex("Mohammed");
        assertTrue(stringGraph.isContainValue("Mohammed"));
        assertFalse(stringGraph.isContainValue("graph"));
    }

    @Test
    void assertAddVertex2(){
        integerGraph.addVertex(20);
        assertTrue(integerGraph.isContainValue(20));
        assertFalse(integerGraph.isContainValue(30));
    }

    @Test
    void assertAddEdges(){
        Vertex<Integer> vertex1 = new Vertex<>(10);
        Vertex<Integer> vertex2 = new Vertex<>(20);
        Vertex<Integer> vertex3 = new Vertex<>(30);

        integerGraph.addVertex(vertex1.getValue());
        integerGraph.addVertex(vertex2.getValue());
        integerGraph.addVertex(vertex3.getValue());
        integerGraph.addEdge(vertex1,vertex2);
        assertTrue(integerGraph.isConnected(vertex1,vertex2));

        assertFalse(integerGraph.isConnected(vertex1,vertex3));
    }



    @Test
    void assertAllNeighbors (){
        Vertex<Integer> vertex1 = new Vertex<>(10);
        Vertex<Integer> vertex2 = new Vertex<>(20);
        Vertex<Integer> vertex3 = new Vertex<>(30);
        integerGraph.addVertex(vertex1.getValue());
        integerGraph.addVertex(vertex2.getValue());
        integerGraph.addVertex(vertex3.getValue());
        assertNotEquals(0,integerGraph.getVertices().size());

    }

    @Test
    void size(){
        Vertex<Integer> vertex1 = new Vertex<>(10);
        Vertex<Integer> vertex2 = new Vertex<>(20);
        Vertex<Integer> vertex3 = new Vertex<>(30);
        integerGraph.addVertex(vertex1.getValue());
        integerGraph.addVertex(vertex2.getValue());
        integerGraph.addVertex(vertex3.getValue());
        assertEquals(3,integerGraph.size());

    }



    //  For CC 36






    @Test
    void testExpected() {
        Graph<String> stringGraph = new Graph<>();
        Vertex<String> vertexA = stringGraph.addVertex("A");
        Vertex<String> vertexB = stringGraph.addVertex("B");
        Vertex<String> vertexC = stringGraph.addVertex("C");
        Vertex<String> vertexD = stringGraph.addVertex("D");
        Vertex<String> vertexE = stringGraph.addVertex("E");
        Vertex<String> vertexF = stringGraph.addVertex("F");

        stringGraph.addEdge(vertexA, vertexB);
        stringGraph.addEdge(vertexB, vertexC);
        stringGraph.addEdge(vertexD, vertexC);
        stringGraph.addEdge(vertexD, vertexF);
        stringGraph.addEdge(vertexC, vertexF);
        stringGraph.addEdge(vertexC, vertexE);

        List<String> expected = List.of("A", "B", "C", "D", "F", "E");
        List<String> bfsResult = stringGraph.breadthFirst(vertexA);
        assertEquals(expected, bfsResult);
    }
    @Test
    void testBreadthFirstWithSingleVertex() {
        Graph<String> graph = new Graph<>();
        Vertex<String> singleVertex = graph.addVertex("A");

        List<String> bfsResult = graph.breadthFirst(singleVertex);

        assertEquals(List.of("A"), bfsResult);
    }

    @Test
    void testIsContainValue() {
        Graph<String> graph = new Graph<>();
        graph.addVertex("A");

        assertTrue(graph.isContainValue("A"));
        assertFalse(graph.isContainValue("B"));
    }


    @Test
    void testExpectedFailure() {


        Vertex<String> vertex = new Vertex<>("Pandora");
        Vertex<String> vertex2 = new Vertex<>("Pandora");
        Vertex<String> vertex3 = new Vertex<>("Pandora");
        Vertex<String> vertex4 = new Vertex<>("Pandora");
        Vertex<String> vertex5 = new Vertex<>("Pandora");
        Vertex<String> vertex6 = new Vertex<>("Pandora");

        stringGraph.addVertex("Pandora");
        stringGraph.addVertex("Pandora");
        stringGraph.addVertex("Pandora");
        stringGraph.addVertex("Pandora");
        stringGraph.addVertex("Pandora");
        stringGraph.addVertex("Pandora");

        
        stringGraph.addEdge(vertex, vertex2);
        stringGraph.addEdge(vertex2, vertex3);
        stringGraph.addEdge(vertex4, vertex3);
        stringGraph.addEdge(vertex4, vertex6);
        stringGraph.addEdge(vertex3, vertex6);
        stringGraph.addEdge(vertex3, vertex5);

        List<String> expected = List.of("Pandora");
        assertEquals(expected, stringGraph.breadthFirst(vertex));
    }

    //CC37
    @Test
    public void testBusinessTrip() {
        Graph<String> flightGraph = new Graph<>();
        Vertex<String> cityA = flightGraph.addVertex("A");
        Vertex<String> cityB = flightGraph.addVertex("B");
        Vertex<String> cityC = flightGraph.addVertex("C");

        flightGraph.addEdge(cityA, cityB, 100);
        flightGraph.addEdge(cityB, cityC, 150); 

        // Test a valid trip
        String[] validTripCities = {"A", "B", "C"};
        Integer validTripCost = Graph.businessTrip(flightGraph, validTripCities);
        assertNotNull(validTripCost);
        assertEquals(250, validTripCost);




        String[] singleCityTrip = {"A"};
        Integer singleCityCost = Graph.businessTrip(flightGraph, singleCityTrip);
        assertEquals(0, singleCityCost);


        String[] emptyTrip = {};
        Integer emptyTripCost = Graph.businessTrip(flightGraph, emptyTrip);
        assertEquals(0, emptyTripCost);
    }

}
