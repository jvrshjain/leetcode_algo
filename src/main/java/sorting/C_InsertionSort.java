package sorting;

/*
* Start with sub-list or size 1.
* Start adding elements to the sub-list, to its right position.
* Compare the adding element with entire sub-list to find its right position.
*
* Complexity: O(N^2) on both Comparisons and Swaps
*
* Adaptive
* Takes no extra space O(1)
*
* Wort Case: When Given arr is in desc order and you need to arrange it in ascending order
*
* Divide and Conquer Algorithm use  this approach
*
* */

public class C_InsertionSort implements ISort {

    @Override
    public void sort(int[] arr) {
        for(int i=0; i< arr.length -1 ; i++){
            for(int j=i+1; j>0; j--) {
                if(arr[j] < arr [j-1]){
                    swap(arr, j, j-1);
                }else {
                    break;
                }
                print(arr);
            }
            System.out.printf("After Iteration: %d \n", i+1);
            print(arr);
        }
    }

    public static void main(String[] args) {
        System.out.println("Insertion Sort");
        System.out.println("++++++++++++++++");
        int[] arr = {9,6,4,5,2,3,0,7,1,8};
        ISort algo = new C_InsertionSort();
        algo.print(arr);
        System.out.println("++++++++++++++++");
        algo.sort(arr);
    }


}
