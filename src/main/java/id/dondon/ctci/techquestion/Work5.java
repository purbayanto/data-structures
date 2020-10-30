package id.dondon.ctci.techquestion;

import id.dondon.search.BinarySearch;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Best Conceivable Runtime(BCR)
 *
 * Given two sorted arrays, find the number of elements in common.
 * The arrays are the same length and each has all distinct elements.
 *
 * Let's start with a good example.
 * We'll underline the elements in common.
 * A: 13 27 35 40 49 55 59
 * B: 17 35 39 40 55 58 60
 * A brute force algorithm for this problem is to start with each element in A and search for it in B.
 * This takes O(N²) time since for each of N elements in A, we need to do an 0 (N) search in B.
 * */
public class Work5 {

  /**
   * Brute Force: O(N²)
   *
   * Brute Force: O(N²)
   * Optimal Algorithm : ?
   * BCR : O(N)
   * */
  public static List<Integer> bruteForce(int[] a, int[] b) {
    List<Integer> result = new ArrayList<Integer>();

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        if (a[i] == b[j]) {
          result.add(a[i]);
          break;
        }
      }
    }

    return result;
  }

  /**
   * We can use binary search to find an element in a sorted array in O(log N)
   * Improved: O(N log N)
   *
   * Brute Force: O(N²)
   * Improved Algorithm: O(N log N)
   * Optimal Algorithm : ?
   * BCR : O(N)
   * */
  public static List<Integer> improve(int[] a, int[] b) {
    List<Integer> result = new ArrayList<Integer>();
    BinarySearch binarySearch = new BinarySearch();
    for (int i = 0; i < a.length; i++) {
      int res = binarySearch.search(b, a[i], 0, b.length);
      if (res > 0) {
        result.add(b[res]);
      }
    }

    return result;
  }

  /**
   * we can just throw everything in B into a hash table. This will take O( N) time.
   * Then, we just go through A and look up each element in the hash table.
   * This look up (or search) is 0 (1), so our runtime is O(N).
   *
   * Brute Force: O(N²)
   * Improved Algorithm: O(N log N)
   * Optimal Algorithm : O(N)
   * BCR : O(N)
   * */
  public static List<Integer> optimal(int[] a, int[] b) {
    List<Integer> result = new ArrayList<Integer>();
    Set<Integer> hash = new HashSet<Integer>();
    for (int i = 0; i < b.length; i++) {
      hash.add(b[i]);
    }

    for (int i = 0; i < a.length; i++) {
      if (hash.contains(a[i])) {
        result.add(a[i]);
      }
    }

    return result;
  }

}
