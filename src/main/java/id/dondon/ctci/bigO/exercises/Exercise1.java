package id.dondon.ctci.bigO.exercises;

public class Exercise1 {

  /**
   * This will take O(b) time
   * */
  public static int product(int a, int b) {
    int sum = a;
    for (int i = a; i < b; i++) {
      sum += a;
    }
    return sum;
  }

}
