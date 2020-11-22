package id.dondon.ctci.chapter3;

import java.util.Stack;

/**
 * Sort Stack
 * Write a program to sort a stack such that the smallest items are on the top.
 * You can use an additional temporary stack, but you may not copy the elements into any other data structure (such as an array).
 * The stack supports the following operations: push, pop, peek, and isEmpty.
 * */
public class SortStack {

    public static Stack<Integer> mergesort(Stack<Integer> inStack) {
        if (inStack.size() <= 1) {
            return inStack;
        }

        Stack<Integer> left = new Stack<Integer>();
        Stack<Integer> right = new Stack<Integer>();
        int count = 0;
        while (inStack.size() != 0) {
            count++;
            if (count % 2 == 0) {
                left.push(inStack.pop());
            } else {
                right.push(inStack.pop());
            }
        }

        left = mergesort(left);
        right = mergesort(right);

        while (left.size() > 0 || right.size() > 0) {
            if (left.size() == 0) {
                inStack.push(right.pop());
            } else if (right.size() == 0) {
                inStack.push(left.pop());
            } else if (right.peek().compareTo(left.peek()) <= 0) {
                inStack.push(left.pop());
            } else {
                inStack.push(right.pop());
            }
        }

        Stack<Integer> reverseStack = new Stack<Integer>();
        while (inStack.size() > 0) {
            reverseStack.push(inStack.pop());
        }

        return reverseStack;
    }

    /**
     * This algorithm is 0 (N2 ) time and 0 (N) space.
     * */
    public static Stack<Integer> sort(Stack<Integer> s) {
        Stack<Integer> r = new Stack<Integer>();
        while(!s.isEmpty()) {
            /* Insert each element in s in sorted order into r. */
            int tmp = s.pop();
            while(!r.isEmpty() && r.peek() > tmp) {
                s.push(r.pop());
            }
            r.push(tmp);
        }

        /* Copy the elements back. */
        while (!r.isEmpty()) {
            s.push(r.pop());
        }
        return s;
    }

}
