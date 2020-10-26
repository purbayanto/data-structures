package id.dondon.ctci.bigO.examples;

public class Example10 {

  /**
   * This runs in O(√n) time
   * The for loop will start when x = 2 and end when x*x =n
   * Or, in other words,it stops when x =√n (when x equals the square root of n).
   * */
  public static boolean isPrime(int number) {
    for (int x = 2; x*x <= number; x++) {
      if (number % x == 0) {
        return false;
      }
    }

    return true;
  }

  /**
   * This runs in O(√n) time
   * The for loop will start when x = 2 and end when x*x =n
   * Or, in other words,it stops when x =√n (when x equals the square root of n).
   * */
  public static boolean isPrimeSqrt(int number) {
    for (int x = 2; x <= Math.sqrt(number); x++) {
      if (number % x == 0) {
        return false;
      }
    }

    return true;
  }

}
