package id.dondon.ctci.chapter1;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 * */
public class InterviewQuestion1 {

  public static boolean solution1(String characters) {
    int size = characters.length();
    if (size > 128) return false;

    boolean[] charSet = new boolean[128];
    for (int i = 0; i < size; i++) {
      char chars = characters.charAt(i);
      if (charSet[chars]) {
        return false;
      }

      charSet[chars] = true;
    }

    return true;
  }

  public static boolean solution2(String characters) {
    int checker = 0;
    int size = characters.length();
    for (int i = 0; i < size; i++) {
      int val = characters.charAt(i) - 'a';
      if ((checker & (1 << val)) > 0) {
        return false;
      }

      checker |= (1 << val);
    }

    return true;
  }

}
