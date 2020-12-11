package id.dondon.ctci.chapter4;

import org.junit.Test;

public class InterviewQuestion8Test {

  @Test
  public void solution1() {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    TreeNode root = TreeNode.createMinimalBST(array);
    TreeNode n3 = root.find(1);
    TreeNode n7 = root.find(7);
    TreeNode ancestor = InterviewQuestion8.solution1(root, n3, n7);
    System.out.println(ancestor.data);
  }

  @Test
  public void solution2() {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    TreeNode root = TreeNode.createMinimalBST(array);
    TreeNode n3 = root.find(1);
    TreeNode n7 = root.find(7);
    TreeNode ancestor = InterviewQuestion8.solution2(n3, n7);
    System.out.println(ancestor.data);
  }

  @Test
  public void solution3() {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    TreeNode root = TreeNode.createMinimalBST(array);
    TreeNode n3 = root.find(1);
    TreeNode n7 = root.find(7);
    TreeNode ancestor = InterviewQuestion8.solution3(n3, n7);
    System.out.println(ancestor.data);
  }

}
