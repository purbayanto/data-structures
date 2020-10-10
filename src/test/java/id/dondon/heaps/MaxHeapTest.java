package id.dondon.heaps;

import id.dondon.heaps.Heap.HeapEmptyException;
import id.dondon.heaps.Heap.HeapFullException;
import org.junit.Assert;
import org.junit.Test;

public class MaxHeapTest {

  @Test
  public void insert() throws HeapFullException, HeapEmptyException {
    MaxHeap<Integer> maxHeap = new MaxHeap<Integer>(Integer.class);
    maxHeap.insert(9);
    maxHeap.insert(4);
    maxHeap.insert(17);
    maxHeap.printHeapArray();
    maxHeap.insert(6);
    maxHeap.printHeapArray();

    int highestPriority1 = maxHeap.getHighestPriority();
    Assert.assertEquals(17, highestPriority1);

    maxHeap.insert(18);
    maxHeap.printHeapArray();

    int highestPriority2 = maxHeap.getHighestPriority();
    Assert.assertEquals(18, highestPriority2);

    maxHeap.insert(20);
    maxHeap.printHeapArray();

    int highestPriority3 = maxHeap.getHighestPriority();
    Assert.assertEquals(20, highestPriority3);
  }

  @Test
  public void removeHighestPriority() throws HeapFullException, HeapEmptyException {
    MaxHeap<Integer> maxHeap = new MaxHeap<Integer>(Integer.class);
    maxHeap.insert(9);
    maxHeap.insert(4);
    maxHeap.insert(17);
    maxHeap.insert(6);

    int highestPriority1 = maxHeap.removeHighestPriority();
    Assert.assertEquals(17, highestPriority1);

    int highestPriority2 = maxHeap.getHighestPriority();
    Assert.assertEquals(9, highestPriority2);
  }

  @Test
  public void getMinimum() throws HeapFullException {
    MaxHeap<Integer> maxHeap = new MaxHeap<Integer>(Integer.class);
    maxHeap.insert(9);
    maxHeap.insert(4);
    maxHeap.insert(17);
    maxHeap.insert(6);

    int highestPriority1 = maxHeap.getMinimum();
    Assert.assertEquals(4, highestPriority1);
  }

}
