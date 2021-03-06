package id.dondon.binarytrees;

import id.dondon.binarytrees.binarysearchtree.BinarySearchTree;
import id.dondon.binarytrees.depthfirsttravelsal.BinaryTreeInOrderTraversal;
import id.dondon.queue.QueueOverflowException;
import id.dondon.queue.QueueUnderflowException;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class BinarySearchTreeTest {

    @Test
    public void insertion() {
        Node<Integer> one = new Node<Integer>(1);
        Node<Integer> two = new Node<Integer>(2);
        Node<Integer> three = new Node<Integer>(3);
        Node<Integer> four = new Node<Integer>(4);
        Node<Integer> five = new Node<Integer>(5);
        Node<Integer> six = new Node<Integer>(6);
        Node<Integer> seven = new Node<Integer>(7);
        Node<Integer> eight = new Node<Integer>(8);
        Node<Integer> nine = new Node<Integer>(9);

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        Node<Integer> head = binarySearchTree.insert(null, five);

        binarySearchTree.insert(head, one);
        binarySearchTree.insert(head, seven);
        binarySearchTree.insert(head, three);
        binarySearchTree.insert(head, eight);
        binarySearchTree.insert(head, two);
        binarySearchTree.insert(head, nine);
        binarySearchTree.insert(head, six);
        binarySearchTree.insert(head, four);

        BinaryTreeInOrderTraversal inOrderTraversal = new BinaryTreeInOrderTraversal();
        List<Object> result = inOrderTraversal.inOrder(head);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        assertEquals(expected, result);
    }

    @Test
    public void lookup() {
        Node<Integer> one = new Node<Integer>(1);
        Node<Integer> two = new Node<Integer>(2);
        Node<Integer> three = new Node<Integer>(3);
        Node<Integer> four = new Node<Integer>(4);
        Node<Integer> five = new Node<Integer>(5);
        Node<Integer> six = new Node<Integer>(6);
        Node<Integer> seven = new Node<Integer>(7);
        Node<Integer> eight = new Node<Integer>(8);
        Node<Integer> nine = new Node<Integer>(9);

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        Node<Integer> head = binarySearchTree.insert(null, five);

        binarySearchTree.insert(head, one);
        binarySearchTree.insert(head, seven);
        binarySearchTree.insert(head, three);
        binarySearchTree.insert(head, eight);
        binarySearchTree.insert(head, two);
        binarySearchTree.insert(head, nine);
        binarySearchTree.insert(head, six);
        binarySearchTree.insert(head, four);

        Node<Integer> result7 = binarySearchTree.lookup(head, 7);
        Node<Integer> result12 = binarySearchTree.lookup(head, 12);

        assertEquals(Integer.valueOf(7), result7.getData());
        assertNull(result12);
    }

    @Test
    public void minimumValue() {
        Node<Integer> one = new Node<Integer>(1);
        Node<Integer> two = new Node<Integer>(2);
        Node<Integer> three = new Node<Integer>(3);
        Node<Integer> four = new Node<Integer>(4);
        Node<Integer> five = new Node<Integer>(5);
        Node<Integer> six = new Node<Integer>(6);
        Node<Integer> seven = new Node<Integer>(7);
        Node<Integer> eight = new Node<Integer>(8);
        Node<Integer> nine = new Node<Integer>(9);

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        Node<Integer> head = binarySearchTree.insert(null, five);

        binarySearchTree.insert(head, one);
        binarySearchTree.insert(head, seven);
        binarySearchTree.insert(head, three);
        binarySearchTree.insert(head, eight);
        binarySearchTree.insert(head, two);
        binarySearchTree.insert(head, nine);
        binarySearchTree.insert(head, six);
        binarySearchTree.insert(head, four);

        int result = binarySearchTree.minimumValue(head);

        assertEquals(1, result);
    }

    @Test
    public void maxDepth() {
        Node<Integer> one = new Node<Integer>(1);
        Node<Integer> two = new Node<Integer>(2);
        Node<Integer> three = new Node<Integer>(3);
        Node<Integer> four = new Node<Integer>(4);
        Node<Integer> five = new Node<Integer>(5);
        Node<Integer> six = new Node<Integer>(6);
        Node<Integer> seven = new Node<Integer>(7);
        Node<Integer> eight = new Node<Integer>(8);
        Node<Integer> nine = new Node<Integer>(9);

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        Node<Integer> head = binarySearchTree.insert(null, five);

        binarySearchTree.insert(head, one);
        binarySearchTree.insert(head, seven);
        binarySearchTree.insert(head, three);
        binarySearchTree.insert(head, eight);
        binarySearchTree.insert(head, two);
        binarySearchTree.insert(head, nine);
        binarySearchTree.insert(head, six);
        binarySearchTree.insert(head, four);

        int result = binarySearchTree.maxDepth(head);

        assertEquals(3, result);
    }

    @Test
    public void mirror() throws QueueUnderflowException, QueueOverflowException {
        Node<Integer> one = new Node<Integer>(1);
        Node<Integer> two = new Node<Integer>(2);
        Node<Integer> three = new Node<Integer>(3);
        Node<Integer> four = new Node<Integer>(4);
        Node<Integer> five = new Node<Integer>(5);
        Node<Integer> six = new Node<Integer>(6);
        Node<Integer> seven = new Node<Integer>(7);
        Node<Integer> eight = new Node<Integer>(8);
        Node<Integer> nine = new Node<Integer>(9);

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        Node<Integer> head = binarySearchTree.insert(null, five);

        binarySearchTree.insert(head, one);
        binarySearchTree.insert(head, seven);
        binarySearchTree.insert(head, three);
        binarySearchTree.insert(head, eight);
        binarySearchTree.insert(head, two);
        binarySearchTree.insert(head, nine);
        binarySearchTree.insert(head, six);
        binarySearchTree.insert(head, four);

        System.out.println("Original");
        BinaryTreeBreadthFirstTraversal binaryTreeBreadthFirstTraversal = new BinaryTreeBreadthFirstTraversal();
        binaryTreeBreadthFirstTraversal.breadthFirst(head);
        binarySearchTree.mirror(head);
        System.out.println();
        System.out.println("Mirror");
        List<Object> result = binaryTreeBreadthFirstTraversal.breadthFirst(head);
        List<Integer> expected = Arrays.asList(5, 7, 1, 8, 6, 3, 9, 4, 2);

        assertEquals(expected, result);
    }

    @Test
    public void countTrees() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int result1 = binarySearchTree.countTrees(1);
        assertEquals(1, result1);

        int result2 = binarySearchTree.countTrees(2);
        assertEquals(2, result2);

        int result3 = binarySearchTree.countTrees(3);
        assertEquals(5, result3);

        int result6 = binarySearchTree.countTrees(6);
        assertEquals(132, result6);
    }

    @Test
    public void printRange() throws QueueUnderflowException, QueueOverflowException {
        Node<Integer> one = new Node<Integer>(1);
        Node<Integer> two = new Node<Integer>(2);
        Node<Integer> three = new Node<Integer>(3);
        Node<Integer> four = new Node<Integer>(4);
        Node<Integer> five = new Node<Integer>(5);
        Node<Integer> six = new Node<Integer>(6);
        Node<Integer> seven = new Node<Integer>(7);
        Node<Integer> eight = new Node<Integer>(8);
        Node<Integer> nine = new Node<Integer>(9);

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        Node<Integer> head = binarySearchTree.insert(null, five);

        binarySearchTree.insert(head, one);
        binarySearchTree.insert(head, seven);
        binarySearchTree.insert(head, three);
        binarySearchTree.insert(head, eight);
        binarySearchTree.insert(head, two);
        binarySearchTree.insert(head, nine);
        binarySearchTree.insert(head, six);
        binarySearchTree.insert(head, four);

        System.out.println("Range");
        binarySearchTree.printRange(head, 2, 9);
    }

    @Test
    public void isBinarySearchTree() {
        Node<Integer> one = new Node<Integer>(1);
        Node<Integer> two = new Node<Integer>(2);
        Node<Integer> three = new Node<Integer>(3);
        Node<Integer> four = new Node<Integer>(4);
        Node<Integer> five = new Node<Integer>(5);
        Node<Integer> six = new Node<Integer>(6);
        Node<Integer> seven = new Node<Integer>(7);
        Node<Integer> eight = new Node<Integer>(8);
        Node<Integer> nine = new Node<Integer>(9);

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        Node<Integer> head = binarySearchTree.insert(null, five);

        binarySearchTree.insert(head, one);
        binarySearchTree.insert(head, seven);
        binarySearchTree.insert(head, three);
        binarySearchTree.insert(head, eight);
        binarySearchTree.insert(head, two);
        binarySearchTree.insert(head, nine);
        binarySearchTree.insert(head, six);
        binarySearchTree.insert(head, four);

        boolean result = binarySearchTree.isBinarySearchTree(head, Integer.MIN_VALUE, Integer.MAX_VALUE);
        assertTrue(result);
    }

}
