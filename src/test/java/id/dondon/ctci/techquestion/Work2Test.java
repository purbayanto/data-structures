package id.dondon.ctci.techquestion;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class Work2Test {

  @Test
  public void solution1() {
    List<String> result = Work2.solution1(3);
    List<String> expected = Arrays.asList(
        "1 1 1 1",
        "1 2 1 2",
        "1 2 2 1",
        "1 3 1 3",
        "1 3 3 1",
        "2 1 1 2",
        "2 1 2 1",
        "2 2 2 2",
        "2 3 2 3",
        "2 3 3 2",
        "3 1 1 3",
        "3 1 3 1",
        "3 2 2 3",
        "3 2 3 2",
        "3 3 3 3"
        );

    assertEquals(expected, result);
  }

  @Test
  public void solution2() {
    List<String> result = Work2.solution2(3);
    List<String> expected = Arrays.asList(
        "1 1 1 1",
        "1 2 1 2",
        "1 2 2 1",
        "1 3 1 3",
        "1 3 3 1",
        "2 1 1 2",
        "2 1 2 1",
        "2 2 2 2",
        "2 3 2 3",
        "2 3 3 2",
        "3 1 1 3",
        "3 1 3 1",
        "3 2 2 3",
        "3 2 3 2",
        "3 3 3 3"
    );

    assertEquals(expected, result);
  }

  @Test
  public void solution3() {
    List<String> result = Work2.solution3(3);
    List<String> expected = Arrays.asList(
        "1 1 1 1",
        "1 2 2 1",
        "1 3 3 1",
        "2 1 2 1",
        "3 1 3 1"
    );

    assertEquals(expected, result);
  }

  @Test
  public void solution4() {
    List<String> result = Work2.solution4(3);
    List<String> expected = Arrays.asList(
        "1 1 1 1",
        "1 2 1 2",
        "1 3 1 3",
        "2 1 2 1",
        "2 2 2 2",
        "2 3 2 3",
        "3 1 3 1",
        "3 2 3 2",
        "3 3 3 3"
    );

    assertEquals(expected, result);
  }

  @Test
  public void solution5() {
    List<String> result = Work2.solution5(3);
    List<String> expected = Arrays.asList(
        "1 1 1 1",
        "1 2 1 2",
        "1 3 1 3",
        "2 1 2 1",
        "2 2 2 2",
        "2 3 2 3",
        "3 1 3 1",
        "3 2 3 2",
        "3 3 3 3"
    );

    assertEquals(expected, result);
  }


}
