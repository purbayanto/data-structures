package id.dondon.ctci.bigO.examples;

public class Example11 {

  /**
   * This is just a straight recursion from n to n-1 to n- 2 down to 1. It will take 0 (n) time.
   * */
  public static int factorial(int number) {
    if (number < 0) {
      return -1;
    } else if (number == 0) {
      return 1;
    } else {
      return number * factorial(number - 1);
    }
  }

}
