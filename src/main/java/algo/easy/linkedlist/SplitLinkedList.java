package algo.easy.linkedlist;

import javax.sound.midi.Soundbank;

/*Given a linked list and two integers p and q, the task is to divide the linked list in the ratio p:q i.e.
 the first list contains first p nodes from the original list and the second list contains the rest of the q nodes.
  If the original list cannot be split in the given ratio then print -1.
Examples:
Input: 1 -> 3 -> 5 -> 6 -> 7 -> 2 -> NULL
p = 2, q = 4
Output:
1 3
5 6 7 2
Input: 1 -> 2 -> 4 -> 9 -> NULL
p = 3, q = 2
Output: -1
*/
public class SplitLinkedList {

    static void splitAndPrint(ListNode head,int p,int q){

        //find the length of the list
        int n=0;
        ListNode temp = head;

        if(temp == null || temp.next == null) {return;}

        while (temp != null){
            temp = temp.next;
            n++;
        }

        if(p+q > n){
            System.out.println("-1");
            return;
        }

        temp = head;
        while (p>1){
            p--;
            temp = temp.next;
        }

        ListNode head2 = temp.next;
        temp.next = null;

        System.out.println("After Split");
        System.out.println("First List: ");

        ListNode curr = head;
        while (curr != null){
            System.out.printf("%d -->", curr.val );
            curr=curr.next;
        }
        System.out.print("null \n");
        System.out.println("Second List");
        curr = head2;
        while (curr!=null){
            System.out.printf("%d -->", curr.val );
            curr=curr.next;
        }
        System.out.print("NULL \n");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(2, null)) ))));

        splitAndPrint(head, 2,4);

    }


}
