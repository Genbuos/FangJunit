package linkedLists;

import linkedlists.ReverseLinkedListIISolution;
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
// TODO - maybe another test case for reverse between
    @Test
    void testCase4(){
        ReverseLinkedListIISolution.ListNode head = new ReverseLinkedListIISolution.ListNode(1);
        head.next = new ReverseLinkedListIISolution.ListNode(2);
        head.next.next = new ReverseLinkedListIISolution.ListNode(3);
        head.next.next.next = new ReverseLinkedListIISolution.ListNode(4);
        head.next.next.next.next = new ReverseLinkedListIISolution.ListNode(5);

        String expected = "1,4,3,2,5,null";

        ReverseLinkedListIISolution solution = new ReverseLinkedListIISolution();
        assertEquals(expected, solution.reverseBetween(head, 2, 4).toString());

    }
}
