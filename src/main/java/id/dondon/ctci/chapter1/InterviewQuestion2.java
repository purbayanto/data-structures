package id.dondon.ctci.chapter1;

import java.util.Arrays;

public class InterviewQuestion2 {

  public static boolean solution1(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    return sort(s).equals(sort(t));
  }

  public static boolean solution2(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    int[] letters = new int[128]; // Assumption

    char[] sChars = s.toCharArray();
    for (char sChar : sChars) {
      letters[sChar]++;
    }

    for (int i = 0; i < t.length(); i++) {
      int c = t.charAt(i);
      letters[c]--;
      if (letters[c] < 0) {
        return false;
      }
    }

    return true;
  }

  private static String sort(String s) {
    char[] chars = s.toCharArray();
    Arrays.sort(chars);

    return new String(chars);
  }

}
