package id.dondon.graph;

import java.util.List;

public class GraphDepthFirstTraversal {

    public static void depthFirstTraversal(Graph graph, int[] visited, int currentVertex) {
        if (visited[currentVertex] == 1) {
            return;
        }
        visited[currentVertex] = 1;

        List<Integer> list = graph.getAdjacentVertices(currentVertex);
        for (int vertex : list) {
            depthFirstTraversal(graph, visited, vertex);
        }

        System.out.print(currentVertex + "->");
    }

}
