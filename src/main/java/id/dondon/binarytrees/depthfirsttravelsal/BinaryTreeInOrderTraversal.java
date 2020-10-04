package id.dondon.binarytrees.depthfirsttravelsal;

import id.dondon.binarytrees.Node;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInOrderTraversal {

    private final List<Object> result;

    public BinaryTreeInOrderTraversal() {
        this.result = new ArrayList<Object>();
    }

    private void print(Node node) {
        System.out.print(node.getData() + "->");
    }

    public List<Object> inOrder(Node root) {
        if (root == null) {
            return result;
        }

        inOrder(root.getLeftChild());
        print(root);
        result.add(root.getData());
        inOrder(root.getRightChild());

        return result;
    }

}
