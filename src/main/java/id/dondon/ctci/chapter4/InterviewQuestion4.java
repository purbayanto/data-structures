package id.dondon.ctci.chapter4;

/**
 * Check Balanced
 * Implement a function to check if a binary tree is balanced.
 * For the purposes of this question, a balanced tree is defined to be a tree such that
 * the heights of the two subtrees of any node never differ by more than one.
 * */
public class InterviewQuestion4 {

  /**
   * Brute force method
   * */
  public static boolean solution1(TreeNode root) {
    if (root == null) {
      return true;
    }

    int heightDiff = getHeight(root.left) - getHeight(root.right);
    if (Math.abs(heightDiff) > 1) {
      return false;
    }

    return solution1(root.left) && solution1(root.right);
  }

  /**
   * Improved
   * */
  public static boolean solution2(TreeNode root) {
    return checkHeight(root) != Integer.MIN_VALUE;
  }

  private static int getHeight(TreeNode root) {
    if (root == null) {
      return -1;
    }
    return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
  }

  private static int checkHeight(TreeNode root) {
    if (root == null) {
      return -1;
    }
    int leftHeight = checkHeight(root.left);
    if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE; // Propagate error up

    int rightHeight = checkHeight(root.right);
    if (rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE; // Propagate error up

    int heightDiff = leftHeight - rightHeight;
    if (Math.abs(heightDiff) > 1) {
      return Integer.MIN_VALUE; // Found error -> pass it back
    }

    return Math.max(leftHeight, rightHeight) + 1;
  }

}
