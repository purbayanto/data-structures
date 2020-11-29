package id.dondon.ctci.chapter4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InterviewQuestion1Test {

  @Test
  public void solution1() {
    Graph graph = new Graph();
    Node[] temp = new Node[6];

    temp[0] = new Node("a", 3);
    temp[1] = new Node("b", 0);
    temp[2] = new Node("c", 0);
    temp[3] = new Node("d", 1);
    temp[4] = new Node("e", 1);
    temp[5] = new Node("f", 0);

    temp[0].addAdjacent(temp[1]);
    temp[0].addAdjacent(temp[2]);
    temp[0].addAdjacent(temp[3]);
    temp[3].addAdjacent(temp[4]);
    temp[4].addAdjacent(temp[5]);
    for (int i = 0; i < 6; i++) {
      graph.addNode(temp[i]);
    }

    Node[] n = graph.getNodes();
    Node start = n[3];
    Node end = n[5];

    boolean result = InterviewQuestion1.search(graph, start, end);
    assertTrue(result);
  }

}
