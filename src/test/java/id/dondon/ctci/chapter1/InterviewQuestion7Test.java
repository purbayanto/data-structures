package id.dondon.ctci.chapter1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InterviewQuestion7Test {

  @Test
  public void solution1() {
    int[][] matrix = {
        {1, 1, 1, 1},
        {2, 2, 2, 2},
        {3, 3, 3, 3},
        {4, 4, 4, 4}
    };
    boolean result = InterviewQuestion7.solution1(matrix);

    int[][] expected = {
        {4, 3, 2, 1},
        {4, 3, 2, 1},
        {4, 3, 2, 1},
        {4, 3, 2, 1}
    };
    assertTrue(result);
    assertArrayEquals(expected, matrix);
  }

  @Test
  public void solution1_whenMatrixIsNotValid_thenShouldReturnFalse() {
    int[][] matrix = {
        {1, 1, 1, 1},
        {2, 2, 2, 2},
        {3, 3, 3, 3}
    };
    boolean result = InterviewQuestion7.solution1(matrix);

    assertFalse(result);
  }

}
