package id.dondon.ctci.techquestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Print all positive integer solutions
 * to the equation a³ + b³ = c³ + d³
 * where a, b, c, and d are integers between 1 and 1000.
 * */
public class Work2 {

  /**
   * This will take O(N⁴)
   * */
  public static List<String> solution1(int n) {
    List<String> result = new ArrayList<String>();
    for (int a = 1; a <= n; a++) {
      for (int b = 1; b <= n; b++) {
        for (int c = 1; c <= n; c++) {
          for (int d = 1; d <= n; d++) {
            double resA = Math.pow(a, 3);
            double resB = Math.pow(b, 3);
            double resC = Math.pow(c, 3);
            double resD = Math.pow(d, 3);
            if (resA + resB == resC + resD) {
              result.add(a + " " + b + " " + c + " " + d);
            }
          }
        }
      }
    }

    return result;
  }

  /**
   * This won't make a meaningful change to the runtime
   * our algorithm is still O(N⁴)-but it's still a good, quick fix to make.
   * */
  public static List<String> solution2(int n) {
    List<String> result = new ArrayList<String>();
    for (int a = 1; a <= n; a++) {
      for (int b = 1; b <= n; b++) {
        for (int c = 1; c <= n; c++) {
          for (int d = 1; d <= n; d++) {
            double resA = Math.pow(a, 3);
            double resB = Math.pow(b, 3);
            double resC = Math.pow(c, 3);
            double resD = Math.pow(d, 3);
            if (resA + resB == resC + resD) {
              result.add(a + " " + b + " " + c + " " + d);
              break;
            }
          }
        }
      }
    }

    return result;
  }

  /**
   * If there's onl one valid d value for each (a, b, c)
   * then we can just compute it.This is just simple math: d=∛a³+b³-C³
   * This will take O(N³)
   * */
  public static List<String> solution3(int n) {
    List<String> result = new ArrayList<String>();
    for (int a = 1; a <= n; a++) {
      for (int b = 1; b <= n; b++) {
        for (int c = 1; c <= n; c++) {
          double resA = Math.pow(a, 3);
          double resB = Math.pow(b, 3);
          double resC = Math.pow(c, 3);
          double div = 1.0/3.0;
          int d = (int) Math.pow(Math.sqrt(resA + resB - resC), div);
          double resD = Math.pow(d, 3);
          if (resA + resB == resC + resD) {
            result.add(a + " " + b + " " + c + " " + d);
          }
        }
      }
    }

    return result;
  }

  /**
   * This will take O(N⁴)
   * */
  public static List<String> solution4(int n) {
    Map<String, String> maps = new HashMap<String, String>();
    List<String> result = new ArrayList<String>();
    for (int c = 1; c <= n; c++) {
      for (int d = 1; d <= n; d++) {
        double resC = Math.pow(c, 3);
        double resD = Math.pow(d, 3);
        maps.put(resC + " " + resD, c + " " + d);
      }
    }


    for (int a = 1; a <= n; a++) {
      for (int b = 1; b <= n; b++) {
        double resA = Math.pow(a, 3);
        double resB = Math.pow(b, 3);
        if (maps.containsKey(resA + " " + resB)) {
          result.add(a + " " + b + " " + maps.get(resA + " " + resB));
        }
      }
    }

    return result;
  }

  /**
   * Actually, once we have the map of all the (c, d) pairs, we can just use that directly.
   * We don't need to generate the (a, b) pairs. Each (a, b) will already be in the map.
   *
   * This will take our runtime to O(N²)
   * */
  public static List<String> solution5(int n) {
    Map<String, String> maps = new HashMap<String, String>();
    List<String> store = new ArrayList<String>();
    List<String> result = new ArrayList<String>();
    for (int c = 1; c <= n; c++) {
      for (int d = 1; d <= n; d++) {
        double resC = Math.pow(c, 3);
        double resD = Math.pow(d, 3);
        store.add(resC + " " + resD);
        maps.put(resC + " " + resD, c + " " + d);
      }
    }

    for (int i = 0; i < store.size(); i++) {
      String res = store.get(i);
      if (maps.containsKey(res)) {
        result.add(maps.get(res)+ " " + maps.get(res));
      }
    }

    return result;
  }

}
