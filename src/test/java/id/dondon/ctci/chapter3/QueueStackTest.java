package id.dondon.ctci.chapter3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueStackTest {

    @Test
    public void queueStack() {
        QueueStack<Integer> queueStack = new QueueStack<Integer>();
        queueStack.add(1);
        queueStack.add(2);
        queueStack.add(3);
        queueStack.add(4);

        assertEquals(1, (int) queueStack.remove());
        assertEquals(2, (int) queueStack.remove());
        assertEquals(3, (int) queueStack.peek());
        assertEquals(3, (int) queueStack.peek());

        queueStack.add(5);
        assertEquals(3, (int) queueStack.remove());
    }

}
