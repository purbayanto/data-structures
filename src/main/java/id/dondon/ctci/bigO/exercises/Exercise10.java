package id.dondon.ctci.bigO.exercises;

public class Exercise10 {

  /**
   * This will take O(log N)
   * */
  public static int sumDigits(int n) {
    int sum = 0;
    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }

    return sum;
  }

}
