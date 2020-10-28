package id.dondon.ctci.bigO.examples;

public class Example16 {

  /**
   * powersOf2(50)
   *  powersOf2(25)
   *    powersOf2(12)
   *      powersOf2(6)
   *        powersOf2(3)
   *          powersOf2(1)
   *            print & return 1
   *          print & return 2
   *        print & return 4
   *      print & return 8
   *    print & return 16
   *  print & return 32
   *
   *  the run time is O(log n)
   * */
  public static int powersOf2(int n) {
    if (n < 1) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      int prev = powersOf2(n / 2);
      int curr = prev * 2;
      System.out.println("current => " + curr);

      return curr;
    }
  }

}
