package id.dondon.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {

    @Test
    public void pushAndPop() throws StackOverflowException, StackUnderflowException {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.getSize());
        assertEquals(Integer.valueOf(3), stack.pop());
        assertEquals(2, stack.getSize());
        assertEquals(false, stack.isFull());
        assertEquals(false, stack.isEmpty());
    }

    @Test
    public void pushAndPeek() throws StackOverflowException, StackUnderflowException {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.getSize());
        assertEquals(Integer.valueOf(3), stack.peek());
        assertEquals(3, stack.getSize());
        assertEquals(false, stack.isFull());
        assertEquals(false, stack.isEmpty());
    }

    @Test
    public void pushWithExceedLimit() throws StackOverflowException {
        Stack<Integer> stack = new Stack<Integer>(3);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        try {
            stack.push(4);
        } catch (StackOverflowException soe) {
            System.out.println("Stack is full! No room available.");
        }
    }

    @Test
    public void popWithNoRemainingElements() throws StackOverflowException {
        Stack<Integer> stack = new Stack<Integer>(3);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        try {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
        } catch (StackUnderflowException sue) {
            System.out.println("Stack is empty! No elements available.");
        }
    }

}
