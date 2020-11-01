package id.dondon.ctci.chapter1;

/**
 * One Away:
 * There are three types of edits that can be performed on strings:
 * insert a character, remove a character, or replace a character.
 * Given two strings, write a function to check if they are one edit (or zero edits) away.
 *
 * EXAMPLE
 * pale, ple -> true
 * pales. pale -> true
 * pale. bale -> true
 * pale. bake -> false
 * */
public class InterviewQuestion5 {

  /**
   * This takes O(N) time
   * */
  public static boolean solution1(String first, String second) {
    if (first.length() == second.length()) {
      // edited
      return oneEdit(first, second);
    } else if (first.length() + 1 == second.length()) {
      // deleted
      return oneInsertOrDelete(first, second);
    } else if (first.length() - 1 == second.length()) {
      // inserted
      return oneInsertOrDelete(first, second);
    }

    return false;
  }

  /**
   * This takes O(N) time
   * */
  public static boolean solution2(String first, String second) {
    if (Math.abs(first.length() - second.length()) > 1) {
      return false;
    }

    String s1 = first.length() < second.length() ? first : second;
    String s2 = first.length() < second.length() ? second : first;

    int index1 = 0;
    int index2 = 0;
    boolean foundDifference = false;
    while (index1 < s1.length() && index2 < s2.length()) {
      if (s1.charAt(index1) != s2.charAt(index2)) {
        if (foundDifference) {
          return false;
        }

        foundDifference = true;
        if (s1.length() == s2.length()) {
          // On replace, move shorter pointer
          index1++;
        }
      } else {
        index1++; // If matching, move shorter pointer
      }

      index2++; // Always move pointer for longer string
    }

    return true;
  }

  private static boolean oneEdit(String first, String second) {
    boolean foundDifference = false;
    int firstSize = first.length();
    for (int i = 0; i < firstSize; i++) {
      if (first.charAt(i) != second.charAt(i)) {
        if (foundDifference) {
          return false;
        }

        foundDifference = true;
      }
    }

    return true;
  }

  private static boolean oneInsertOrDelete(String first, String second) {
    int index1 = 0;
    int index2 = 0;
    while (index1 < first.length() && index2 < second.length()) {
      if (first.charAt(index1) != second.charAt(index2)) {
        if (index1 != index2) {
          return false;
        }

        index2++;
      } else {
        index1++;
        index2++;
      }
    }

    return true;
  }

}
