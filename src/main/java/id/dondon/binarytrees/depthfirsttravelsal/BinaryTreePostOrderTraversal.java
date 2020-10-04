package id.dondon.binarytrees.depthfirsttravelsal;

import id.dondon.binarytrees.Node;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostOrderTraversal {

    private final List<Object> result;

    public BinaryTreePostOrderTraversal() {
        this.result = new ArrayList<Object>();
    }

    private void print(Node node) {
        System.out.print(node.getData() + "->");
    }

    public List<Object> postOrder(Node root) {
        if (root == null) {
            return result;
        }

        postOrder(root.getLeftChild());
        postOrder(root.getRightChild());
        print(root);
        result.add(root.getData());

        return result;
    }

}
