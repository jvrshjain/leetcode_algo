package algo.easy.linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CountPairs {

    //Time Complexity id O(n^2)
    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x) {
        // add your code here
        int count = 0;
        if(head1==null || head2 == null) return count;
        Iterator<Integer> itr1 = head1.iterator();
        while(itr1.hasNext()){
            int a = itr1.next();
            Iterator<Integer> itr2 = head2.iterator();
            while (itr2.hasNext()){
                int b = itr2.next();
                if(x == Math.addExact(a,b)){
                    System.out.printf("( %d, %d ) \n", a,b);
                    count++;
                }
            }
        }
        return count;
    }

    //Time Complixity is less
    public static int countPairsMethod2(LinkedList<Integer> head1, LinkedList<Integer> head2, int x) {
        // add your code here
        int count = 0;
        Collections.sort(head1);
        Collections.sort(head2, Collections.reverseOrder());

        Iterator<Integer> itr1 = head1.iterator();
        Iterator<Integer> itr2 = head2.iterator();

        Integer num1 = itr1.hasNext() ? itr1.next(): null;
        Integer num2 = itr2.hasNext() ? itr2.next(): null;

        while (num1 != null && num2 != null){

            if((num1 + num2) == x){
                System.out.printf("( %d, %d)", num1, num2);
                count++;
            }

            if((num1 + num2) > x){
                num2 = itr2.hasNext() ? itr2.next(): null;
            }else {
                num1 = itr1.hasNext() ? itr1.next(): null;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        Integer arr1[] = {3, 1, 5, 7};
        Integer arr2[] = {8, 2, 5, 3};

        // create linked list1 3->1->5->7
        LinkedList<Integer> head1 = new LinkedList<>(Arrays.asList(arr1));

        // create linked list2 8->2->5->3
        LinkedList<Integer> head2 = new LinkedList<>(Arrays.asList(arr2));

        int x = 10;

        System.out.println("Count = " + countPairs(head1, head2, x));
    }


}
