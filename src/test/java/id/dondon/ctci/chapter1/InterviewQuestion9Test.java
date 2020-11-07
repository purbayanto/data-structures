package id.dondon.ctci.chapter1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InterviewQuestion9Test {

  @Test
  public void solution1_whenRotationIsValid_thenReturnTrue() {
    String[][] pairs = {
        {"apple", "pleap"},
        {"waterbottle", "erbottlewat"}
    };

    for (String[] pair : pairs) {
      String word1 = pair[0];
      String word2 = pair[1];
      boolean result = InterviewQuestion9.solution1(word1, word2);
      assertTrue(result);
    }
  }

  @Test
  public void solution1_whenRotationIsInvalid_thenReturnFalse() {
    String[][] pairs = {
        {"camera", "macera"},
        {"cameraa", "macera"}
    };

    for (String[] pair : pairs) {
      String word1 = pair[0];
      String word2 = pair[1];
      boolean result = InterviewQuestion9.solution1(word1, word2);
      assertFalse(result);
    }
  }

}
