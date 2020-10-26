package id.dondon.ctci.bigO.examples;

public class Example15 {

  /**
   * fib(l) -> return 1
   * fib(2)
   *    fib(1) -> return 1
   *    fib(0) -> return 0
   *    store 1 at memo[2]
   * fib(3)
   *    fib(2) -> lookup memo[2]
   *    fib(1) -> return 1
   *    store 2 at memo[3]
   * fib(4)
   *    fib(3) -> lookup memo[3] -> return 2
   *    fib(2) -> lookup memo[2] -> return 1
   *    store 3 at memo[4]
   * fib(5)
   *    fib(4) -> lookup memo[4] -> return 3
   *    fib(3) -> lookup memo[3] -> return 2
   *    store 5 at memo[5]
   * ...
   *
   *
   * We're doing a constant amount of work N times, so this is 0 (n) time.
   * */
  public static void allFibonacci(int max) {
    int[] memo = new int[max + 1];
    for (int i = 0; i < max; i++) {
      System.out.println(i + ": " + fibonacci(i, memo));
    }
  }

  public static int fibonacci(int number, int[] memo) {
    if (number <= 0) return 0;
    else if (number == 1) return 1;
    else if (memo[number] > 0) return memo[number];

    memo[number] = fibonacci(number - 1, memo) + fibonacci(number - 2, memo);
    return memo[number];
  }


}
