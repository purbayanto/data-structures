package id.dondon.ctci.chapter1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InterviewQuestion6Test {

  @Test
  public void solution1() {
    String input = "aabcccccaaa";
    String result = InterviewQuestion6.solution1(input);
    String expected = "a2b1c5a3";

    assertEquals(expected, result);
  }

  @Test
  public void solution2() {
    String input = "aabcccccaaa";
    String result = InterviewQuestion6.solution2(input);
    String expected = "a2b1c5a3";

    assertEquals(expected, result);
  }

  @Test
  public void solution3() {
    String input = "aabcccccaaa";
    String result = InterviewQuestion6.solution3(input);
    String expected = "a2b1c5a3";

    assertEquals(expected, result);
  }

}
