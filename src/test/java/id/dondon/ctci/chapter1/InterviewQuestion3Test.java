package id.dondon.ctci.chapter1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InterviewQuestion3Test {

  @Test
  public void solution1() {
    // FIXME: index out of bounds if last spaces under or equals 3
    // "Mr John Smith   " this will error
    String input = "Mr John Smith    ";

    String result = InterviewQuestion3.solution1(input, 13);
    String expected = "Mr%20John%20Smith";

    assertEquals(expected, result);
  }

}
