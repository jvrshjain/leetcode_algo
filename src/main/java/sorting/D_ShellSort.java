package sorting;

public class D_ShellSort implements ISort {

    public static void main(String[] args) {
        System.out.println("Shell Sort");
        System.out.println("++++++++++++++++");
        int[] arr = {9,6,4,5,2,3,0,7,1,8};
        ISort algo = new D_ShellSort();
        algo.print(arr);
        System.out.println("++++++++++++++++");
        algo.sort(arr);
    }

    @Override
    public void sort(int[] listToSort) {

        int increment  = listToSort.length/2;
        while (increment >= 1){
            for (int startIndex = 0; startIndex < increment; startIndex++){
                insertionSort(listToSort, startIndex, increment);
                print(listToSort);
            }
            increment = increment/2;
        }
        System.out.println("After Sorting ++++++++");
        print(listToSort);
    }

    private void insertionSort(int[] listToSort, int startIndex, int increment) {
        for (int i=startIndex; i< listToSort.length - 1; i++){
            for (int j= Math.min(i+increment, listToSort.length -1);
            j-increment >= 0;
            j= j-increment){
                if (listToSort[j] < listToSort[j-increment]){
                    swap(listToSort, j , j-increment);
                }else {
                    break;
                }
            }
        }
    }
}
