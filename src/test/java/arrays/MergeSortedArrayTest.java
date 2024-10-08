package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeSortedArrayTest {
    @Test
    void testCase1(){
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 ={2,5,6};
        int n = 3;
        MergeSortedArraySolution x = new MergeSortedArraySolution();
        int[] expected ={1,2,2,3,5,6} ;
        x.merge(nums1,m,nums2,n);
        assertArrayEquals(expected, nums1);
    }
    @Test
    void testCase2(){
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 ={};
        int n = 0;
        MergeSortedArraySolution x = new MergeSortedArraySolution();
        int[] expected ={1} ;
        x.merge(nums1,m,nums2,n);
        assertArrayEquals(expected, nums1);
    }
    @Test
    void testCase3(){
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 ={1};
        int n = 1;
        MergeSortedArraySolution x = new MergeSortedArraySolution();
        int[] expected ={1} ;
        x.merge(nums1,m,nums2,n);
        assertArrayEquals(expected, nums1);
    }
}
