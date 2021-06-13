package algo.easy.linkedlist;

public class ListNode implements Cloneable {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
