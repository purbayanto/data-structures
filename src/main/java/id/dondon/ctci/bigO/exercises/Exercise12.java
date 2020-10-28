package id.dondon.ctci.bigO.exercises;

import id.dondon.search.BinarySearch;
import id.dondon.sort.MergeSort;

public class Exercise12 {

  /**
   * This will take 0(b log b + a log b) time
   * First, we have to sort array b,which takes O(b log b) time
   * Then, for each element in a, we do binary search in 0 (log b) time
   * The second part takes 0 (a log b) time.
   * */
  public static int intersection(int[] a, int[] b) {
    MergeSort mergeSort = new MergeSort();
    mergeSort.sort(b);

    int intersect = 0;

    BinarySearch binarySearch = new BinarySearch();
    for (int x : a) {
      int result = binarySearch.search(b, x, 0, b.length - 1);
      if (result >= 0) {
        intersect++;
      }
    }

    return intersect;
  }


}
