package id.dondon.ctci.bigO.examples;

public class Example14 {

  /**
   * fibonacci(1) -> 2¹ steps
   * fibonacci(2) -> 2² steps
   * fibonacci(3) -> 2³ steps
   * fibonacci(4) -> 2⁴ steps
   * ....
   * fibonacci(n) -> 2⁰ n steps
   * Therefore, the total amount of work is:
   * 2¹ + 2² + 2³ + 2⁴ +...+ 2⁰
   *
   * Therefore, the runtime to compute the first n Fibonacci numbers
   * (using this terrible algorithm) is still O(2⁰).
   * */
  public static void allFibonacci(int max) {
    for (int i = 0; i < max; i++) {
      System.out.println(i + ": " + Example13.fibonacci(i));
    }
  }

}
