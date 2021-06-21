package algo.easy.linkedlist;

public class FindMiddleNode {
    public ListNode middleNode(ListNode head) {
        if(head == null) return head;
        //Using temp Array
        /*ListNode[] A = new ListNode[100];
        int t=0;
        while (head!=null){
            A[t] = head;
            head = head.next;
            t++;
        }
        return A[t/2];*/

        //Using slow and fast Pointers
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public static void main(String[] args)  {
        //Case 1:  [1,2,6,3,4,5,6]
//        ListNode head = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        //Case 1:  [1,6,5,4]
        ListNode head = new ListNode(1, new ListNode(6, new ListNode(5, new ListNode(4))));

        //Case 3:  [] exclude element 6  ---> result: []
//        ListNode head = null;

        //Case 4:  [6,6]
//        ListNode head = new ListNode(6, new ListNode(6));

        FindMiddleNode soln = new FindMiddleNode();
        ListNode resultList = soln.middleNode(head);
        while (resultList !=null ){
            System.out.println(resultList.val);
            resultList = resultList.next;
        }

    }
}
