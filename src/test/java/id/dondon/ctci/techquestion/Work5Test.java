package id.dondon.ctci.techquestion;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class Work5Test {

  @Test
  public void bruteForce() {
    int[] a = {13, 27, 35, 40, 49, 55, 59};
    int[] b = {17, 35, 39, 40, 55, 58, 60};

    List<Integer> result = Work5.bruteForce(a, b);
    List<Integer> expected = Arrays.asList(35, 40, 55);

    assertEquals(expected, result);
  }

  @Test
  public void improve() {
    int[] a = {13, 27, 35, 40, 49, 55, 59};
    int[] b = {17, 35, 39, 40, 55, 58, 60};

    List<Integer> result = Work5.improve(a, b);
    List<Integer> expected = Arrays.asList(35, 40, 55);

    assertEquals(expected, result);
  }

  @Test
  public void optimal() {
    int[] a = {13, 27, 35, 40, 49, 55, 59};
    int[] b = {17, 35, 39, 40, 55, 58, 60};

    List<Integer> result = Work5.optimal(a, b);
    List<Integer> expected = Arrays.asList(35, 40, 55);

    assertEquals(expected, result);
  }

  @Test
  public void optimalSpace() {
    int[] a = {13, 27, 35, 40, 49, 55, 59};
    int[] b = {17, 35, 39, 40, 55, 58, 60};

    List<Integer> result = Work5.optimalSpace(a, b);
    List<Integer> expected = Arrays.asList(35, 40, 55);

    assertEquals(expected, result);
  }

}
