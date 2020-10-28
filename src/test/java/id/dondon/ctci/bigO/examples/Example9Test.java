package id.dondon.ctci.bigO.examples;

import static org.junit.Assert.assertEquals;

import id.dondon.binarytrees.Node;
import org.junit.Test;

public class Example9Test {

  @Test
  public void test() {
    Node<Integer> two = new Node<Integer>(2);
    Node<Integer> three = new Node<Integer>(3);
    Node<Integer> one = new Node<Integer>(1);
    one.setLeftChild(two);
    two.setRightChild(three);

    int sum = Example9.sum(one);
    assertEquals(6, sum);
  }

}
