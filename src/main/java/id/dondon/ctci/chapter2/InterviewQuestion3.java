package id.dondon.ctci.chapter2;

import id.dondon.linkedlist.Node;

/**
 * Delete Middle Node
 * Implement an algorithm to delete a node in the middle
 * (ie., any node but the first and last node, not necessarily the exact middle) of a singly linked list, given only access to that node.
 * EXAMPLE
 * Input: the node c from the linked list a- >b- >c - >d - >e- >f
 * Result: nothing is returned, but the new linked list looks like a->b->d->e->f
 * */
public class InterviewQuestion3 {

    public static boolean solution1(Node<Integer> node) {
        if (node == null || node.getNext() == null) {
            return false; // Failure
        }
        Node<Integer> next = node.getNext();
        node.setData(next.getData());
        node.setNext(next.getNext());
        return true;
    }

}
