package id.dondon.ctci.chapter1;

/**
 * Palindrome Permutation:
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards.
 * A permutation is a rearrangement of letters.
 * The palindrome does not need to be limited to just dictionary words.
 *
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat". "atco cta". etc.)
 * */
public class InterviewQuestion4 {

  /**
   * This algorithm takes O(N) time
   * where N is the length of the string.
   * */
  public static boolean solution1(String input) {
    if (input == null) {
      return false;
    }

    int[] table = buildCharFrequencyTable(input);
    return checkMaxOneOdd(table);
  }

  /**
   * This algorithm takes O(N) time
   * where N is the length of the string.
   * */
  public static boolean solution2(String input) {
    if (input == null) {
      return false;
    }

    int countOdd = 0;
    int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
    for (char c : input.toCharArray()) {
      int x = getCharNumber(c);
      if (x != -1) {
        table[x]++;
        if (table[x] % 2 == 1) {
          countOdd++;
        } else {
          countOdd--;
        }
      }
    }

    return countOdd < 2;
  }

  /**
   * This algorithm takes O(N) time
   * where N is the length of the string.
   * */
  public static boolean solution3(String input) {
    if (input == null) {
      return false;
    }

    int bitVector = createBitVector(input);
    return bitVector == 0 || checkExactlyOneBitSet(bitVector);
  }

  private static boolean checkExactlyOneBitSet(int bitVector) {
    return (bitVector & (bitVector - 1)) == 0;
  }

  private static int createBitVector(String input) {
    int bitVector = 0;
    for (char c: input.toCharArray()) {
      int x = getCharNumber(c);
      bitVector = toggle(bitVector, x);
    }

    return bitVector;
  }

  private static int toggle(int bitVector, int index) {
    if (index < 0) return bitVector;

    int mask = 1 << index;
    if ((bitVector & mask) == 0) {
      bitVector |= mask;
    } else {
      bitVector &= ~mask;
    }

    return bitVector;
  }

  private static boolean checkMaxOneOdd(int[] table) {
    boolean foundOdd = false;
    for (int count: table) {
      if (count % 2 == 1) {
        if (foundOdd) {
          return false;
        }
        foundOdd = true;
      }
    }

    return true;
  }

  private static int[] buildCharFrequencyTable(String input) {
    int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
    for (char c: input.toCharArray()) {
      int x = getCharNumber(c);
      if (x != -1) {
        table[x]++;
      }
    }

    return table;
  }

  private static int getCharNumber(char c) {
    int a = Character.getNumericValue('a');
    int z = Character.getNumericValue('z');
    int val = Character.getNumericValue(c);
    if (a <= val && val <= z) {
      return val - a;
    }

    return -1;
  }

}
