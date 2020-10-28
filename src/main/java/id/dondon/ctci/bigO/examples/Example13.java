package id.dondon.ctci.bigO.examples;

public class Example13 {

  /**
   * There are 2 branches per call
   * and we go as deep as N or ⁰
   * therefore the runtime is 0 (2⁰) .
   * */
  public static int fibonacci(int number) {
    if (number <= 0) return 0;
    else if (number == 1) return 1;
    return fibonacci(number - 1) + fibonacci(number - 2);
  }

}
