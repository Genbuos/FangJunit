package linkedlists;


public class LoopDetectionSolution {

  public  static class ListNode {
        int val;
        public ListNode next;

        public ListNode(int x){
            val = x;
            next = null;

        }
  }

  public boolean hasCycle(ListNode head){
      ListNode slow = head;
      ListNode fast = head;

      while( fast != null && fast.next != null){
          slow = slow.next;
          fast = fast.next.next;
          if(slow == fast ){
              return true;
          }
      }
      return false;
  }


}
