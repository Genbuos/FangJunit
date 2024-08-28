package strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BackspaceStringCompareTest {
    @Test
    void testCase1(){
        String s = "ab#c";
        String t = "ad#c";
        boolean expected = true;
        BackspaceStringCompareSolution x = new BackspaceStringCompareSolution();
        assertEquals(expected, x.compare(s,t) );
    }

    @Test
    void testCase2(){
        String s = "jb#ordd#aa#n";
        String t = "jordan";
        boolean expected = true;
        BackspaceStringCompareSolution x = new BackspaceStringCompareSolution();
        assertEquals(expected, x.compare(s,t) );
    }
    @Test
    void testCase3(){
        String s = "jb#ordd#aa#n";
        String t = "hello";
        boolean expected = false;
        BackspaceStringCompareSolution x = new BackspaceStringCompareSolution();

    }




}
