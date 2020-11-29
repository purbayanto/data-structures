package id.dondon.ctci.chapter4;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InterviewQuestion4Test {

  @Test
  public void solution1() {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    TreeNode root = TreeNode.createMinimalBST(array);

    boolean result = InterviewQuestion4.solution1(root);
    assertTrue(result);
  }

  @Test
  public void solution2() {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    TreeNode root = TreeNode.createMinimalBST(array);

    boolean result = InterviewQuestion4.solution2(root);
    assertTrue(result);
  }

}
