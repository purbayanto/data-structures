package id.dondon.ctci.chapter4;

import java.util.ArrayList;
import java.util.LinkedList;
import org.junit.Test;

public class InterviewQuestion9Test {

  @Test
  public void solution() {
    TreeNode node = new TreeNode(100);
    int[] array = {100, 50, 20, 75, 150, 120, 170};
    for (int a : array) {
      node.insertInOrder(a);
    }
    ArrayList<LinkedList<Integer>> allSeq = InterviewQuestion9.solution(node);
    for (LinkedList<Integer> list : allSeq) {
      System.out.println(list);
    }
    System.out.println(allSeq.size());
  }

}
