package algo.easy.linkedlist;

/*
* Given a linked list, rearrange it such that the converted list should be of the form
* a < b > c < d > e < f …
* where a, b, c… are consecutive data nodes of the linked list.
*
* Input:  1->2->3->4
  Output: 1->3->2->4
*
* */
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class ZigZag {

    static Node head = null;

    public static void zigZag(Node head) {
        //add code here.
        if (head == null || head.next == null) {
            return;
        }

        Node current = head;
        boolean flag = true;
        while (current.next != null) {

            if (flag) {
                if (current.data > current.next.data) {
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
            } else {
                if (current.data < current.next.data) {
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                }
            }
            current = current.next;
            flag = !flag;
        }
    }

    public static void main(String[] args) {
        /* Start with the empty list */
        // Node head = null;

        // create a list 4 -> 3 -> 7 -> 8 -> 6 -> 2 -> 1
        // answer should be -> 3 7 4 8 2 6 1
        push(4);
        push(3);
        push(7);
        push(8);
        push(6);
        push(2);
        push(1);

        System.out.println("Given linked list ");
        printList(head);

        zigZag(head);

        System.out.println("Zig Zag Linked list ");
        printList(head);
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println("NULL");
    }

    static void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }
}
