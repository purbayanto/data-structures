package id.dondon.ctci.chapter4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InterviewQuestion5Test {

  @Test
  public void solution1BST() {
    int[] array = {Integer.MIN_VALUE, 3, 5, 6, 10, 13, 15, Integer.MAX_VALUE};
    TreeNode node = TreeNode.createMinimalBST(array);node.print();
    boolean isBst = InterviewQuestion5.solution1(node);
    assertTrue(isBst);
  }

  @Test
  public void solution2BST() {
    int[] array = {Integer.MIN_VALUE, 3, 5, 6, 10, 13, 15, Integer.MAX_VALUE};
    TreeNode node = TreeNode.createMinimalBST(array);node.print();
    boolean isBst = InterviewQuestion5.solution2(node);
    assertTrue(isBst);
  }

}
