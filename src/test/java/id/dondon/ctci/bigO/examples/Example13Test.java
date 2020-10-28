package id.dondon.ctci.bigO.examples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Example13Test {

  @Test
  public void test() {
    int result0 = Example13.fibonacci(0);
    assertEquals(0, result0);

    int result1 = Example13.fibonacci(1);
    assertEquals(1, result1);

    int result2 = Example13.fibonacci(2);
    assertEquals(1, result2);

    int result3 = Example13.fibonacci(3);
    assertEquals(2, result3);

    int result5 = Example13.fibonacci(4);
    assertEquals(3, result5);
  }

}
