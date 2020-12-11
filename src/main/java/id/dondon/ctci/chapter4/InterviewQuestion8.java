package id.dondon.ctci.chapter4;

/**
 * First Common Ancestor
 * Design an algorithm and write code to find the first common ancestor of two nodes in a binary tree.
 * Avoid storing additional nodes in a data structure.
 * NOTE: This is not necessarily a binary search tree.
 * */
public class InterviewQuestion8 {

  static int TWO_NODES_FOUND = 2;
  static int ONE_NODE_FOUND = 1;
  static int NO_NODES_FOUND = 0;

  public static TreeNode solution1(TreeNode root, TreeNode p, TreeNode q) {
    if (q == p && (root.left == q || root.right == q)) return root;
    int nodesFromLeft = covers(root.left, p, q); // Check left side
    if (nodesFromLeft == TWO_NODES_FOUND) {
      if(root.left == p || root.left == q) return root.left;
      else return solution1(root.left, p, q);
    } else if (nodesFromLeft == ONE_NODE_FOUND) {
      if (root == p) return p;
      else if (root == q) return q;
    }

    int nodesFromRight = covers(root.right, p, q); // Check right side
    if(nodesFromRight == TWO_NODES_FOUND) {
      if(root.right == p || root.right == q) return root.right;
      else return solution1(root.right, p, q);
    } else if (nodesFromRight == ONE_NODE_FOUND) {
      if (root == p) return p;
      else if (root == q) return q;
    }
    if (nodesFromLeft == ONE_NODE_FOUND &&
        nodesFromRight == ONE_NODE_FOUND) return root;
    else return null;
  }

  // Checks how many 'special' nodes are located under this root
  private static int covers(TreeNode root, TreeNode p, TreeNode q) {
    int ret = NO_NODES_FOUND;
    if (root == null) return ret;
    if (root == p || root == q) ret += 1;
    ret += covers(root.left, p, q);
    if(ret == TWO_NODES_FOUND) // Found p and q
      return ret;
    return ret + covers(root.right, p, q);
  }


  public static TreeNode solution2(TreeNode p, TreeNode q) {
    if (p == q) return p;

    TreeNode ancestor = p;
    while (ancestor != null) {
      if (isOnPath(ancestor, q)) {
        return ancestor;
      }
      ancestor = ancestor.parent;
    }
    return null;
  }

  private static boolean isOnPath(TreeNode ancestor, TreeNode node) {
    while (node != ancestor && node != null) {
      node = node.parent;
    }
    return node == ancestor;
  }

  public static TreeNode solution3(TreeNode p, TreeNode q) {
    int delta = depth(p) - depth(q); // get difference in depths
    TreeNode first = delta > 0 ? q : p; // get shallower node
    TreeNode second = delta > 0 ? p : q; // get deeper node
    second = goUpBy(second, Math.abs(delta)); // move shallower node to depth of deeper
    while (first != second && first != null && second != null) {
      first = first.parent;
      second = second.parent;
    }
    return first == null || second == null ? null : first;
  }

  public static TreeNode goUpBy(TreeNode node, int delta) {
    while (delta > 0 && node != null) {
      node = node.parent;
      delta--;
    }
    return node;
  }

  public static int depth(TreeNode node) {
    int depth = 0;
    while (node != null) {
      node = node.parent;
      depth++;
    }
    return depth;
  }

}
