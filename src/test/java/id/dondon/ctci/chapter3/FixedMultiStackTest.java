package id.dondon.ctci.chapter3;

import id.dondon.stack.StackOverflowException;
import org.junit.Test;

public class FixedMultiStackTest {

    @Test
    public void stack() throws StackOverflowException {
        FixedMultiStack stacks = new FixedMultiStack(4);
        System.out.println("Stack #0 => " + stacks.stackToString(0));
        System.out.println("Stack #1 => " + stacks.stackToString(1));
        System.out.println("Stack #2 => " + stacks.stackToString(2));

        System.out.println("----------------------------");
        stacks.push(0, 10);
        System.out.println("Stack #0 => " + stacks.stackToString(0));

        stacks.push(1, 20);
        System.out.println("Stack #1 => " + stacks.stackToString(1));

        stacks.push(2, 30);
        System.out.println("Stack #2 => " + stacks.stackToString(2));
    }
}
