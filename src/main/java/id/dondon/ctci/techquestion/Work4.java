package id.dondon.ctci.techquestion;

import id.dondon.heaps.Heap.HeapEmptyException;
import id.dondon.heaps.Heap.HeapFullException;
import id.dondon.heaps.MaxHeap;
import id.dondon.heaps.MinHeap;

/**
 * Numbers are randomly generated and stored into an (expanding) array.
 * How would you keep track of the median?
 * */
public class Work4 {

  private MaxHeap<Integer> maxHeap;
  private MinHeap<Integer> minHeap;
  private int size = 0;

  public Work4(int[] arr) throws HeapFullException, HeapEmptyException {
    size = arr.length;
    maxHeap = new MaxHeap<Integer>(Integer.class, 100);
    minHeap = new MinHeap<Integer>(Integer.class, 100);

    for (int i = 0; i < size; i++) {
      insertHeap(arr[i]);
    }
  }

  public void insert(int val) throws HeapFullException, HeapEmptyException {
    size++;
    insertHeap(val);
  }

  public int getMedian() throws HeapEmptyException {
    if (minHeap.isEmpty()) {
      return maxHeap.getMinimum();
    }

    return minHeap.getHighestPriority();
  }

  private void insertHeap(int val) throws HeapFullException, HeapEmptyException {
    maxHeap.insert(val);
    int mid = size / 2;
    if (maxHeap.getCount() > mid) {
      int maxValue = maxHeap.removeHighestPriority();
      minHeap.insert(maxValue);
    }
  }

}
