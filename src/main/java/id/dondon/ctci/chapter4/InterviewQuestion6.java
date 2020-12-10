package id.dondon.ctci.chapter4;

/**
 * Successor
 * Write an algorithm to find the "next" node (i.e., in-order successor) of a given node in a binary search tree.
 * You may assume that each node has a link to its parent.
 * */
public class InterviewQuestion6 {

  public static TreeNode inorderSuccessor(TreeNode n) {
    if (n == null) return null;

    // Found right children -> return left most node of right subtree
    if (n.parent == null || n.right != null) {
      return leftMostChild(n.right);
    } else {
      TreeNode q = n;
      TreeNode x = q.parent;
      // Go up until we're on left instead of right
      while (x != null && x.left != q) {
        q = x;
        x = x.parent;
      }

      return x;
    }
  }

  private static TreeNode leftMostChild(TreeNode n) {
    if (n == null) {
      return null;
    }
    while (n.left != null) {
      n = n.left;
    }
    return n;
  }

}
