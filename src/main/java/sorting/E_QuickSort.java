package sorting;

public class E_QuickSort implements ISort {

    public static void main(String[] args) {
        System.out.println("Quick Sort");
        System.out.println("++++++++++++++++");
        int[] arr = {9, 6, 4, 5, 2, 3, 0, 7, 1, 8};
        ISort algo = new E_QuickSort();
        algo.print(arr);
        System.out.println("++++++++++++++++");
        algo.sort(arr);
    }

    @Override
    public void sort(int[] listToSort) {
        quickSort(listToSort, 0, listToSort.length - 1);
    }

    public void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = partition(arr, low, high);
        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);
        print(arr);
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int l = low, h = high;
        if (l <= h) {
            while (arr[l] <= pivot && l < h) {
                l++;
            }
            while (arr[h] > pivot) {
                h--;
            }
            if (l < h) {
                swap(arr, l, h);
            }
        }
        swap(arr, low, h);
        System.out.printf("Partition: %d\n", pivot);
        print(arr);
        return h;
    }
}
