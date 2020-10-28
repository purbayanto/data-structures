package id.dondon.ctci.bigO.exercises;

public class Exercise9 {

  /**
   * This will take (N²) time
   * */
  public static int[] copyArray(int[] array) {
    int[] copy = new int[0];
    for (int value : array) {
      copy = appendToNew(copy, value);
    }

    return copy;
  }

  private static int[] appendToNew(int[] array, int value) {
    // copy all elements over to new array
    int[] bigger = new int[array.length + 1];
    for (int i = 0; i < array. length; i++) {
      bigger[i] = array[i];
    }

    // add new element
    bigger[bigger.length - 1] = value;
    return bigger;
  }

}
