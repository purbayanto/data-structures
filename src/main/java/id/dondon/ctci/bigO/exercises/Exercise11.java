package id.dondon.ctci.bigO.exercises;

public class Exercise11 {

  public static int numChars = 26;

  /**
   * This will take O(kc subscript k)
   * where k is the length of the string and c is the number of characters in the alphabet.
   * It takes O(c subscript k) time to generate each string.
   * Then, we need to check that each of these is sorted, which takes O(k) time.
   * */
  public static void printSortedStrings(int remaining) {
    printSortedStrings(remaining, "");
  }

  private static void printSortedStrings(int remaining, String prefix) {
    if (remaining == 0) {
      if (isInOrder(prefix)) {
        System.out.println(prefix);
      }
    } else {
      for (int i = 0; i < numChars; i++) {
        char c = ithLetter(i);
        printSortedStrings(remaining - 1, prefix + c);
      }
    }
  }

  private static boolean isInOrder(String s) {
    boolean isInOrder = true;
    for (int i = 1; i < s.length(); i++) {
      int prev = ithLetter(s.charAt(i - 1));
      int curr = ithLetter(s.charAt(i));
      if (prev > curr) {
        isInOrder = false;
      }
    }
    return isInOrder;
  }

  private static char ithLetter(int i) {
    return (char) (((int) 'a') + i);
  }

}
