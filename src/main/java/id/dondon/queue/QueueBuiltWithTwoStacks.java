package id.dondon.queue;

import id.dondon.stack.Stack;

public class QueueBuiltWithTwoStacks<T> {

  private final Stack<T> forwardStack;
  private final Stack<T> reverseStack;

  public QueueBuiltWithTwoStacks() {
    forwardStack = new Stack<T>();
    reverseStack = new Stack<T>();
  }

  public QueueBuiltWithTwoStacks(int maxSize) {
    forwardStack = new Stack<T>(maxSize);
    reverseStack = new Stack<T>(maxSize);
  }

  public void enqueue(T data) throws QueueOverflowException {
    if (isFull()) {
      throw new QueueOverflowException();
    }

    try {
      if (forwardStack.isEmpty()) {
        while (!reverseStack.isEmpty()) {
          forwardStack.push(reverseStack.pop());
        }
      }
      forwardStack.push(data);
    } catch (Exception ex) {
      throw new QueueOverflowException();
    }
  }

  public T dequeue() throws QueueUnderflowException {
    if (isEmpty()) {
      throw new QueueUnderflowException();
    }

    try {
      if (reverseStack.isEmpty()) {
        while (!forwardStack.isEmpty()) {
          reverseStack.push(forwardStack.pop());
        }
      }

      return reverseStack.pop();
    } catch (Exception ex) {
      throw new QueueUnderflowException();
    }
  }

  public boolean isFull() {
    return forwardStack.isFull() || reverseStack.isFull();
  }

  public boolean isEmpty() {
    return forwardStack.isEmpty() && reverseStack.isEmpty();
  }

}
