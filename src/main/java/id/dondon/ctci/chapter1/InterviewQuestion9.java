package id.dondon.ctci.chapter1;

/**
 * String Rotation:
 * Assume you have a method isSubstring which checks if one word is substring of another.
 * Given two string s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring
 * ex : "waterbottle" is a rotation of "erbottlewat"
 * */
public class InterviewQuestion9 {

  public static boolean solution1(String s1, String s2) {
    int len = s1.length();
    /* check that s1 and s2 are equal length and not empty */
    if (len == s2.length() && len > 0) {
      /* concatenate s1 and s1 within new buffer */
      String s1s1 = s1 + s1;
      return isSubstring(s1s1, s2);
    }

    return false;
  }

  private static boolean isSubstring(String big, String small) {
    if (big.indexOf(small) >= 0) {
      return true;
    }

    return false;
  }

}
