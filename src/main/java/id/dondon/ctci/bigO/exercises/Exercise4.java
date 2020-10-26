package id.dondon.ctci.bigO.exercises;

public class Exercise4 {

  /**
   * This will take O(a/b)
   * it iterates a/b times.
   * */
  public static int div(int a, int b) {
    int count = 0;
    int sum = b;
    while (sum <= a) {
      sum += b;
      count++;
    }

    return count;
  }

}
