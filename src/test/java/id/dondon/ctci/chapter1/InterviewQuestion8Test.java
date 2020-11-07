package id.dondon.ctci.chapter1;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class InterviewQuestion8Test {

  @Test
  public void solution1() {
    int[][] matrix = {
        {1, 1, 1, 1, 1},
        {2, 2, 2, 2, 2},
        {3, 3, 0, 3, 3},
        {4, 4, 4, 4, 4},
        {5, 5, 5, 5, 5}
    };

    InterviewQuestion8.solution1(matrix);

    int[][] expected = {
        {1, 1, 0, 1, 1},
        {2, 2, 0, 2, 2},
        {0, 0, 0, 0, 0},
        {4, 4, 0, 4, 4},
        {5, 5, 0, 5, 5}
    };

    assertArrayEquals(expected, matrix);
  }

  @Test
  public void solution1_b() {
    int[][] matrix = {
        {0, 1, 1, 1, 1},
        {2, 2, 2, 2, 2},
        {3, 3, 3, 3, 3},
        {4, 4, 4, 4, 4},
        {5, 5, 5, 5, 5}
    };

    InterviewQuestion8.solution1(matrix);

    int[][] expected = {
        {0, 0, 0, 0, 0},
        {0, 2, 2, 2, 2},
        {0, 3, 3, 3, 3},
        {0, 4, 4, 4, 4},
        {0, 5, 5, 5, 5}
    };

    assertArrayEquals(expected, matrix);
  }

  @Test
  public void solution1_c() {
    int[][] matrix = {
        {1, 1, 1, 1, 1},
        {2, 2, 2, 2, 2},
        {3, 3, 3, 3, 3},
        {4, 4, 4, 4, 4},
        {5, 5, 5, 5, 0}
    };

    InterviewQuestion8.solution1(matrix);

    int[][] expected = {
        {1, 1, 1, 1, 0},
        {2, 2, 2, 2, 0},
        {3, 3, 3, 3, 0},
        {4, 4, 4, 4, 0},
        {0, 0, 0, 0, 0}
    };

    assertArrayEquals(expected, matrix);
  }

  @Test
  public void solution2() {
    int[][] matrix = {
        {1, 1, 1, 1, 1},
        {2, 2, 2, 2, 2},
        {3, 3, 0, 3, 3},
        {4, 4, 4, 4, 4},
        {5, 5, 5, 5, 5}
    };

    InterviewQuestion8.solution2(matrix);

    int[][] expected = {
        {1, 1, 0, 1, 1},
        {2, 2, 0, 2, 2},
        {0, 0, 0, 0, 0},
        {4, 4, 0, 4, 4},
        {5, 5, 0, 5, 5}
    };

    assertArrayEquals(expected, matrix);
  }

  @Test
  public void solution2_b() {
    int[][] matrix = {
        {0, 1, 1, 1, 1},
        {2, 2, 2, 2, 2},
        {3, 3, 3, 3, 3},
        {4, 4, 4, 4, 4},
        {5, 5, 5, 5, 5}
    };

    InterviewQuestion8.solution2(matrix);

    int[][] expected = {
        {0, 0, 0, 0, 0},
        {0, 2, 2, 2, 2},
        {0, 3, 3, 3, 3},
        {0, 4, 4, 4, 4},
        {0, 5, 5, 5, 5}
    };

    assertArrayEquals(expected, matrix);
  }

  @Test
  public void solution2_c() {
    int[][] matrix = {
        {1, 1, 1, 1, 1},
        {2, 2, 2, 2, 2},
        {3, 3, 3, 3, 3},
        {4, 4, 4, 4, 4},
        {5, 5, 5, 5, 0}
    };

    InterviewQuestion8.solution2(matrix);

    int[][] expected = {
        {1, 1, 1, 1, 0},
        {2, 2, 2, 2, 0},
        {3, 3, 3, 3, 0},
        {4, 4, 4, 4, 0},
        {0, 0, 0, 0, 0}
    };

    assertArrayEquals(expected, matrix);
  }

}
