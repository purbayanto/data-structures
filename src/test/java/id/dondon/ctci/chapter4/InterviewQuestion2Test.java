package id.dondon.ctci.chapter4;

import org.junit.Test;

public class InterviewQuestion2Test {

  @Test
  public void solution1() {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    TreeNode result = InterviewQuestion2.createTree(array);
    result.print();

    System.out.println("Root? " + result.data);
    System.out.println("Created BST? " + result.isBST());
    System.out.println("Height: " + result.height());
  }

}
