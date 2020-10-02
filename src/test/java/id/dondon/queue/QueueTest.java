package id.dondon.queue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QueueTest {

  @Test
  public void enqueue() throws QueueOverflowException {
    Queue<Integer> queue = new Queue<Integer>(Integer.class, 4);

    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);

    assertEquals(false, queue.isFull());
    assertEquals(false, queue.isEmpty());
  }

  @Test
  public void enqueue_exceedLimit() throws QueueOverflowException {
    Queue<Integer> queue = new Queue<Integer>(Integer.class, 4);

    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);

    assertEquals(true, queue.isFull());
    assertEquals(false, queue.isEmpty());

    try {
      queue.enqueue(5);
    } catch (Exception exception) {
      assertEquals(true, exception instanceof QueueOverflowException);
    }
  }

  @Test
  public void dequeue() throws QueueOverflowException, QueueUnderflowException {
    Queue<Integer> queue = new Queue<Integer>(Integer.class, 4);

    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);

    int data = queue.dequeue();
    assertEquals(1, data);
    assertEquals(false, queue.isFull());
    assertEquals(false, queue.isEmpty());
  }

  @Test
  public void dequeue_withEmptyQueue() throws QueueOverflowException, QueueUnderflowException {
    Queue<Integer> queue = new Queue<Integer>(Integer.class, 1);

    queue.enqueue(1);

    int data = queue.dequeue();
    assertEquals(1, data);
    assertEquals(false, queue.isFull());
    assertEquals(true, queue.isEmpty());

    try {
      queue.dequeue();
    } catch (Exception exception) {
      assertEquals(true, exception instanceof QueueUnderflowException);
    }
  }

  @Test
  public void peek() throws QueueOverflowException, QueueUnderflowException {
    Queue<Integer> queue = new Queue<Integer>(Integer.class, 1);

    queue.enqueue(1);

    int data = queue.peek();
    assertEquals(1, data);
    assertEquals(true, queue.isFull());
    assertEquals(false, queue.isEmpty());
  }

}
