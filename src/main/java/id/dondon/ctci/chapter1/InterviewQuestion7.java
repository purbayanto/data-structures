package id.dondon.ctci.chapter1;

/**
 * Rotate Matrix
 * Given an image represented by an XnX matrix,
 * where each pixel in the image is 4 bytes,
 * write a method to rotate the image by 90 degrees.
 * Can you do this in place ?
 * */
public class InterviewQuestion7 {

  /**
   * This takes O(N²) times & O(N) space
   * which is the best we can do since any algorithm must touch all N2 elements.
   * */
  public static boolean solution1(int[][] matrix) {
    if (matrix.length == 0 || matrix.length != matrix[0].length) return false;

    int n = matrix.length;
    for (int layer = 0; layer < n / 2; layer++) {
      int first = layer;
      int last = n - 1 - layer;
      for (int i = first; i < last; i++) {
        int offset = i - first;
        int top = matrix[first][i]; // save top

        // change top with left
        matrix[first][i] = matrix[last - offset][first];

        // change left with bottom
        matrix[last - offset][first] = matrix[last][last - offset];

        // change bottom with right
        matrix[last][last - offset] = matrix[i][last];

        // change right with rop
        matrix[i][last] = top;
      }
    }

    return true;
  }

}
