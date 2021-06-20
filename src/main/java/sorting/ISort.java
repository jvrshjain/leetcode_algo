package sorting;

public interface ISort {

    public void sort(int[] t);

    default void print(final int[] arr){
        System.out.print("[");
        for(int i=0; i< arr.length ; i++) {
            if(i>0) {System.out.print(", "); }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }

    default void swap(final int[] arr, final int firstIndex, final int secIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secIndex];
        arr[secIndex] = temp;
    }
}
