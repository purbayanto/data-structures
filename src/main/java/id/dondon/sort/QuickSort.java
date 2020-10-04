package id.dondon.sort;

public class QuickSort {

    public void print(int[] listToSort) {
        for (int el : listToSort) {
            System.out.print(el + ",");
        }
        System.out.println();
    }

    private void swap(int[] listToSort, int iIndex, int jIndex) {
        int temp = listToSort[iIndex];
        listToSort[iIndex] = listToSort[jIndex];
        listToSort[jIndex] = temp;
    }

    public void sort(int[] listToSort, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivotIndex = partition(listToSort, low, high);
        sort(listToSort, low, pivotIndex - 1);
        sort(listToSort, pivotIndex + 1, high);
    }

    private int partition(int[] listToSort, int low, int high) {
        int pivot = listToSort[low];
        int l = low;
        int h = high;
        while (l < h) {
            while (listToSort[l] <= pivot && l < h) {
                l++;
            }
            while (listToSort[h] > pivot) {
                h--;
            }
            if (l < h) {
                swap(listToSort, l, h);
            }
        }
        swap(listToSort, low, h);

        System.out.println("Pivot: " + pivot);
        print(listToSort);
        return h;
    }

}
