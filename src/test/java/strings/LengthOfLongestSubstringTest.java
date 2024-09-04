package strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LengthOfLongestSubstringTest {
    @Test
    void testCase1(){
        LengthOfLongestSubstringSolution x = new LengthOfLongestSubstringSolution();
        String str = "abcabcbb";
        int expected = 3;
        assertEquals(expected, x.solution(str) );
    }
    @Test
    void testCase2(){
        LengthOfLongestSubstringSolution x = new LengthOfLongestSubstringSolution();

        String str ="bbbbb";
        int expected = 1;
        assertEquals(expected, x.solution(str) );

    }
    @Test
    void testCase3(){
        LengthOfLongestSubstringSolution x = new LengthOfLongestSubstringSolution();

        String str = "pwwkew";
        int expected = 3;
        assertEquals(expected, x.solution(str) );


    }
}
