package id.dondon.ctci.chapter2;

import id.dondon.linkedlist.Node;

/**
 * Loop Detection
 * Given a circular linked list, implement an algorithm that returns the node at the beginning of the loop.
 * DEFINITION
 * Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node,
 * so as to make a loop in the linked list.
 *
 * EXAMPLE
 * Input: A -> B -> C -> D -> E -> C[the same C as earlier)
 * Output: C
 * */
public class InterviewQuestion8 {

    public static Node<Integer> solution1(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        // Find meeting point
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) {
                break;
            }
        }

        // Error check - there is no meeting point, and therefore no loop
        if (fast == null || fast.getNext() == null) {
            return null;
        }

		/* Move slow to Head. Keep fast at Meeting Point. Each are k steps
		 * from the Loop Start. If they move at the same pace, they must
		 * meet at Loop Start.
		 * */
        slow = head;
        while (slow != fast) {
            slow = slow.getNext();
            fast = fast.getNext();
        }

        // Both now point to the start of the loop.
        return fast;
    }

}
