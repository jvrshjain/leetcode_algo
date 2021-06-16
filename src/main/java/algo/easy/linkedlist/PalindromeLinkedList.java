package algo.easy.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*
Given the head of a singly linked list, return true if it is a palindrome.
The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9

 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        boolean isPalindrome = false;
        if(head==null) return isPalindrome;
        ListNode curr = head;
        Stack<Integer> integers = new Stack<>();
        while (curr != null){
            integers.push(curr.val);
            curr = curr.next;
        }

        while (head != null){
            if(head.val == integers.pop()){
                isPalindrome = true;
                head = head.next;
            }else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args)  {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));

        PalindromeLinkedList soln = new PalindromeLinkedList();
        System.out.println("");
        System.out.println(soln.isPalindrome(head));

    }

}
