package id.dondon.queue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QueueBuiltWithTwoStacksTest {

  @Test
  public void enqueue() throws QueueOverflowException {
    final QueueBuiltWithTwoStacks<Integer> queue = new QueueBuiltWithTwoStacks<Integer>(5);

    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);

    assertEquals(false, queue.isFull());
    assertEquals(false, queue.isEmpty());
  }

  @Test
  public void enqueue_exceedLimit() throws QueueOverflowException {
    final QueueBuiltWithTwoStacks<Integer> queue = new QueueBuiltWithTwoStacks<Integer>(2);

    queue.enqueue(1);
    queue.enqueue(2);

    try {
      queue.enqueue(3);
    } catch (Exception ex) {
      assertEquals(true, ex instanceof QueueOverflowException);
    }

    assertEquals(true, queue.isFull());
    assertEquals(false, queue.isEmpty());
  }

  @Test
  public void dequeue() throws QueueUnderflowException, QueueOverflowException {
    final QueueBuiltWithTwoStacks<Integer> queue = new QueueBuiltWithTwoStacks<Integer>();

    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);

    int data = queue.dequeue();

    assertEquals(1, data);
    assertEquals(false, queue.isFull());
    assertEquals(false, queue.isEmpty());
  }

  @Test
  public void dequeue_emptyQueue() throws QueueUnderflowException, QueueOverflowException {
    final QueueBuiltWithTwoStacks<Integer> queue = new QueueBuiltWithTwoStacks<Integer>(1);

    queue.enqueue(1);
    try {
      queue.dequeue();
    } catch (Exception ex) {
      assertEquals(true, ex instanceof QueueUnderflowException);
    }

    assertEquals(false, queue.isFull());
    assertEquals(true, queue.isEmpty());
  }

}
