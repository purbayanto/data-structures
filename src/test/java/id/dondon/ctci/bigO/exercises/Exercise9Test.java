package id.dondon.ctci.bigO.exercises;

import org.junit.Assert;
import org.junit.Test;

public class Exercise9Test {

  @Test
  public void test() {
    int[] data = {1, 2, 3, 4, 5};
    int[] result = Exercise9.copyArray(data);

    Assert.assertArrayEquals(data, result);
  }

}
