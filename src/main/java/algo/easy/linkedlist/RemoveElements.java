package algo.easy.linkedlist;

public class RemoveElements {

    public ListNode removeElements(ListNode head, int elementToExclude) {
        if(head ==null) return head;
        System.out.printf("Remove Elements from ListNode \n");
        ListNode ptr = head;
        while (ptr.next != null){
            if(ptr.next.val == elementToExclude){
                System.out.printf("Remove element %d \n", ptr.next.val);
                ptr.next = ptr.next.next;
            }else{
                ptr = ptr.next;
            }
        }
        if(head.val == elementToExclude){
            System.out.printf("Remove element from head node %d \n", head.val);
            return head.next;
        }

        return head;
    }

    public static void main(String[] args)  {
        //Case 1:  [1,2,6,3,4,5,6] exclude element 6 ---> result: [1,2,3,4,5]
//        ListNode head = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        //Case 1:  [1,6] exclude element 6  ---> result: [1]
//        ListNode head = new ListNode(1, new ListNode(6));

        //Case 3:  [] exclude element 6  ---> result: []
//        ListNode head = null;

        //Case 4:  [6,6] exclude element 6  ---> result: []
        ListNode head = new ListNode(6, new ListNode(6));

        RemoveElements soln = new RemoveElements();
        ListNode resultList = soln.removeElements(head, 6);
        while (resultList !=null ){
            System.out.println(resultList.val);
            resultList = resultList.next;
        }

    }
}
