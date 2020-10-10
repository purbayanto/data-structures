package id.dondon.heaps;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class HeapSortTest {

  @Test
  public void sort() {
    int[] input = {4, 6, 9, 2, 10, 56, 12, 5, 1, 17, 14};
    HeapSort heapSort = new HeapSort(input);
    heapSort.sort();

    int[] expected = {1, 2, 4, 5, 6, 9, 10, 12, 14, 17, 56};
    assertArrayEquals(expected, input);
  }

}
