package strings;

import arrays.TrappingRainwaterSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidPalindromeTest {
    @Test
    void testCase1(){
        String str = "A man, a plan, a canal: Panama";
        ValidPalindromeSolution solve = new ValidPalindromeSolution();
        boolean expected = true;
        assertEquals(expected, solve.vps(str));
    }
    @Test
    void testCase2(){
        String str = "race a car";
        ValidPalindromeSolution solve = new ValidPalindromeSolution();
        boolean expected = false;
        assertEquals(expected, solve.vps(str));
    }
    @Test
    void testCase3(){
        String str = " ";
        ValidPalindromeSolution solve = new ValidPalindromeSolution();
        boolean expected = true;
        assertEquals(expected, solve.vps(str));
    }

    @Test
    void testCase4(){
        String str = "aba";
        ValidPalindromeIISolution solve = new ValidPalindromeIISolution();
        boolean expected = true;
        assertEquals(expected, solve.vps(str));
    }

    @Test
    void testCase5(){
        String str = "abca";
        ValidPalindromeIISolution solve = new ValidPalindromeIISolution();
        boolean expected = true;
        assertEquals(expected, solve.vps(str));
    }

    @Test
    void testCase6 (){
        String str = "abc";
        ValidPalindromeIISolution solve = new ValidPalindromeIISolution();
        boolean expected = false;
        assertEquals(expected, solve.vps(str));
    }

}
