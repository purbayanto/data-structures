package id.dondon.ctci.bigO.examples;

public class Example1 {

  /**
   * This will take O(N) time
   * The fact that iterate through the array twice doesn't matter
   * */
  public static void foo(int[] array) {
    int sum = 0;
    int product = 1;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }

    for (int i = 0; i < array.length; i++) {
      product *= array[i];
    }

    System.out.println(sum + ", " + product);
  }

}
