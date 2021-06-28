package search;

import sorting.E_QuickSort;
import sorting.ISort;

import java.sql.SQLOutput;
import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println("Binary Search : Works on the Sorted Array");
        System.out.println("++++++++++++++++");
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        Arrays.stream(arr).forEach(value -> System.out.printf(value + ","));
        BinarySearch searchAlgo = new BinarySearch();
        int number = 99;
        System.out.printf("\n+++++++++\nSearch For %d\n++++++++\n", number);
        int index = searchAlgo.search(arr, number);
        System.out.printf("The %d is at the position %d", number, index);
    }

    private int search(int[] sortedArr, int number) {
        int min = 0, max = sortedArr.length-1;
        while (min <= max){
            int mid = min + (max - min) /2;
            if(sortedArr[mid] == number){
                return mid;
            }
            if (sortedArr[mid] > number){
                max = mid-1;
            }
            if(sortedArr[mid] < number){
                min = mid + 1;
            }
        }
        return -1;
    }

    private void print(int[] arr) {
        Arrays.stream(arr).peek(value -> System.out.println(value + ","));
    }
}
