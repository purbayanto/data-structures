package id.dondon.ctci.chapter1;

/**
 * Write a method to replace all spaces in a string with %20
 * You may assume that the string has sufficient space at the end to hold the additional characters,
 * and that you are given the "true" length of the string.
 * (Note: If implementing in Java, please use a character array so that you can perform this operation in place.)
 * */
public class InterviewQuestion3 {

  /**
   * FIXME
   * index out of bounds if last spaces under or equals 3
   * "Mr John Smith    " this will fine
   * "Mr John Smith   " this will error
   * */
  public static String solution1(String input, int trueLength) {
    char[] chars = input.toCharArray();
    int spaceCount = 0;
    int index = 0;
    // first loop, locate last position
    for (int i = 0; i < trueLength; i++) {
      if (chars[i] == ' ') {
        spaceCount++;
      }
    }

    index = trueLength + spaceCount * 2 - 1;
    // second loop, replace spaces from the end
    for (int i = trueLength - 1; i >= 0; i--) {
      if (chars[i] == ' ') {
        chars[index] = '0';
        chars[index - 1] = '2';
        chars[index - 2] = '%';
        index -= 3;
      } else {
        chars[index] = chars[i];
        index--;
      }
    }
    return new String(chars).trim();
  }

}
