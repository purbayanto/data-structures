package id.dondon.heaps;

public class MaxHeap<T extends Comparable> extends Heap<T> {

  public MaxHeap(Class<T> clazz) {
    super(clazz);
  }

  public MaxHeap(Class<T> clazz, int size) {
    super(clazz, size);
  }

  @Override
  protected void siftDown(int index) {
    int leftIndex = getLeftChildIndex(index);
    int rightIndex = getRightChildIndex(index);

    // Find the maximum of the left and right child elements.
    int largerIndex = -1;
    if (leftIndex != -1 && rightIndex != -1) {
      largerIndex = getElementAtIndex(leftIndex).compareTo(getElementAtIndex(rightIndex)) > 0
          ? leftIndex : rightIndex;
    } else if (leftIndex != -1) {
      largerIndex = leftIndex;
    } else if (rightIndex != -1) {
      largerIndex = rightIndex;
    }

    // If the left and right child do not exist stop sifting down.
    if (largerIndex == -1) {
      return;
    }

    // Compare the larger child with the current index to see if a swap
    // and further sift down is needed.
    if (getElementAtIndex(largerIndex).compareTo(getElementAtIndex(index)) > 0) {
      swap(largerIndex, index);
      siftDown(largerIndex);
    }
  }

  @Override
  protected void siftUp(int index)  {
    int parentIndex = getParentIndex(index);

    if (parentIndex != -1 &&
        getElementAtIndex(index).compareTo(getElementAtIndex(parentIndex)) > 0) {
      swap(parentIndex, index);

      siftUp(parentIndex);
    }
  }

  public T getMinimum() {
    int lastIndex = getCount() - 1;
    int lastParentIndex = getParentIndex(lastIndex);

    int firstChildIndex = lastParentIndex + 1;

    T minElement = getElementAtIndex(firstChildIndex);
    for (int i = firstChildIndex; i <= lastIndex; i++) {
      if (minElement.compareTo(getElementAtIndex(i)) > 0) {
        minElement = getElementAtIndex(i);
      }
    }

    return minElement;
  }

}
