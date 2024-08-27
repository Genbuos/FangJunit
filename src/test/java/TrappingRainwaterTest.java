import arrays.TrappingRainwaterSolution;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrappingRainwaterTest {
    @Test
    void testCase1(){
        int[] nums = {0,1,0,2,1,0,3,1,0,1,2};
        TrappingRainwaterSolution x = new TrappingRainwaterSolution();
        int expected = 8;
        assertEquals(expected, x.solve(nums));
    }
    @Test
    void testCase2(){
        int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
        TrappingRainwaterSolution x = new TrappingRainwaterSolution();
        int expected = 6;
        assertEquals(expected, x.solve(nums));
    }
    @Test
    void testCase3(){
        int[] nums = {4,2,0,3,2,5};
        TrappingRainwaterSolution x = new TrappingRainwaterSolution();
        int expected = 9;
        assertEquals(expected, x.solve(nums));
    }
}
