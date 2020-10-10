package id.dondon.heaps;

public class HeapsKLargestElements {

  public static int[] getMaximumKElements(int[] randomNumberArray, int k)
      throws MinHeap.HeapEmptyException, MinHeap.HeapFullException {
    MinHeap<Integer> minHeap = new MinHeap<Integer>(Integer.class, k);

    for (int number : randomNumberArray) {
      if (minHeap.isEmpty()) {
        minHeap.insert(number);
      } else if (!minHeap.isFull() || minHeap.getHighestPriority() < number) {
        if (minHeap.isFull()) {
          minHeap.removeHighestPriority();
        }
        minHeap.insert(number);
      }
    }

    minHeap.printHeapArray();

    int[] result = new int[minHeap.getCount()];
    for (int i = 0; i < result.length; i++) {
      result[i] = minHeap.removeHighestPriority();
    }

    return result;
  }

}
