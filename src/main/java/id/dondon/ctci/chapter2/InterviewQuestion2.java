package id.dondon.ctci.chapter2;

import id.dondon.linkedlist.Node;

/**
 * Return Kth to Last
 * Implement an algorithm to find the kth to last element of a singly linked list
 * */
public class InterviewQuestion2 {

    public static int solution1(Node<Integer> head, int k) {
        if (head == null) {
            return 0;
        }
        int index = solution1(head.getNext(), k) + 1;
        if (index == k) {
            System.out.println(k + "th to last node is " + head.getData());
            return index;
        }

        return index;
    }

    public static int solution2(Node<Integer> head, int k) {
        Node<Integer> p1 = head;
        Node<Integer> p2 = head;

        /* Move p1 k nodes into the list.*/
        for (int i = 0; i < k; i++) {
            if (p1 == null) return -1; // Out of bounds
            p1 = p1.getNext();
        }

        /* Move them at the same pace. When p1 hits the end,
         * p2 will be at the right element. */
        while (p1 != null) {
            p1 = p1.getNext();
            p2 = p2.getNext();
        }

        if (p2 != null) {
            return p2.getData();
        }

        return -1;
    }

}
