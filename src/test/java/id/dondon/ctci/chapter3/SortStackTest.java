package id.dondon.ctci.chapter3;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class SortStackTest {

    @Test
    public void sort() {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(5);
        stack.push(2);
        stack.push(4);
        stack.push(3);

        Stack<Integer> expected = new Stack<Integer>();
        expected.push(5);
        expected.push(4);
        expected.push(3);
        expected.push(2);
        expected.push(1);

        Stack<Integer> result = SortStack.sort(stack);
        assertEquals(expected, result);
    }

    @Test
    public void mergesort() {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(5);
        stack.push(2);
        stack.push(4);
        stack.push(3);

        Stack<Integer> expected = new Stack<Integer>();
        expected.push(1);
        expected.push(2);
        expected.push(3);
        expected.push(4);
        expected.push(5);

        Stack<Integer> result = SortStack.mergesort(stack);
        assertEquals(expected, result);
    }

}
