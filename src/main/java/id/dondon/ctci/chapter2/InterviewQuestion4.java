package id.dondon.ctci.chapter2;


import id.dondon.linkedlist.Node;

/**
 * Partition
 * Write code to partition a linked list around a value x,
 * such that all nodes less than x come before all nodes greater than or equal to x.
 * If x is contained within the list, the values of x only need to be after the elements less than x (see below).
 * The partition element x can appear anywhere in the "right partition";
 * it does not need to appear between the left and right partitions.
 * */
public class InterviewQuestion4 {

    public static Node<Integer> solution1(Node<Integer> node, int x) {
        Node<Integer> beforeStart = null;
        Node<Integer> beforeEnd = null;
        Node<Integer> afterStart = null;
        Node<Integer> afterEnd = null;

        /* Partition list */
        while (node != null) {
            Node<Integer> next = node.getNext();
            node.setNext(null);
            if (node.getData() < x) {
                if (beforeStart == null) {
                    beforeStart = node;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.setNext(node);
                    beforeEnd = node;
                }
            } else {
                if (afterStart == null) {
                    afterStart = node;
                    afterEnd = afterStart;
                } else {
                    afterEnd.setNext(node);
                    afterEnd = node;
                }
            }
            node = next;
        }

        /* Merge before list and after list */
        if (beforeStart == null) {
            return afterStart;
        }

        beforeEnd.setNext(afterStart);
        return beforeStart;
    }

}
