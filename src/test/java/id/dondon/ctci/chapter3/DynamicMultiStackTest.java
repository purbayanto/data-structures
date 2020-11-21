package id.dondon.ctci.chapter3;

import id.dondon.stack.StackOverflowException;
import org.junit.Test;

public class DynamicMultiStackTest {

    @Test
    public void stack() throws StackOverflowException {
        DynamicMultiStack stacks = new DynamicMultiStack(3);
        System.out.println("Stack #0 => " + stacks.stackToString(0));
        System.out.println("Stack #1 => " + stacks.stackToString(1));
        System.out.println("Stack #2 => " + stacks.stackToString(2));

        System.out.println("----------------------------");
        stacks.push(0, 10);
        stacks.push(0, 11);
        stacks.push(0, 12);
        stacks.push(0, 13);
        System.out.println("Stack #0 => " + stacks.stackToString(0));

        stacks.push(1, 20);
        stacks.push(1, 21);
        stacks.push(1, 22);
        System.out.println("Stack #1 => " + stacks.stackToString(1));

        stacks.push(2, 30);
        stacks.push(2, 31);
        stacks.push(2, 32);
        stacks.push(2, 33);
        stacks.push(2, 34);
        System.out.println("Stack #2 => " + stacks.stackToString(2));
    }

}
