package id.dondon.ctci.bigO.exercises;

public class Exercise2 {

  /**
   * This will take O(b) time
   * The recursive code iterates through b calls, since it subtracts one at each level.
   * */
  public static int power(int a, int b) {
    if (b < a) {
      return 0; // error
    } else if (b == a) {
      return 1;
    } else {
      return a * power(a, b - 1);
    }
  }

}
