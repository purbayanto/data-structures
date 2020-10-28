package id.dondon.ctci.bigO.exercises;

public class Exercise3 {

  /**
   * This will take O(1) time
   * It does a constant amount of work.
   * */
  public static int mod(int a, int b) {
    if (b <= 0) {
      return -1;
    }

    int div = a / b;
    return a - div * b;
  }

}
