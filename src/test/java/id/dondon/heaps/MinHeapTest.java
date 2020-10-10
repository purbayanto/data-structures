package id.dondon.heaps;

import id.dondon.heaps.Heap.HeapEmptyException;
import id.dondon.heaps.Heap.HeapFullException;
import org.junit.Assert;
import org.junit.Test;

public class MinHeapTest {

  @Test
  public void insert() throws HeapFullException, HeapEmptyException {
    MinHeap<Integer> minHeap = new MinHeap<Integer>(Integer.class);
    minHeap.insert(9);
    minHeap.insert(4);
    minHeap.insert(17);
    minHeap.printHeapArray();
    minHeap.insert(6);
    minHeap.printHeapArray();

    int highestPriority1 = minHeap.getHighestPriority();
    Assert.assertEquals(4, highestPriority1);

    minHeap.insert(2);
    minHeap.printHeapArray();

    int highestPriority2 = minHeap.getHighestPriority();
    Assert.assertEquals(2, highestPriority2);

    minHeap.insert(1);
    minHeap.printHeapArray();

    int highestPriority3 = minHeap.getHighestPriority();
    Assert.assertEquals(1, highestPriority3);
  }

  @Test
  public void removeHighestPriority() throws HeapFullException, HeapEmptyException {
    MinHeap<Integer> minHeap = new MinHeap<Integer>(Integer.class);
    minHeap.insert(9);
    minHeap.insert(4);
    minHeap.insert(17);
    minHeap.insert(6);

    int highestPriority1 = minHeap.removeHighestPriority();
    Assert.assertEquals(4, highestPriority1);

    int highestPriority2 = minHeap.getHighestPriority();
    Assert.assertEquals(6, highestPriority2);
  }

  @Test
  public void getMaximum() throws HeapFullException {
    MinHeap<Integer> minHeap = new MinHeap<Integer>(Integer.class);
    minHeap.insert(9);
    minHeap.insert(4);
    minHeap.insert(17);
    minHeap.insert(6);

    int highestPriority1 = minHeap.getMaximum();
    Assert.assertEquals(17, highestPriority1);
  }

}
