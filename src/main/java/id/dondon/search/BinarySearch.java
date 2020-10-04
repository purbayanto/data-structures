package id.dondon.search;

public class BinarySearch {

    public int search(int[] sortedArray, int number, int min, int max) {
        if (min > max) {
            return -1;
        }

        int mid = min + (max - min) / 2;
        if (sortedArray[mid] == number) {
            return mid;
        }

        if (sortedArray[mid] > number)  {
            return search(sortedArray, number, min, mid - 1);
        } else {
            return search(sortedArray, number, mid + 1, max);
        }
    }

}
