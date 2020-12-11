package id.dondon.ctci.chapter4;

import org.junit.Test;

public class InterviewQuestion12Test {

  @Test
  public void solution1() {
    TreeNode root = new TreeNode(0);
    root.left = new TreeNode(0);
    root.right = new TreeNode(0);
    root.right.left = new TreeNode(0);
    root.right.left.right = new TreeNode(0);
    root.right.right = new TreeNode(0);
    System.out.println(InterviewQuestion12.solution1(root, 0));
    System.out.println(InterviewQuestion12.solution1(root, 4));
  }

  @Test
  public void solution2() {
    TreeNode root = new TreeNode(0);
    root.left = new TreeNode(0);
    root.right = new TreeNode(0);
    root.right.left = new TreeNode(0);
    root.right.left.right = new TreeNode(0);
    root.right.right = new TreeNode(0);
    System.out.println(InterviewQuestion12.solution2(root, 0));
    System.out.println(InterviewQuestion12.solution2(root, 4));
  }

}
