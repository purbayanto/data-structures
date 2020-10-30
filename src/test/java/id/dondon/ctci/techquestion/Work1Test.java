package id.dondon.ctci.techquestion;

import static org.junit.Assert.assertEquals;

import com.sun.tools.javac.util.Pair;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class Work1Test {

  @Test
  public void solution1() {
    int[] unsortedArr = {1, 7, 5, 9, 2, 12, 3};
    List<Pair<Integer, Integer>> result = Work1.solution1(unsortedArr, 2);
    List<Pair<Integer, Integer>> expected = Arrays.asList(
        Pair.of(1, 3),
        Pair.of(3, 5),
        Pair.of(5, 7),
        Pair.of(7, 9)
    );

    assertEquals(expected, result);
  }

  @Test
  public void solution2() {
    int[] unsortedArr = {1, 7, 5, 9, 2, 12, 3};
    List<Pair<Integer, Integer>> result = Work1.solution2(unsortedArr, 2);
    List<Pair<Integer, Integer>> expected = Arrays.asList(
        Pair.of(1, 3),
        Pair.of(7, 9),
        Pair.of(5, 7),
        Pair.of(3, 5)
    );

    assertEquals(expected, result);
  }

}
