package linkedLists;

import java.util.LinkedList;

import linkedlists.LoopDetectionSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class LoopDetectionTest {

    @Test
    void testCase1(){
        LoopDetectionSolution.ListNode head = new LoopDetectionSolution.ListNode(3);
        head.next = new LoopDetectionSolution.ListNode(2);
        head.next.next = new LoopDetectionSolution.ListNode(0);
        head.next.next.next = new LoopDetectionSolution.ListNode(-4);
        //in order to create a cycle a node has to be pointing to a previous node in the list
        head.next.next.next.next = head;

        boolean expected = true;
        LoopDetectionSolution x = new LoopDetectionSolution();
        assertEquals(expected, x.hasCycle(head));

    }

    @Test
    void testCase2(){
        LoopDetectionSolution.ListNode head = new LoopDetectionSolution.ListNode(1);
        head.next = new LoopDetectionSolution.ListNode(2);

        head.next.next = head;

        boolean expected = true;
        LoopDetectionSolution x = new LoopDetectionSolution();
        assertEquals(expected, x.hasCycle(head));
    }
        @Test
    void testCase3(){
        LoopDetectionSolution.ListNode head = new LoopDetectionSolution.ListNode(1);


        boolean expected = false;
        LoopDetectionSolution x = new LoopDetectionSolution();
        assertEquals(expected, x.hasCycle(head));
    }




}
