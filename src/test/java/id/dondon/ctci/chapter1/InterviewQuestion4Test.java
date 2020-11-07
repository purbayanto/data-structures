package id.dondon.ctci.chapter1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InterviewQuestion4Test {

  @Test
  public void solution1_whenInputValidPalindrome_thenReturnTrue() {
    String input = "taco cat";
    boolean result = InterviewQuestion4.solution1(input);

    assertTrue(result);
  }

  @Test
  public void solution1_whenInputValid2Palindrome_thenReturnTrue() {
    String input = "tactcoapapa";
    boolean result = InterviewQuestion4.solution1(input);

    assertTrue(result);
  }

  @Test
  public void solution2_whenInputValidPalindrome_thenReturnTrue() {
    String input = "taco cat";
    boolean result = InterviewQuestion4.solution2(input);

    assertTrue(result);
  }

  @Test
  public void solution2_whenInputValid2Palindrome_thenReturnTrue() {
    String input = "tactcoapapa";
    boolean result = InterviewQuestion4.solution2(input);

    assertTrue(result);
  }

  @Test
  public void solution3_whenInputValidPalindrome_thenReturnTrue() {
    String input = "taco cat";
    boolean result = InterviewQuestion4.solution3(input);

    assertTrue(result);
  }

  @Test
  public void solution3_whenInputValid2Palindrome_thenReturnTrue() {
    String input = "tactcoapapa";
    boolean result = InterviewQuestion4.solution3(input);

    assertTrue(result);
  }

}
