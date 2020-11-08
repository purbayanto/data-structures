package id.dondon.ctci.chapter2;

import id.dondon.linkedlist.LinkedList;
import id.dondon.linkedlist.Node;

import java.util.HashSet;
import java.util.Set;

/**
 * Remove Dups
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 * */
public class InterviewQuestion1 {

    /**
     * Solution with buffer
     * This takes O(N) time and O(N) Space
     * */
    public static void solution1(Node<Integer> head) {
        Set<Integer> set = new HashSet<Integer>();
        Node<Integer> previous = null;
        while (head != null) {
            if (set.contains(head.getData())) {
                previous.setNext(head.getNext());
            } else {
                set.add(head.getData());
                previous = head;
            }
            head = head.getNext();
        }
    }

    /**
     * Solution without buffer
     * This takes O(N²) time
     * */
    public static void solution2(Node<Integer> head) {
        Node<Integer> current = head;
        while (current != null) {
            /* Remove all future nodes that have the same value */
            Node<Integer> runner = current;
            while (runner.getNext() != null) {
                if (runner.getNext().getData().equals(current.getData())) {
                    runner.setNext(runner.getNext().getNext());
                } else {
                    runner = runner.getNext();
                }
            }
            current = current.getNext();
        }
    }

    /**
     * Solution without buffer with some improvement on the iteration
     * This takes O(N²) time
     * */
    public static void solution3(Node<Integer> head) {
        if (head == null) return;
        Node<Integer> previous = head;
        Node<Integer> current = previous.getNext();
        while (current != null) {
            // Look backwards for dups, and remove any that you see.
            Node<Integer> runner = head;
            while (runner != current) {
                if (runner.getData().equals(current.getData())) {
                    Node<Integer> tmp = current.getNext();
                    previous.setNext(tmp);
                    current = tmp;

                    // We know we can't have more than one dup preceding
                    // our element since it would have been removed earlier.
                    break;
                }
                runner = runner.getNext();
            }

            /* If runner == current, then we didn't find any duplicate
             * elements in the previous for loop.  We then need to
             * increment current.
             * If runner != current, then we must have hit the �break�
             * condition, in which case we found a dup and current has
             * already been incremented.*/
            if (runner == current) {
                previous = current;
                current = current.getNext();
            }
        }
    }

}
