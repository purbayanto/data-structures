package id.dondon.heaps;

public class HeapSort {

  private int[] array;

  public HeapSort(int[] array) {
    this.array = array;

    int endIndex = this.array.length - 1;
    int index = getParentIndex(endIndex, endIndex);
    while (index >= 0) {
      percolateDown(index, endIndex);
      index--;
    }
  }

  public void sort() {
    int endIndex = array.length - 1;
    while (endIndex > 0) {
      swap(0, endIndex);
      endIndex--;
      percolateDown(0, endIndex);
    }
  }
  
  private int getParentIndex(int index, int endIndex) {
    if (index < 0 || index > endIndex) {
      return -1;
    }

    return (index - 1) / 2;
  }

  private int getLeftChildIndex(int index, int endIndex) {
    int leftChildIndex = 2 * index + 1;
    if (leftChildIndex > endIndex) {
      return -1;
    }

    return leftChildIndex;
  }

  private int getRightChildIndex(int index, int endIndex) {
    int rightChildIndex = 2 * index + 2;
    if (rightChildIndex > endIndex) {
      return -1;
    }

    return rightChildIndex;
  }

  private void swap(int index1, int index2) {
    int tempValue = array[index1];
    array[index1] = array[index2];
    array[index2] = tempValue;
  }

  private void percolateDown(int index, int endIndex) {
    int leftChildIndex = getLeftChildIndex(index, endIndex);
    int rightChildIndex = getRightChildIndex(index, endIndex);

    if (leftChildIndex != -1 && array[leftChildIndex] > array[index]) {
      swap(leftChildIndex, index);
      percolateDown(leftChildIndex, endIndex);
    }

    if (rightChildIndex != -1 && array[rightChildIndex] > array[index]) {
      swap(rightChildIndex, index);
      percolateDown(rightChildIndex, endIndex);
    }
  }
  
}
