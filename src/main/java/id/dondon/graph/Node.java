package id.dondon.graph;

import java.util.*;

public class Node {

    private int vertexNumber;
    private Set<Integer> adjacencySet = new HashSet<Integer>();

    public Node(int vertexNumber) {
        this.vertexNumber = vertexNumber;
    }

    public int getVertexNumber() {
        return vertexNumber;
    }

    public void addEdge(int vertexNumber) {
        adjacencySet.add(vertexNumber);
    }

    public List<Integer> getAdjacentVertices() {
        List<Integer> sortedList = new ArrayList<Integer>(adjacencySet);

        Collections.sort(sortedList);

        return sortedList;
    }

}
