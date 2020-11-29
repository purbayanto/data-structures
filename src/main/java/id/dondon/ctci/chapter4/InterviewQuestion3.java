package id.dondon.ctci.chapter4;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * List of Depths
 * Given a binary tree, design an algorithm which creates a linked list of all the nodes at each depth
 * (e.g., if you have a tree with depth D, you'll have D linked lists).
 * */
public class InterviewQuestion3 {

  public static ArrayList<LinkedList<TreeNode>> solutionBFS(TreeNode root) {
    ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();

    /* "Visit" the root */
    LinkedList<TreeNode> current = new LinkedList<TreeNode>();
    if (root != null) {
      current.add(root);
    }

    while (current.size() > 0) {
      result.add(current); // Add previous level
      LinkedList<TreeNode> parents = current; // Go to next level
      current = new LinkedList<TreeNode>();
      for (TreeNode parent : parents) {
        /* Visit the children */
        if (parent.left != null) {
          current.add(parent.left);
        }
        if (parent.right != null) {
          current.add(parent.right);
        }
      }
    }

    return result;
  }

  public static ArrayList<LinkedList<TreeNode>> solutionDFS(TreeNode root) {
    ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
    createLevelLinkedList(root, lists, 0);
    return lists;
  }

  private static void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level) {
    if (root == null) return;
    LinkedList<TreeNode> list = null;
    if (lists.size() == level) { // Level not contained in list
      list = new LinkedList<TreeNode>();
      /* Levels are always traversed in order. So, if this is the first time we've visited level i,
       * we must have seen levels 0 through i - 1. We can therefore safely add the level at the end. */
      lists.add(list);
    } else {
      list = lists.get(level);
    }
    list.add(root);
    createLevelLinkedList(root.left, lists, level + 1);
    createLevelLinkedList(root.right, lists, level + 1);
  }

}
