package id.dondon.ctci.chapter2;

import id.dondon.linkedlist.LinkedList;
import id.dondon.linkedlist.Node;

/**
 * Sum Lists
 * You have two numbers represented by a linked list, where each node contains a single digit.
 * The digits are stored in reverse order, such that the 1's digit is at the head of the list.
 * Write a function that adds the two numbers and returns the sum as a linked list.
 *
 * EXAMPLE
 * Input: (7-> 1 -> 6) + (5 -> 9 -> 2) .That is, 617 + 295.
 * Output:2 -> 1 -> 9.That is,912.
 *
 * FOLLOW UP
 * Suppose the digits are stored in forward order.
 * Repeat the above problem. Input: (6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295.
 * Output:9 -> 1 -> 2.That is,912.
 * */
public class InterviewQuestion5 {

  public static Node<Integer> solution1(Node<Integer> l1, Node<Integer> l2) {
    return solution1(l1, l2, 0);
  }

  public static Node<Integer> followUpSolution1(Node<Integer> l1, Node<Integer> l2) {
    int len1 = length(l1);
    int len2 = length(l2);
    if (len1 < len2) {
      l1 = padList(l1, len2 - len1);
    } else {
      l2 = padList(l2, len1 - len2);
    }
    PartialSum sum = addListsHelper(l1, l2);
    if (sum.carry == 0) {
      return sum.sum;
    } else {
      Node<Integer> result = insertBefore(sum.sum, sum.carry);
      return result;
    }
  }

  private static Node<Integer> solution1(Node<Integer> l1, Node<Integer> l2, int carry) {
    if (l1 == null && l2 == null && carry == 0) {
      return null;
    }


    int value = carry;
    if (l1 != null) {
      value += l1.getData();
    }
    if (l2 != null) {
      value += l2.getData();
    }

    Node<Integer> result = new Node<Integer>(value % 10);

    if (l1 != null || l2 != null) {
      Node<Integer> nextL1 = l1 == null ? null : l1.getNext();
      Node<Integer> nextL2 = l2 == null ? null : l2.getNext();
      int  nextCarry = value >= 10 ? 1 : 0;
      Node<Integer> more = solution1(nextL1, nextL2, nextCarry);
      result.setNext(more);
    }

    return result;
  }

  private static int length(Node<Integer> l) {
    if (l == null) {
      return 0;
    } else {
      return 1 + length(l.getNext());
    }
  }

  private static PartialSum addListsHelper(Node<Integer> l1, Node<Integer> l2) {
    if (l1 == null && l2 == null) {
      PartialSum sum = new PartialSum();
      return sum;
    }

    PartialSum sum = addListsHelper(l1.getNext(), l2.getNext());
    int val = sum.carry + l1.getData() + l2.getData();
    Node<Integer> fullResult = insertBefore(sum.sum, val % 10);
    sum.sum = fullResult;
    sum.carry = val / 10;

    return sum;
  }

  private static Node<Integer> padList(Node<Integer> l, int padding) {
    Node<Integer> head = l;
    for (int i = 0; i < padding; i++) {
      head = insertBefore(head, 0);
    }
    return head;
  }

  private static Node<Integer> insertBefore(Node<Integer> list, int data) {
    Node<Integer> node = new Node<Integer>(data);
    if (list != null) {
      node.setNext(list);
    }

    return node;
  }

  private static class PartialSum {
    public Node<Integer> sum = null;
    public int carry = 0;
  }

}
