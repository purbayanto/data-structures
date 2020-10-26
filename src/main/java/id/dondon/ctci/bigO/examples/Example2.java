package id.dondon.ctci.bigO.examples;

public class Example2 {

  /**
   * This will take O(N²) time
   * The fact that iterate through the array twice doesn't matter
   * */
  public static void printPairs(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        System.out.println(array[i] + ", " + array[j]);
      }
    }
  }

}
