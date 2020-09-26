package id.dondon.linkedlist;

import static org.junit.Assert.assertEquals;

import java.util.List;
import org.junit.Test;

public class LinkedListTest {

  @Test
  public void addNode() {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    linkedList.addNode(3);
    linkedList.addNode(4);
    linkedList.addNode(5);
    linkedList.addNode(10);
    linkedList.printNodes();

    assertEquals(4, linkedList.countNodes());
  }

  @Test
  public void popNode() {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    linkedList.addNode(3);
    linkedList.addNode(4);
    linkedList.addNode(5);
    linkedList.addNode(10);
    linkedList.popElement();
    linkedList.printNodes();

    assertEquals(3, linkedList.countNodes());
  }

  @Test
  public void insertNth() {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    linkedList.addNode(3);
    linkedList.addNode(4);
    linkedList.addNode(5);
    linkedList.addNode(10);

    linkedList.insertNth(0, 2);
    linkedList.insertNth(4, 12);
    linkedList.insertNth(4, 11);

    linkedList.printNodes();

    assertEquals(7, linkedList.countNodes());
  }

  @Test
  public void insertSorted() {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    linkedList.addNode(3);
    linkedList.addNode(4);
    linkedList.addNode(5);
    linkedList.addNode(10);

    linkedList.insertSorted(2);
    linkedList.insertSorted(12);
    linkedList.insertSorted(14);
    linkedList.insertSorted(7);

    linkedList.printNodes();

    assertEquals(8, linkedList.countNodes());
  }

  @Test
  public void removeDuplicates() {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    linkedList.addNode(3);
    linkedList.addNode(4);
    linkedList.addNode(5);
    linkedList.addNode(10);

    linkedList.insertSorted(3);
    linkedList.insertSorted(14);
    linkedList.insertSorted(14);
    linkedList.insertSorted(10);

    linkedList.removeDuplicates();
    linkedList.printNodes();

    assertEquals(5, linkedList.countNodes());
  }

  @Test
  public void appendList() {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    linkedList.addNode(3);
    linkedList.addNode(4);
    linkedList.addNode(5);
    linkedList.addNode(10);

    LinkedList<Integer> n1 = new LinkedList<Integer>();
    n1.addNode(500);
    n1.addNode(600);
    n1.addNode(700);

    linkedList.appendList(n1);

    linkedList.printNodes();

    assertEquals(7, linkedList.countNodes());
  }

  @Test
  public void changeHead() {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    linkedList.addNode(3);
    linkedList.addNode(4);
    linkedList.addNode(5);
    linkedList.addNode(10);

    LinkedList<Integer> n1 = new LinkedList<Integer>();
    n1.addNode(500);
    n1.addNode(600);
    n1.addNode(700);

    linkedList.appendList(n1);
    linkedList.changeHead(n1);

    linkedList.printNodes();

    assertEquals(6, linkedList.countNodes());
  }

  @Test
  public void reverseList() {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    linkedList.addNode(3);
    linkedList.addNode(4);
    linkedList.addNode(5);
    linkedList.addNode(10);

    LinkedList<Integer> n1 = new LinkedList<Integer>();
    n1.addNode(500);
    n1.addNode(600);
    n1.addNode(700);

    linkedList.appendList(n1);
    linkedList.reverseList();

    linkedList.printNodes();

    assertEquals(7, linkedList.countNodes());
  }

  @Test
  public void sortedMergeList() {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    linkedList.addNode(3);
    linkedList.addNode(4);
    linkedList.addNode(5);
    linkedList.addNode(10);
    linkedList.reverseList();

    LinkedList<Integer> n1 = new LinkedList<Integer>();
    n1.addNode(500);
    n1.addNode(600);
    n1.addNode(700);
    n1.reverseList();

    LinkedList<Integer> mergeSort = linkedList.sortedMergeList(n1);

    mergeSort.printNodes();

    assertEquals(7, mergeSort.countNodes());
  }

  @Test
  public void frontBackSplit() {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    linkedList.addNode(3);
    linkedList.addNode(4);
    linkedList.addNode(5);
    linkedList.addNode(10);

    List<Node<Integer>> frontBackSplit = linkedList.frontBackSplit();
    assertEquals(Integer.valueOf(3), frontBackSplit.get(0).getData());
    assertEquals(Integer.valueOf(5), frontBackSplit.get(1).getData());
  }

}
