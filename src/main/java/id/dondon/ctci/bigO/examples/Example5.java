package id.dondon.ctci.bigO.examples;

public class Example5 {

  /**
   * This will take O(AB) time
   * 100,000 units of work is still constant
   * */
  public static void printUnorderedPairs(int[] arrayA, int[] arrayB) {
    for (int i = 0; i < arrayA.length; i++) {
      for (int j = 0; j < arrayB.length; j++) {
        for (int k = 0; k < 100000; k++) {
          System.out.println(arrayA[i] + ", " + arrayB[j]);
        }
      }
    }
  }

}
