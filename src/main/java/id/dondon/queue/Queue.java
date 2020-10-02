package id.dondon.queue;

import java.lang.reflect.Array;

public class Queue<T> {

  private static final int SPECIAL_EMPTY_VALUE = -1;
  private static int MAX_SIZE = 40;
  private T[] elements;

  // The head index is initialized to a special value which
  // indicate that the queue is empty.
  private int headIndex = SPECIAL_EMPTY_VALUE;
  private int tailIndex = SPECIAL_EMPTY_VALUE;

  public Queue(Class<T> clazz) {
    this(clazz, MAX_SIZE);
  }

  public Queue(Class<T> clazz, int size) {
    MAX_SIZE = size;
    elements = (T[]) Array.newInstance(clazz, MAX_SIZE);
  }

  public void enqueue(T data) throws QueueOverflowException {
    if (isFull()) {
      throw new QueueOverflowException();
    }
    tailIndex = (tailIndex + 1) % elements.length;
    elements[tailIndex] = data;

    // This is the first element enqueued, set the head index
    // to the tail index.
    if (headIndex == SPECIAL_EMPTY_VALUE) {
      headIndex = tailIndex;
    }
  }

  public boolean offer(T data) {
    if (isFull()) {
      return false;
    }
    try {
      enqueue(data);
    } catch (QueueOverflowException qoe) {
      // Ignore, this should never happen, we've checked
      // for a full queue already.
    }

    return true;
  }


  public T dequeue() throws QueueUnderflowException {
    if (isEmpty()) {
      throw new QueueUnderflowException();
    }

    T data = elements[headIndex];

    // This was the last element in the queue.
    if (headIndex == tailIndex) {
      headIndex = SPECIAL_EMPTY_VALUE;
    } else {
      headIndex = (headIndex + 1) % elements.length;
    }

    return data;
  }

  public T peek() throws QueueUnderflowException {
    if (isEmpty()) {
      throw new QueueUnderflowException();
    }

    return elements[headIndex];
  }

  public boolean isEmpty()  {
    return headIndex == SPECIAL_EMPTY_VALUE;
  }

  public boolean isFull()  {
    int nextIndex = (tailIndex + 1) % elements.length;

    return nextIndex == headIndex;
  }

}
