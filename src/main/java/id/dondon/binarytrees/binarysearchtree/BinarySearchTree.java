package id.dondon.binarytrees.binarysearchtree;

import id.dondon.binarytrees.Node;

public class BinarySearchTree {

    public void print(Node node) {
        System.out.print(node.getData() + "->");
    }

    public Node<Integer> insert(Node<Integer> head, Node<Integer> node) {
        if (head == null) {
            return node;
        }

        if (node.getData() <= head.getData()) {
            head.setLeftChild(insert(head.getLeftChild(), node));
        } else {
            head.setRightChild(insert(head.getRightChild(), node));
        }

        return head;
    }

    public Node<Integer> lookup(Node<Integer> head, int data) {
        if (head == null) {
            return null;
        }
        if (head.getData() == data) {
            return head;
        }

        if (data <= head.getData()) {
            return lookup(head.getLeftChild(), data);
        } else {
            return lookup(head.getRightChild(), data);
        }
    }

}
