package algo.easy.linkedlist;

/*Given the head of a singly linked list, reverse the list, and return the reversed list.

*/
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null, temp = head;

        while(temp != null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode lastOne = new ListNode(1, null);
        ListNode lastTwo = new ListNode(2, lastOne);
        ListNode firstTwo = new ListNode(2, lastTwo);
        ListNode firstOne = new ListNode(1, firstTwo);

        ReverseLinkedList solution = new ReverseLinkedList();
        ListNode rev = solution.reverseList(firstOne);
        while (rev !=null ){
            System.out.println(rev.val);
            rev = rev.next;
        }
    }
}
