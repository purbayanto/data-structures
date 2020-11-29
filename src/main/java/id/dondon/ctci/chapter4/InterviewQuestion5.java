package id.dondon.ctci.chapter4;

/**
 * Validate BST
 * Implement a function to check ifa binary tree is a binary search tree.
 * */
public class InterviewQuestion5 {

  public static Integer lastPrinted = null;

  public static boolean solution1(TreeNode n) {
    return solution1(n, null, null);
  }

  private static boolean solution1(TreeNode n, Integer min, Integer max) {
    if (n == null) {
      return true;
    }
    if ((min != null && n.data <= min) || (max != null && n.data > max)) {
      return false;
    }
    if (!solution1(n.left, min, n.data) ||
        !solution1(n.right, n.data, max)) {
      return false;
    }
    return true;
  }

  public static boolean solution2(TreeNode node) {
    return solution2(node, true);
  }

  // Allow "equal" value only for left child. This validates the BST property.
  public static boolean solution2(TreeNode n, boolean isLeft) {
    if (n == null) {
      return true;
    }

    // Check / recurse left
    if (!solution2(n.left, true)) {
      return false;
    }

    // Check current
    if (lastPrinted != null) {
      if (isLeft) {
        // left child "is allowed" be equal to parent.
        if (n.data < lastPrinted) {
          return false;
        }
      } else {
        // Right child "is not allowed" be equal to parent.
        if (n.data <= lastPrinted) {
          return false;
        }
      }
    }
    lastPrinted = n.data;

    // Check / recurse right
    if (!solution2(n.right, false)) {
      return false;
    }

    return true;
  }

  
}
