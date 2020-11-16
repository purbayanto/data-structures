package id.dondon.ctci.chapter2;

import id.dondon.linkedlist.Node;

/**
 * Intersection
 * Given two (singly) linked lists, determine if the two lists intersect.
 * Return the intersecting node. Note that the intersection is defined based on reference, not value.
 * That is, if the kth node of the first linked list is the exact same node (by reference) as the jth node of the second linked list,
 * then they are intersecting.
 *
 * Example of Intersecting linked list :
 * 3 → 1 → 5 → 9 ➘
 *                7 → 2 → 1
 *         4 → 6 ➚
 *
 * Example of Non-Intersecting linked list :
 * 3 → 1 → 5 → 9 → 7 → 2 → 1
 *         4 → 6 → 7 → 2 → 1
 * */
public class InterviewQuestion7 {

    public static Node<Integer> solution1(Node<Integer> nodeA, Node<Integer> nodeB) {
        if (nodeA == null || nodeB == null) return null;

        // get tail and sizes
        Result result1 = getTailAndSize(nodeA);
        Result result2 = getTailAndSize(nodeB);

        // If different tail nodes, then there's no intersection
        if (result1.tail != result2.tail) {
            return null;
        }

        // Set pointers to the start of each linked list
        Node<Integer> shorter = result1.size < result2.size ? nodeA : nodeB;
        Node<Integer> longer = result1.size < result2.size ? nodeB : nodeA;

        // Advance the pointer for the longer linked list by the difference in lengths.
        longer = getKthNode(longer, Math.abs(result1.size - result2.size));

        // Move both pointers until you have a collision.
        while (shorter != longer) {
            shorter = shorter.getNext();
            longer = longer.getNext();
        }

        // Return either one.
        return longer;
    }

    private static Result getTailAndSize(Node<Integer> list) {
        if (list == null) return null;

        int size = 1;
        Node<Integer> current = list;
        while (current.getNext() != null) {
            size++;
            current = current.getNext();
        }

        return new Result(current, size);
    }

    private static Node<Integer> getKthNode(Node<Integer> head, int k) {
        Node<Integer> current = head;
        while (k > 0 && current != null) {
            current = current.getNext();
            k--;
        }
        return current;
    }

    private static class Result {
        public Node<Integer> tail;
        public int size;
        public Result(Node<Integer> tail, int size) {
            this. tail = tail;
            this.size = size;
        }
    }
}
