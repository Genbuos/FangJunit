import arrays.CWMWSolution;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CWMWSolutionTest {
    @Test
    void testCase1(){
        int[] nums = {1,8,6,2,5,4,8,3,7};
        CWMWSolution x = new CWMWSolution();
        int expected = 49;
        assertEquals(expected, x.mostWater(nums));
    }
    @Test
    void testCase2(){
        int[] nums = {1,1};
        CWMWSolution x = new CWMWSolution();
        int expected = 1;
        assertEquals(expected, x.mostWater(nums));

    }
}
