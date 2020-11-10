package id.dondon.ctci.chapter2;

import static org.junit.Assert.assertEquals;

import id.dondon.linkedlist.LinkedList;
import id.dondon.linkedlist.Node;
import id.dondon.stack.Stack;
import id.dondon.stack.StackOverflowException;
import id.dondon.stack.StackUnderflowException;
import org.junit.Test;

public class InterviewQuestion5Test {

  @Test
  public void solution1() throws StackOverflowException, StackUnderflowException {
    // (7-> 1 -> 6)
    // That is,617
    LinkedList<Integer> l1 = new LinkedList<Integer>();
    l1.addNode(7);
    l1.addNode(1);
    l1.addNode(6);

    // (5 -> 9 -> 2)
    // That is, 295
    LinkedList<Integer> l2 = new LinkedList<Integer>();
    l2.addNode(5);
    l2.addNode(9);
    l2.addNode(2);

    // Output:2 -> 1 -> 9
    // That is,912
    Node<Integer> result = InterviewQuestion5.solution1(l1.getHead(), l2.getHead());
    Stack<Integer> stack = new Stack<Integer>();
    while (result != null) {
      stack.push(result.getData());
      result = result.getNext();
    }

    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
      sb.append(stack.pop());
    }


    Integer sum = Integer.valueOf(sb.toString());
    Integer expected = 912;

    assertEquals(expected, sum);
  }

  @Test
  public void followUpSolution1() {
    // (6-> 1 -> 7)
    // That is,617
    LinkedList<Integer> l1 = new LinkedList<Integer>();
    l1.addNode(6);
    l1.addNode(1);
    l1.addNode(7);

    // (2 -> 9 -> 5)
    // That is, 295
    LinkedList<Integer> l2 = new LinkedList<Integer>();
    l2.addNode(2);
    l2.addNode(9);
    l2.addNode(5);

    // Output:9 -> 1 -> 2
    // That is,912
    Node<Integer> result = InterviewQuestion5.followUpSolution1(l1.getHead(), l2.getHead());

    StringBuilder sb = new StringBuilder();
    while (result != null) {
      sb.append(result.getData());
      result = result.getNext();
    }


    Integer sum = Integer.valueOf(sb.toString());
    Integer expected = 912;

    assertEquals(expected, sum);
  }

}
