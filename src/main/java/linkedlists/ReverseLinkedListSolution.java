package linkedlists;

import java.util.List;

public class ReverseLinkedListSolution {
    public static class ListNode extends ReverseLinkedListIISolution.ListNode {
        int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return val +
                    "," + next;
        }
    }

    public ListNode reverse(ListNode head){
        ListNode current = head;
        ListNode tail = null;
        while(current != null){
            var next = current.next;
            current.next = tail;
            tail = current;
            current = next;
        }
        return tail;
    }


}
