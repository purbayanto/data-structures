package id.dondon.ctci.bigO.examples;

public class Example12 {

  /**
   * This will take O(n² * n!) time.
   * ! is factorial
   * */
  public static void permutation(String str) {
    permutation(str, "");
  }

  private static void permutation(String str, String prefix) {
    if (str.length() == 0) {
      System.out.println(prefix);
    } else {
      for (int i = 0; i < str.length(); i++) {
        String rem = str.substring(0, i) + str.substring(i + 1);
        permutation(rem, prefix + str.charAt(i));
      }
    }
  }

}
