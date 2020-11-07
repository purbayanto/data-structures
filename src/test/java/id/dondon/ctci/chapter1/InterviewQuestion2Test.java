package id.dondon.ctci.chapter1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InterviewQuestion2Test {

  @Test
  public void solution1_whenCharacterFound_thenReturnTrue() {
    String big = "doog";
    String small = "good";
    boolean result = InterviewQuestion2.solution1(small, big);

    assertTrue(result);
  }

  @Test
  public void solution1_whenCharacterNotFound_thenReturnFalse() {
    String big = "good";
    String small = "dood";
    boolean result = InterviewQuestion2.solution1(small, big);

    assertFalse(result);
  }

  @Test
  public void solution2_whenCharacterFound_thenReturnTrue() {
    String big = "doog";
    String small = "good";
    boolean result = InterviewQuestion2.solution2(small, big);

    assertTrue(result);
  }

  @Test
  public void solution2_whenCharacterNotFound_thenReturnFalse() {
    String big = "good";
    String small = "dood";
    boolean result = InterviewQuestion2.solution2(small, big);

    assertFalse(result);
  }

}
