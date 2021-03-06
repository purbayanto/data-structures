package id.dondon.ctci.chapter3;

import java.util.Stack;

public class StackWithMin2 extends Stack<Integer> {
    Stack<Integer> minStack;

    public StackWithMin2() {
        minStack = new Stack<Integer>();
    }

    public void push(int value){
        if (value <= min()) {
            minStack.push(value);
        }
        super.push(value);
    }

    public Integer pop() {
        int value = super.pop();
        if (value == min()) {
            minStack.pop();
        }
        return value;
    }

    public int min() {
        if (minStack.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return minStack.peek();
        }
    }
}
