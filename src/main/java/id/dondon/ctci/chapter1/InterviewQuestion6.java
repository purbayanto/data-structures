package id.dondon.ctci.chapter1;

/**
 * String Compression
 * Implement a method to perform basic string compression using the count of repeated characters.
 * For example, the string aabcccccaaa would become a2b1c5a3.
 * if the "compressed" string would be not smaller than the original string,
 * your method should return the original string.
 * You can assume the string has only uppercase and lowercase letter (a-z).
 * */
public class InterviewQuestion6 {

  /**
   * This takes O(N + k²) time
   * where k is is the number character sequences, ex : aabcccccaaa has 6 sequences.
   * it's slow since String concatenation operates in O(N²) time
   * prefer using StringBuilder instead.
   * */
  public static String solution1(String str) {
    String compressedString = "";
    int countConsecutive = 0;
    for (int i = 0; i < str.length(); i++) {
      countConsecutive++;

      /* If next character is different than current, append this char to result.*/
      if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
        compressedString += "" + str.charAt(i) + countConsecutive;
        countConsecutive = 0;
      }
    }

    return compressedString.length() < str.length() ? compressedString : str;
  }

  /**
   * This takes O(N) time
   * */
  public static String solution2(String str) {
    StringBuilder sb = new StringBuilder();
    int countConsecutive = 0;
    for (int i = 0; i < str.length(); i++) {
      countConsecutive++;

      /* If next character is different than current, append this char to result.*/
      if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
        sb.append(str.charAt(i));
        sb.append(countConsecutive);
        countConsecutive = 0;
      }
    }

    return sb.length() < str.length() ? sb.toString() : str;
  }

  public static String solution3(String str) {
    int finalLength = countCompression(str);
    if (finalLength >= str.length()) return str;

    StringBuffer compressed = new StringBuffer(finalLength); // initialize capacity
    int countConsecutive = 0;
    for (int i = 0; i < str.length(); i++) {
      countConsecutive++;

      /* If next character is different than current, append this char to result.*/
      if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
        compressed.append(str.charAt(i));
        compressed.append(countConsecutive);
        countConsecutive = 0;
      }
    }
    return compressed.toString();
  }

  private static int countCompression(String str) {
    int compressedLength = 0;
    int countConsecutive = 0;
    for (int i = 0; i < str.length(); i++) {
      countConsecutive++;

      /* If next character is different than current, append this char to result.*/
      if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
        compressedLength += 1 + String.valueOf(countConsecutive).length();
        countConsecutive = 0;
      }
    }
    return compressedLength;
  }

}
