package id.dondon.ctci.chapter4;

import org.junit.Test;

public class InterviewQuestion10Test {

  @Test
  public void solution1() {
    // t2 is a subtree of t1
    int[] array1 = {1, 2, 1, 3, 1, 1, 5};
    int[] array2 = {2, 3, 1};

    TreeNode t1 = TreeNode.createMinimalBST(array1);
    TreeNode t2 = TreeNode.createMinimalBST(array2);

    if (InterviewQuestion10.solution1(t1, t2)) {
      System.out.println("t2 is a subtree of t1");
    } else {
      System.out.println("t2 is not a subtree of t1");
    }

    // t4 is not a subtree of t3
    int[] array3 = {1, 2, 3};
    TreeNode t3 = TreeNode.createMinimalBST(array1);
    TreeNode t4 = TreeNode.createMinimalBST(array3);

    if (InterviewQuestion10.solution1(t3, t4)) {
      System.out.println("t4 is a subtree of t3");
    } else {
      System.out.println("t4 is not a subtree of t3");
    }
  }

  @Test
  public void solution2() {
    // t2 is a subtree of t1
    int[] array1 = {1, 2, 1, 3, 1, 1, 5};
    int[] array2 = {2, 3, 1};

    TreeNode t1 = TreeNode.createMinimalBST(array1);
    TreeNode t2 = TreeNode.createMinimalBST(array2);

    if (InterviewQuestion10.solution2(t1, t2)) {
      System.out.println("t2 is a subtree of t1");
    } else {
      System.out.println("t2 is not a subtree of t1");
    }

    // t4 is not a subtree of t3
    int[] array3 = {1, 2, 3};
    TreeNode t3 = TreeNode.createMinimalBST(array1);
    TreeNode t4 = TreeNode.createMinimalBST(array3);

    if (InterviewQuestion10.solution2(t3, t4)) {
      System.out.println("t4 is a subtree of t3");
    } else {
      System.out.println("t4 is not a subtree of t3");
    }
  }

}
