package id.dondon.ctci.techquestion;

import com.sun.tools.javac.util.Pair;

/**
 * Given a smaller string 5 and a bigger string b,
 * design an algorithm to find all permutations of the shorter string within the longer one.
 * Print the location of each permutation.
 * */
public class Work3 {

  /**
   * This will take O(b) time
   * */
  public static Pair<Integer, Integer> permutation(String s, String b) {
    int length = b.length();
    int smallLength = s.length();
    for (int i = 0; i < length; i++) {
      int boundIndex = i + smallLength;
      if (boundIndex <= length) {
        String chunk = b.substring(i, boundIndex);
        if (chunk.equals(s)) {
          return Pair.of(i, boundIndex);
        }
      }
    }
    return null;
  }

}
