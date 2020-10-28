package id.dondon.ctci.bigO.examples;

import id.dondon.binarytrees.Node;

public class Example9 {

  /**
   * This will take O(N) time
   * Balanced tree is O(branches⁰) where ⁰ is the depth in other words O(2⁰)
   * Let P = 2log⁰. By the definition of log₂ we can write this as lo g l = log₂N.This means that P = N.
   * Let P = 2log⁰
   *       -> log₂P = log₂N
   *       -> P = N
   *       -> 2log⁰ = N
   * Therefore, the runtime of this code is O( N), where N is the number of nodes.
   * */
  public static int sum(Node<Integer> node) {
    if (node == null) {
      return 0;
    }

    return sum(node.getLeftChild()) + node.getData() + sum(node.getRightChild());
  }
}
