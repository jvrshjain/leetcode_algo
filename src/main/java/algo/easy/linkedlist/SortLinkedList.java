package algo.easy.linkedlist;

public class SortLinkedList {
    private ListNode sorted = null;
    public static void main(String[] args) {
        ListNode input = new ListNode(8, new ListNode(3, new ListNode(7, new ListNode(4))));
        SortLinkedList sortLinkedList = new SortLinkedList();
//        sortLinkedList.bubbleSort(input);
        sortLinkedList.insertionSort(input);
    }

    private void bubbleSort(ListNode head){
        ListNode current = head;
        ListNode index = null;

        if (head == null) { return;}

        while (current != null){
            index = current.next;
            while (index != null){
                if(current.val > index.val){
                    int temp = current.val;
                    current.val = index.val;
                    index.val = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
        display(head);
    }

    public void insertionSort(ListNode head){
        sorted = null;
        if(head == null){
            return;
        }
        ListNode current = head;

        while (current != null){
          ListNode next = current.next;
          addToSortedList(current);
          current = next;
        }
        display(sorted);
    }

    private void addToSortedList(ListNode newNode) {
        if(sorted == null || sorted.val > newNode.val){
            newNode.next = sorted;
            sorted = newNode;
        }else {
            ListNode current = sorted;

            while (current.next != null && current.val < newNode.val){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    private void display(ListNode current) {
        while (current != null){
            System.out.print(current.val + "--->" );
            current = current.next;
        }
        System.out.println("");

    }


}
