package id.dondon.ctci.bigO.examples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Example16Test {

  @Test
  public void test() {
    int result = Example16.powersOf2(50);
    assertEquals(32, result);
  }

}
