package id.dondon.ctci.bigO.exercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exercise3Test {

  @Test
  public void test() {
    int result = Exercise3.mod(3, 2);
    int expected = 3 % 2;

    assertEquals(expected, result);
  }

}
