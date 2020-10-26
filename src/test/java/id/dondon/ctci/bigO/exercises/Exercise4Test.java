package id.dondon.ctci.bigO.exercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exercise4Test {

  @Test
  public void test() {
    int result = Exercise4.div(4, 2);
    int expected = 4 / 2;

    assertEquals(expected, result);
  }

}
