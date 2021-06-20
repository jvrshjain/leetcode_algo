package sorting;

/*
 *
 * Sort the elements by comparing wih its adjacent  elements in the given array.
 * Swap the elements when the order does not match.
 *
 * On every iteration, the whole array gets closer to sorted
 *
 * Adaptive: We can break the loop early
 *
 * Takes no extra memory
 *
 * Complexity
 * O(N^2) Comparisions
 * O(N^2) Swaps
 *
 * Useful for nearly sorted list
 *
 * */

public class B_BubbleSort implements ISort {

    @Override
    public void sort(int[] arr) {
        for(int i=0; i < arr.length; i++){
            boolean swapped = false;
            for(int j = 0 ; j < arr.length -1 ; j++){
                if(arr[j] > arr [j+1]){
                    swap(arr, j, j+1);
                    print(arr);
                    swapped = true;
                }
            }
            System.out.println("After Iteration : " + i+1);
            print(arr);
            if(!swapped){
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        System.out.println("++++++++++++++++");
        int[] arr = {9,6,4,5,2,3,0,7,1,8};
        ISort algo = new B_BubbleSort();
        algo.print(arr);
        System.out.println("++++++++++++++++");
        algo.sort(arr);
    }
}
