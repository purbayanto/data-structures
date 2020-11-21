package id.dondon.ctci.chapter3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackWithMinTest {

    @Test
    public void stackMin() {
        StackWithMin stackWithMin = new StackWithMin();
        stackWithMin.push(5);
        stackWithMin.push(3);
        stackWithMin.push(6);
        stackWithMin.push(8);

        assertEquals(3, stackWithMin.min());

        assertEquals(8, stackWithMin.pop().value);
        assertEquals(6, stackWithMin.pop().value);
        assertEquals(3, stackWithMin.pop().value);

        assertEquals(5, stackWithMin.min());
    }

}
