package id.dondon.binarytrees.depthfirsttravelsal;

import id.dondon.binarytrees.Node;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreOrderTraversal {

    private final List<Object> result;

    public BinaryTreePreOrderTraversal() {
        this.result = new ArrayList<Object>();
    }

    private void print(Node<Character> node) {
        System.out.print(node.getData() + "->");
    }

    public List<Object> preOrder(Node<Character>root) {
        if (root == null) {
            return result;
        }

        print(root);
        result.add(root.getData());

        preOrder(root.getLeftChild());
        preOrder(root.getRightChild());

        return result;
    }

}
