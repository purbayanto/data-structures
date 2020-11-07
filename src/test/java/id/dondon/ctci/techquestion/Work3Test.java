package id.dondon.ctci.techquestion;

import static org.junit.Assert.assertEquals;

import com.sun.tools.javac.util.Pair;
import org.junit.Test;

public class Work3Test {

  @Test
  public void solution1() {
    Pair<Integer, Integer> result = Work3.permutation("abbc", "cbabadcbbabbcbabaabccbabc");
    Pair<Integer, Integer> expected = Pair.of(9, 13);

    assertEquals(expected, result);
  }

  @Test
  public void solution1_foundAtLastIndex() {
    Pair<Integer, Integer> result = Work3.permutation("abbc", "cbabadcbbabccbabaabccbabbc");
    Pair<Integer, Integer> expected = Pair.of(22, 26);

    assertEquals(expected, result);
  }

}
