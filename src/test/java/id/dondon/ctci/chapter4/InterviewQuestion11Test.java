package id.dondon.ctci.chapter4;

import org.junit.Test;

public class InterviewQuestion11Test {

  @Test
  public void solution() {
    int[] result = InterviewQuestion11.solution();

    for (int i = 0; i < result.length; i++) {
      System.out.println(i + ": " + result[i]);
    }
  }

}
