package linkedlists;

public class ReverseLinkedListIISolution {
    public static class ListNode {
        int val;
        public ListNode next;
        public ListNode() {}
        public ListNode(int val) { this.val = val; }
        ListNode(int val, ReverseLinkedListSolution.ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return val +
                    "," + next;
        }
    }

    public ListNode reverseBetween(ListNode head, int left, int right){
        int currentPOS = 1;
        ListNode currentNode = head;
        ListNode start = head;

        while(currentPOS < left){
            start = currentNode;
            currentNode = currentNode.next;
            currentPOS++;
        }
        ListNode newList = null;
        ListNode tail = currentNode;
        while (currentPOS >= left && currentPOS <= right){
            var next = currentNode.next;
            currentNode.next = newList;
            newList = currentNode;
            currentNode = next;
            currentPOS++;
        }
        start.next = newList;
        tail.next = currentNode;
        if(left> 1) return head;
        return newList;
    }
}
