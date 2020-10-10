package id.dondon.heaps;

import static org.junit.Assert.assertArrayEquals;

import id.dondon.heaps.Heap.HeapEmptyException;
import id.dondon.heaps.Heap.HeapFullException;
import org.junit.Test;

public class HeapsKLargestElementsTest {

  @Test
  public void findKLargest() throws HeapFullException, HeapEmptyException {
    int[] randomNumberArray = new int[] {2, 5, 6, 21, 67, 88, 4, 1, 3, 9, 99};
    int[] result = HeapsKLargestElements.getMaximumKElements(randomNumberArray, 3);
    int[] expected = {67, 88, 99};

    assertArrayEquals(expected, result);
  }

}
