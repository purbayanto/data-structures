package id.dondon.search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void searchInSortedList() {
        int[] sortedArray = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30};

        BinarySearch binarySearch = new BinarySearch();
        int numberToSearch = 30;
        int indexResult = binarySearch.search(sortedArray, numberToSearch, 0, sortedArray.length - 1);

        assertEquals(14, indexResult);
    }

}
