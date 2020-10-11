package id.dondon.graph;

import id.dondon.queue.QueueOverflowException;
import id.dondon.queue.QueueUnderflowException;
import org.junit.Test;

public class GraphBreadthFirstTraversalTest {

    @Test
    public void depthFirstTraversal() throws QueueUnderflowException, QueueOverflowException {
        int n = 8;
        Graph graph = new AdjacencyMatrixGraph(n, Graph.GraphType.DIRECTED);
        graph.addEdge(1, 0);
        graph.addEdge(1, 2);
        graph.addEdge(2, 7);
        graph.addEdge(2, 4);
        graph.addEdge(2, 3);
        graph.addEdge(1, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 3);
        graph.addEdge(3, 4);

        int[] visited = new int[] {0, 0, 0, 0, 0, 0, 0, 0};

        // This for-loop ensures that all nodes are covered even for an unconnected
        // graph.
        for (int i = 0; i < n; i++) {
            GraphBreadthFirstTraversal.breadthFirstTraversal(graph, visited, i);
        }
    }

}
