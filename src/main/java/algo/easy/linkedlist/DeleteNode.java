package algo.easy.linkedlist;
/*
* Write a function to delete a node in a singly-linked list. You will not be given access to the head of the list, instead you will be given access to the node to be deleted directly.

It is guaranteed that the node to be deleted is not a tail node in the list.
*
* The number of the nodes in the given list is in the range [2, 1000].
-1000 <= Node.val <= 1000
The value of each node in the list is unique.
The node to be deleted is in the list and is not a tail node
* */
public class DeleteNode {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }



    public static void main(String[] args)  {
        //Case 1:  [1,6,5,4] exclude Node with Element 6  ---> result: [1,5,4]
//        ListNode head = new ListNode(1, new ListNode(6, new ListNode(5, new ListNode(4))));
        //Case 1:  [6,1] exclude Node with Element 6  ---> result: [1]
        ListNode head = new ListNode(6, new ListNode(1));

        DeleteNode soln = new DeleteNode();


        while (head != null){
            if(head.val == 6) {
                soln.deleteNode(head);
            }
            System.out.println(head.val);
            head=head.next;
        }

    }
}
