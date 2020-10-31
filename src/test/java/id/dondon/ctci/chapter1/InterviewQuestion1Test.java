package id.dondon.ctci.chapter1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InterviewQuestion1Test {

  @Test
  public void isUnique() {
    String data = "abcdefghijklmnopqrstuvwxyz";
    boolean result = InterviewQuestion1.solution1(data);

    assertTrue(result);
  }

  @Test
  public void isNotUnique() {
    String data = "abcdefghijklmnopqrstuvwxyzz";
    boolean result = InterviewQuestion1.solution1(data);

    assertFalse(result);
  }

  @Test
  public void isUnique_solution2() {
    String data = "abcdefghijklmnopqrstuvwxyz";
    boolean result = InterviewQuestion1.solution2(data);

    assertTrue(result);
  }

  @Test
  public void isNotUnique_solution2() {
    String data = "abcdefghijklmnopqrstuvwxyzz";
    boolean result = InterviewQuestion1.solution2(data);

    assertFalse(result);
  }

}
