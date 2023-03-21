package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringSplitTest {

    @Test
    void solutionTest() {
        String s1 = "HelloWorld";
        String[] s1sol= {"He", "ll", "oW", "or", "ld"};
        var StringSplit = new StringSplit();
        assertEquals(s1sol,StringSplit.solution(s1));
    }

    @Test
    void solutionTestPrime() {
        String s2 = "HelloWorldy";
        String[] s1sol= {"He", "ll", "oW", "or", "ld", "y_"};
        var StringSplit = new StringSplit();
        assertEquals(s1sol,StringSplit.solution(s2));
    }




}