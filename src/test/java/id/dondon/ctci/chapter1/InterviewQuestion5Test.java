package id.dondon.ctci.chapter1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InterviewQuestion5Test {

  @Test
  public void solution1_whenOneEdit_thenReturnTrue() {
    String first = "pale";
    String second = "bale";
    boolean result = InterviewQuestion5.solution1(first, second);

    assertTrue(result);
  }

  @Test
  public void solution1_whenTwoEdit_thenReturnFalse() {
    String first = "pala";
    String second = "bale";
    boolean result = InterviewQuestion5.solution1(first, second);

    assertFalse(result);
  }

  @Test
  public void solution1_whenOneInsert_thenReturnTrue() {
    String first = "pales";
    String second = "pale";
    boolean result = InterviewQuestion5.solution1(first, second);

    assertTrue(result);
  }

  @Test
  public void solution1_whenTwoInsert_thenReturnTrue() {
    String first = "paless";
    String second = "pale";
    boolean result = InterviewQuestion5.solution1(first, second);

    assertFalse(result);
  }

  @Test
  public void solution1_whenOneDelete_thenReturnTrue() {
    String first = "pale";
    String second = "pales";
    boolean result = InterviewQuestion5.solution1(first, second);

    assertTrue(result);
  }

  @Test
  public void solution1_whenTwoDelete_thenReturnTrue() {
    String first = "pal";
    String second = "pales";
    boolean result = InterviewQuestion5.solution1(first, second);

    assertFalse(result);
  }

  @Test
  public void solution2_whenOneEdit_thenReturnTrue() {
    String first = "pale";
    String second = "bale";
    boolean result = InterviewQuestion5.solution2(first, second);

    assertTrue(result);
  }

  @Test
  public void solution2_whenTwoEdit_thenReturnFalse() {
    String first = "pala";
    String second = "bale";
    boolean result = InterviewQuestion5.solution2(first, second);

    assertFalse(result);
  }

  @Test
  public void solution2_whenOneInsert_thenReturnTrue() {
    String first = "pales";
    String second = "pale";
    boolean result = InterviewQuestion5.solution2(first, second);

    assertTrue(result);
  }

  @Test
  public void solution2_whenTwoInsert_thenReturnTrue() {
    String first = "paless";
    String second = "pale";
    boolean result = InterviewQuestion5.solution2(first, second);

    assertFalse(result);
  }

  @Test
  public void solution2_whenOneDelete_thenReturnTrue() {
    String first = "pale";
    String second = "pales";
    boolean result = InterviewQuestion5.solution2(first, second);

    assertTrue(result);
  }

  @Test
  public void solution2_whenTwoDelete_thenReturnTrue() {
    String first = "pal";
    String second = "pales";
    boolean result = InterviewQuestion5.solution2(first, second);

    assertFalse(result);
  }

}
