package com.challenge.test;

import org.junit.jupiter.api.Test;
import com.challenge.shortestword.ShortestWord;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestWordTest {
    @Test
    void findShort() {
        assertEquals(3, ShortestWord.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, ShortestWord.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, ShortestWord.findShort("Let's travel abroad shall we"));
    }
}
