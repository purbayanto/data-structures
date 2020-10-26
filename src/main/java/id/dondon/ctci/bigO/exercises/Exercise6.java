package id.dondon.ctci.bigO.exercises;

public class Exercise6 {

  /**
   * This will take O(sqrt(n))
   * */
  public static int sqrt(int n) {
    for (int guess = 1; guess * guess <= n; guess++) {
      if (guess * guess == n) {
        return guess;
      }
    }

    return -1;
  }

}
