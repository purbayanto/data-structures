package id.dondon.graph;

import id.dondon.queue.Queue;
import id.dondon.queue.QueueOverflowException;
import id.dondon.queue.QueueUnderflowException;

import java.util.List;

public class GraphBreadthFirstTraversal {

    public static void breadthFirstTraversal(Graph graph, int[] visited, int currentVertex)
            throws QueueOverflowException, QueueUnderflowException {

        Queue<Integer> queue = new Queue<Integer>(Integer.class);
        queue.enqueue(currentVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.dequeue();

            if (visited[vertex] == 1) {
                continue;
            }

            System.out.print(vertex + "->");
            visited[vertex] = 1;

            List<Integer> list = graph.getAdjacentVertices(vertex);
            for (int v : list) {
                if (visited[v] != 1) {
                    queue.enqueue(v);
                }
            }
        }
    }

}
