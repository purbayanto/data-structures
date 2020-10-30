package id.dondon.ctci.techquestion;

import com.sun.tools.javac.util.Pair;
import id.dondon.search.BinarySearch;
import id.dondon.sort.MergeSort;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given an array of distinct integer values,
 * count the number of pairs of integers that have difference k.
 * For example, given the array {1, 7, 5, 9, 2, 12, 3}
 * and the difference k = 2,
 * there are four pairs with difference 2: (1, 3), (3, 5), (5, 7), (7, 9) .
 * */
public class Work1 {

  public static List<Pair<Integer, Integer>> solution1(int[] unsortedArr, int range) {
    // sort first
    MergeSort mergeSort = new MergeSort();
    mergeSort.sort(unsortedArr);

    BinarySearch binarySearch = new BinarySearch();

    List<Pair<Integer, Integer>> result = new ArrayList<Pair<Integer, Integer>>();
    for (int i = 0; i < unsortedArr.length; i++) {
      int first = unsortedArr[i];
      int target = first + range;
      int targetIndex = binarySearch.search(unsortedArr, target, 0, unsortedArr.length - 1);

      if (targetIndex != -1) {
        result.add(Pair.of(first, unsortedArr[targetIndex]));
      }
    }

    return result;
  }

  public static List<Pair<Integer, Integer>> solution2(int[] unsortedArr, int range) {
    List<Pair<Integer, Integer>> result = new ArrayList<Pair<Integer, Integer>>();
    Set<Integer> hashSet = new HashSet<Integer>();
    Set<Integer> existSet = new HashSet<Integer>();
    for (int i = 0; i < unsortedArr.length; i++) {
      hashSet.add(unsortedArr[i]);
    }

    for (int i = 0; i < unsortedArr.length; i++) {
      int first = unsortedArr[i];
      int target = -1;
      int firstTarget = first + range;
      int secondTarget = first - range;
      if (hashSet.contains(firstTarget)) {
        target = firstTarget;
      } else if (hashSet.contains(secondTarget)) {
        target = secondTarget;
      }

      if (target == -1)
        continue;

      if (first < target) {
        if (!existSet.contains(first)) {
          existSet.add(first);
          result.add(Pair.of(first, target));
        }
      } else {
        if (!existSet.contains(target)) {
          existSet.add(target);
          result.add(Pair.of(target, first));
        }
      }
    }

    return result;
  }

}
