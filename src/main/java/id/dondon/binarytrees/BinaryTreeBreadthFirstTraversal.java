package id.dondon.binarytrees;

import id.dondon.queue.Queue;
import id.dondon.queue.QueueOverflowException;
import id.dondon.queue.QueueUnderflowException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeBreadthFirstTraversal {

    public List<Object> breadthFirst(Node root) throws QueueUnderflowException, QueueOverflowException {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Object> result = new ArrayList<Object>();
        Queue<Node> queue = new Queue<Node>(Node.class);
        queue.enqueue(root);
        while (!queue.isEmpty()) {
            Node node = queue.dequeue();
            print(node);
            result.add(node.getData());

            if (node.getLeftChild() != null) {
                queue.enqueue(node.getLeftChild());
            }
            if (node.getRightChild() != null) {
                queue.enqueue(node.getRightChild());
            }
        }

        return result;
    }

    private void print(Node node) {
        System.out.print(node.getData() + "->");
    }

}
