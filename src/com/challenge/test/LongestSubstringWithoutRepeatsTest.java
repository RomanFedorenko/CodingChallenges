package com.challenge.test;

import com.challenge.leetcode.LongestSubstringWithoutRepeats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatsTest {

    @Test
    void testBasicExample() {
        assertEquals(3, LongestSubstringWithoutRepeats.lengthOfLongestSubstring("abcabcbb"),
                "Expected longest substring length for 'abcabcbb' is 3");
    }

    @Test
    void testAllUniqueCharacters() {
        assertEquals(6, LongestSubstringWithoutRepeats.lengthOfLongestSubstring("abcdef"),
                "Expected longest substring length for 'abcdef' is 6");
    }

    @Test
    void testAllSameCharacters() {
        assertEquals(1, LongestSubstringWithoutRepeats.lengthOfLongestSubstring("aaaaaa"),
                "Expected longest substring length for 'aaaaaa' is 1");
    }

    @Test
    void testSingleCharacterString() {
        assertEquals(1, LongestSubstringWithoutRepeats.lengthOfLongestSubstring("a"),
                "Expected longest substring length for single character 'a' is 1");
    }

    @Test
    void testEmptyString() {
        assertEquals(0, LongestSubstringWithoutRepeats.lengthOfLongestSubstring(""),
                "Expected longest substring length for empty string is 0");
    }

    @Test
    void testStringWithSpaces() {
        assertEquals(3, LongestSubstringWithoutRepeats.lengthOfLongestSubstring("a b c d e"),
                "Expected longest substring length for 'a b c d e' is 3");
    }

    @Test
    void testStringWithSpecialCharacters() {
        assertEquals(8, LongestSubstringWithoutRepeats.lengthOfLongestSubstring("a@b#c$d%"),
                "Expected longest substring length for 'a@b#c$d%' is 8");
    }

    @Test
    void testStringWithNumbersAndLetters() {
        assertEquals(6, LongestSubstringWithoutRepeats.lengthOfLongestSubstring("a1b2c3"),
                "Expected longest substring length for 'a1b2c3' is 6");
    }

    @Test
    void testLongStringWithRepeats() {
        assertEquals(5, LongestSubstringWithoutRepeats.lengthOfLongestSubstring("abcdeabcdeabc"),
                "Expected longest substring length for 'abcdeabcdeabc' is 5");
    }

    @Test
    void testSubstringAtEnd() {
        assertEquals(5, LongestSubstringWithoutRepeats.lengthOfLongestSubstring("aabbccdefg"),
                "Expected longest substring length for 'aabbccdefg' is 5");
    }
}
