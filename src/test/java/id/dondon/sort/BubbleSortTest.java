package id.dondon.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void sort() {
        int listToSort[] = new int[] {3, 5, 6, 8, 10, 1, 2, 4, 7, 9};
        int expected[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.print(listToSort);
        bubbleSort.sort(listToSort);

        assertArrayEquals(expected, listToSort);
    }

    @Test
    public void sort_halfSorted() {
        int listToSort[] = new int[] {1, 2, 3, 4, 10, 5, 6, 9, 8, 7};
        int expected[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.print(listToSort);
        bubbleSort.sort(listToSort);

        assertArrayEquals(expected, listToSort);
    }


}
