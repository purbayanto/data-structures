package id.dondon.ctci.bigO.examples;

public class Example6 {

  /**
   * This will take O(N) time
   * The fact that it only goes through half of the array doesn't impact the big O time
   * */
  public static void reverse(int[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      int other = array.length - i - 1;
      int temp = array[i];
      array[i] = array[other];
      array[other] = temp;
    }
  }

}
