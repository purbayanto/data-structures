package id.dondon.ctci.chapter3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackWithMin2Test {

    @Test
    public void stackMin() {
        StackWithMin2 stackWithMin = new StackWithMin2();
        stackWithMin.push(5);
        stackWithMin.push(3);
        stackWithMin.push(6);
        stackWithMin.push(8);

        assertEquals(3, stackWithMin.min());

        assertEquals(8, (int) stackWithMin.pop());
        assertEquals(6, (int) stackWithMin.pop());
        assertEquals(3, (int) stackWithMin.pop());

        assertEquals(5, stackWithMin.min());
    }

}
