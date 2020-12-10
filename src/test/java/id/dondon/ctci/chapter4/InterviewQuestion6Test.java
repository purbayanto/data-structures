package id.dondon.ctci.chapter4;

import org.junit.Test;

public class InterviewQuestion6Test {

  @Test
  public void solution1() {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    TreeNode root = TreeNode.createMinimalBST(array);
    for (int i = 0; i < array.length; i++) {
      TreeNode node = root.find(array[i]);
      TreeNode next = InterviewQuestion6.inorderSuccessor(node);
      if (next != null) {
        System.out.println(node.data + "->" + next.data);
      } else {
        System.out.println(node.data + "->" + null);
      }
    }
  }

}
