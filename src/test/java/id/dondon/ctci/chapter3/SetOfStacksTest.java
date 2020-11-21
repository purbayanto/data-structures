package id.dondon.ctci.chapter3;

import id.dondon.stack.StackUnderflowException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetOfStacksTest {

    @Test
    public void stacks() throws StackUnderflowException {
        SetOfStacks setOfStacks = new SetOfStacks(3);
        setOfStacks.push(1);
        setOfStacks.push(2);
        setOfStacks.push(3);
        setOfStacks.push(4);
        setOfStacks.push(5);
        setOfStacks.push(6);

        assertEquals(3, setOfStacks.popAt(0));
        assertEquals(4, setOfStacks.popAt(0));
        assertEquals(6, setOfStacks.popAt(1));
        assertEquals(5, setOfStacks.pop());
    }

}
