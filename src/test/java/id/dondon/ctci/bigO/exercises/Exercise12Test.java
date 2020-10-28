package id.dondon.ctci.bigO.exercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exercise12Test {

  @Test
  public void test() {
    int[] arrA = {9, 7, 4, 5, 8, 1};
    int[] arrB = {6, 2, 10, 3, 2, 1};

    int result = Exercise12.intersection(arrA, arrB);
    assertEquals(1, result);
  }

}
