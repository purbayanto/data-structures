package id.dondon.ctci.chapter4;

/**
 * Minimal Tree
 * Given a sorted (increasing order) array with unique integer elements,
 * write an algorithm to create a binary search tree with minimal height.
 * */
public class InterviewQuestion2 {

  public static TreeNode createTree(int[] arr) {
    return TreeNode.createMinimalBST(arr);
  }

}
