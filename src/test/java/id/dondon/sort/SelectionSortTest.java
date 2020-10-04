package id.dondon.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {

    @Test
    public void sort() {
        int listToSort[] = new int[] {4, 5, 6, 2, 1, 7, 10, 3, 8, 9};
        int expected[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.print(listToSort);
        selectionSort.sort(listToSort);

        assertArrayEquals(expected, listToSort);
    }

}
