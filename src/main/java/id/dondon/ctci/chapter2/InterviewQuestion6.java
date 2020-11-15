package id.dondon.ctci.chapter2;

import id.dondon.linkedlist.Node;
import id.dondon.stack.Stack;
import id.dondon.stack.StackOverflowException;
import id.dondon.stack.StackUnderflowException;

/**
 * Palindrome
 * Implement a function to check if a linked list is a palindrome.
 * */
public class InterviewQuestion6 {

    public static boolean solution1(Node<Integer> node) {
        Node<Integer> reverse = reverseAndClone(node);
        while (node != null && reverse != null) {
            if (node.getData() != reverse.getData()) {
                return false;
            }

            node = node.getNext();
            reverse = reverse.getNext();
        }

        return node == null && reverse == null;
    }

    public static boolean solution2(Node<Integer> node) throws StackOverflowException, StackUnderflowException {
        Node<Integer> fast = node;
        Node<Integer> slow = node;

        Stack<Integer> stack = new Stack<Integer>();

        /*
         * Push elements from first half of linked list onto stack.
         * When fast runner (which is moving at 2x speed) reaches the end of the linked list,
         * then we know we're at the middle 1
         * */
        while (fast != null && fast.getNext() != null) {
            stack.push(slow.getData());
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        // Has odd number of elements, so skip the middle element
        if (fast != null) {
           slow = slow.getNext();
        }

        while (slow != null) {
            int top = stack.pop();
            // if values are different, then it's not a palindrome
            if (top != slow.getData()) {
                return false;
            }

            slow = slow.getNext();
        }

        return true;
    }

    private static Node<Integer> reverseAndClone(Node<Integer> node) {
        Node<Integer> head = null;
        while (node != null) {
            Node<Integer> n = new Node<Integer>(node.getData());
            n.setNext(head);
            head = n;
            node = node.getNext();
        }

        return head;
    }

    public static boolean solution3(Node<Integer> node) {
        int length = lengthOfList(node);
        Result p = isPalindromeRecurse(node, length);

        return p.result;
    }

    private static int lengthOfList(Node<Integer> node) {
        if (node  == null) {
            return  0;
        } else {
            Node<Integer> curr = node;
            int count = 0;
            while (curr != null) {
                curr = curr.getNext();
                count++;
            }
            return count;
        }
    }

    private static Result isPalindromeRecurse(Node<Integer> head, int length) {
        if (head == null || length <= 0) { // Even number of nodes
            return new Result(head, true);
        } else if (length == 1) { // Odd number of nodes
            return new Result(head.getNext(), true);
        }

        /* Recurse on sublist. */
        Result res = isPalindromeRecurse(head.getNext(), length - 2);

        // If child calls are not a palindrome, pass back up a failure.
        if (!res.result || res.node == null) {
            return res;
        }

        /* Check if matches corresponding node on other side. */
        res.result = (head.getData() == res.node.getData());

        /* Return corresponding node. */
        res.node = res.node.getNext();

        return res;
    }

    public static class Result {
        public Node<Integer> node;
        public boolean result;
        public Result(Node<Integer> n, boolean res) {
            node = n;
            result = res;
        }
    }
}
