package id.dondon.ctci.bigO.examples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Example11Test {

  @Test
  public void test() {
    int result = Example11.factorial(3);
    assertEquals(6, result);
  }

}
