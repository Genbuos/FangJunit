import org.junit.jupiter.api.Test;
import arrays.Solution;
import static org.junit.jupiter.api.Assertions.*;

public class TwoSumSolution {
    @Test
    void testCase1(){
        int[] nums = {2,7,11,15};
        int target = 9;
        Solution s = new Solution();
       int[] expected = {0,1};
        assertArrayEquals(expected, s.twoSum(nums, target) );
    }
    @Test
    void testCase2(){
        int[] nums = {3,2,4};
        int target = 6;
        Solution s = new Solution();
        int[] expected = {1,2};
        assertArrayEquals(expected, s.twoSum(nums, target) );

    }
    @Test
    void testCase3(){
        int[] nums = {3,5,4};
        int target = 7;
        Solution s = new Solution();
        int[] expected = {0,2};
        assertArrayEquals(expected, s.twoSum(nums, target) );
    }
}
