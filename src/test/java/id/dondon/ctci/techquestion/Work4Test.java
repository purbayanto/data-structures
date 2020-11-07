package id.dondon.ctci.techquestion;

import static org.junit.Assert.assertEquals;

import id.dondon.heaps.Heap.HeapEmptyException;
import id.dondon.heaps.Heap.HeapFullException;
import org.junit.Test;

public class Work4Test {

  @Test
  public void median() throws HeapFullException, HeapEmptyException {
    int[] arr = {5, 7, 9, 1, 2, 3};
    Work4 work4 = new Work4(arr);
    int result1 = work4.getMedian();
    assertEquals(5, result1);

    work4.insert(4);
    int result2 = work4.getMedian();
    assertEquals(4, result2);
  }

}
