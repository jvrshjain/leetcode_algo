package sorting;

/*
*
* Sort the elements by comparing wih every other elements in the given array.
* Swap the elements when the order does not match.
*
* Complexity
* O(N^2) Comparisions
* O(N) Swaps
*
* */

public class A_SelectionSort implements ISort {

    public static void main(String[] args) {
        System.out.println("Selection Sort");
        System.out.println("++++++++++++++++");
        int[] arr = {9,6,4,5,2,3,0,7,1,8};
        A_SelectionSort algo = new A_SelectionSort();
        algo.print(arr);
        System.out.println("++++++++++++++++");
        algo.sort(arr);
    }

     public void sort(int[] arr) {
         for (int i=0; i< arr.length; i++){
             for (int j=i+1; j < arr.length; j++){
                 if(arr[i] > arr[j]){
                     swap(arr, i, j);
                 }
            }
           print(arr);
         }
     }
}
