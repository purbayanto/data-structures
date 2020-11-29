package id.dondon.ctci.chapter4;

import java.util.LinkedList;

/**
 * Route Between Nodes
 * Given a directed graph, design an algorithm to find out whether there is a route between two nodes.
 * */
public class InterviewQuestion1 {

  public static boolean search(Graph graph, Node start, Node end) {
    LinkedList<Node> linkedList = new LinkedList<Node>();
    for (Node u : graph.getNodes()) {
      u.state = State.Unvisited;
    }
    start.state = State.Visiting;
    linkedList.add(start);

    Node u;
    while(!linkedList.isEmpty()) {
      u = linkedList.removeFirst();
      if (u != null) {
        for (Node v : u.getAdjacent()) {
          if (v.state == State.Unvisited) {
            if (v == end) {
              return true;
            } else {
              v.state = State.Visiting;
              linkedList.add(v);
            }
          }
        }
        u.state = State.Visited;
      }
    }

    return false;
  }

}
