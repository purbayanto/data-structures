package id.dondon.ctci.bigO.examples;

public class Example3 {

  /**
   * This will take O(N²) time
   * Visualizing What It Does
   * The code iterates through the following (i, j) pairswhen N = 5:
   * (0, 1) (0, 2) (0, 3) (0, 4)
   *        (1, 2) (1, 3) (1, 4)
   *               (2, 3) (2, 4)
   *                      (3, 4)
   *
   * This looks like half of an NxN matrix, which has size (roughly) N²/2 . Therefore, it takes O(N²) time.
   * */
  public static void printUnorderedPairs(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        System.out.println(array[i] + ", " + array[j]);
      }
    }
  }

}
