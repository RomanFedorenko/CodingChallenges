package com.challenge.test;

import com.challenge.splitstrings.SplitStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SplitStringsTest {
    @Test
    public void testEvenString() {
        String s = "abcdef";
        String s1 = "HelloWorld";
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, SplitStrings.solution(s), "Should handle even string");
        assertArrayEquals(new String[]{"He", "ll", "oW", "or", "ld"}, SplitStrings.solution(s1), "Should handle even string");
    }

    @Test
    public void testOddString() {
        String s = "abcde";
        String s1 = "LovePizza";
        assertArrayEquals(new String[]{"ab", "cd", "e_"}, SplitStrings.solution(s), "Should handle odd string");
        assertArrayEquals(new String[]{"Lo", "ve", "Pi", "zz", "a_"}, SplitStrings.solution(s1), "Should handle odd string");
    }
}
