package id.dondon.ctci.bigO.exercises;

public class Exercise5 {

  /**
   * This will take O(log n) time
   * This algorithm is essentially doing a binary search to find the square root.
   * */
  public static int sqrt(int n) {
    return sqrtHelper(n, 1, n);
  }

  private static int sqrtHelper(int n, int min, int max) {
    if (max < min) return -1; // no square root

    int guess = (min + max) / 2;
    if (guess * guess == n) {
      //found it!
      return guess;
    } else if (guess * guess < n) {
      // too low
      return sqrtHelper(n, guess + 1, max) ; // try higher
    } else {
      // too high
      return sqrtHelper(n, min, guess - 1); // try lower
    }
  }

}
