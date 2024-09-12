package LinkedLists;

import linkedlists.ReverseLinkedListSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ReverseLinkedListTest {

    @Test
    void testCase1(){
        ReverseLinkedListSolution.ListNode head = new ReverseLinkedListSolution.ListNode(1);
        head.next = new ReverseLinkedListSolution.ListNode(2);
        head.next.next = new ReverseLinkedListSolution.ListNode(3);
        head.next.next.next = new ReverseLinkedListSolution.ListNode(4);
        head.next.next.next.next = new ReverseLinkedListSolution.ListNode(5);

        String expected = "5,4,3,2,1,null";
        ReverseLinkedListSolution solve = new ReverseLinkedListSolution();
        assertEquals(expected, solve.reverse(head).toString());
    }

    @Test
    void testCase2(){
        ReverseLinkedListSolution.ListNode head = new ReverseLinkedListSolution.ListNode(1);
        head.next = new ReverseLinkedListSolution.ListNode(2);


       String expected = "2,1,null";


        ReverseLinkedListSolution solve = new ReverseLinkedListSolution();
        assertEquals(expected, solve.reverse(head).toString());
    }

    @Test
    void testCase3(){
        ReverseLinkedListSolution.ListNode head = new ReverseLinkedListSolution.ListNode();


        String expected = "0,null";

        ReverseLinkedListSolution solve = new ReverseLinkedListSolution();
        assertEquals(expected, solve.reverse(head).toString());
    }
}
