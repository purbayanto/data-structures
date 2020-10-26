package id.dondon.ctci.bigO.examples;

public class Example4 {

  /**
   * This will take O(AB) time
   * */
  public static void printUnorderedPairs(int[] arrayA, int[] arrayB) {
    for (int i = 0; i < arrayA.length; i++) {
      for (int j = 0; j < arrayB.length; j++) {
        System.out.println(arrayA[i] + ", " + arrayB[j]);
      }
    }
  }

}
