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

    public int minimumValue(Node<Integer> head) {
        if (head == null) {
            return Integer.MIN_VALUE;
        }

        if (head.getLeftChild() == null) {
            return head.getData();
        }

        return minimumValue(head.getLeftChild());
    }

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        if (root.getLeftChild() == null && root.getRightChild() == null) {
            return 0;
        }

        int leftMaxDepth = 1 + maxDepth(root.getLeftChild());
        int rightMaxDepth = 1 + maxDepth(root.getRightChild());

        return Math.max(leftMaxDepth, rightMaxDepth);
    }

    public void mirror(Node<Integer> root) {
        if (root == null) {
            return;
        }

        mirror(root.getLeftChild());
        mirror(root.getRightChild());

        // Swap the left and the right child of each node.
        Node<Integer> temp = root.getLeftChild();
        root.setLeftChild(root.getRightChild());
        root.setRightChild(temp);
    }

    public int countTrees(int numNodes) {
        if (numNodes <= 1) {
            return 1;
        }

        int sum = 0;
        for (int i = 1; i <= numNodes; i++) {
            int countLeftTrees = countTrees(i - 1);
            int countRightTrees = countTrees(numNodes - i);

            sum = sum + (countLeftTrees * countRightTrees);
        }

        return sum;
    }

    public void printRange(Node<Integer> root, int low, int high) {
        if (root == null) {
            return;
        }

        if (low <= root.getData()) {
            printRange(root.getLeftChild(), low, high);
        }

        if (low <= root.getData() && root.getData() <= high) {
            System.out.println(root.getData());
        }

        if (high > root.getData()) {
            printRange(root.getRightChild(), low, high);
        }
    }

    public boolean isBinarySearchTree(Node<Integer> root, int min, int max) {
        if (root == null) {
            return true;
        }

        if (root.getData() <= min || root.getData() > max) {
            return false;
        }

        return isBinarySearchTree(root.getLeftChild(), min, root.getData())
            && isBinarySearchTree(root.getRightChild(), root.getData(), max);
    }

}
