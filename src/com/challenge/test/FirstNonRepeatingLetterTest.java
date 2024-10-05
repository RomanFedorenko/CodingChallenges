package com.challenge.test;

import com.challenge.firstnonrepeatingletter.FirstNonRepeatingLetter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstNonRepeatingLetterTest {
    @Test
    @DisplayName("Sample tests")
    void sampleTests() {
        assertEquals("a", FirstNonRepeatingLetter.firstNonRepeatingLetter("a"), "For input \"a\"");
        assertEquals("t", FirstNonRepeatingLetter.firstNonRepeatingLetter("streSS"), "For input \"streSS\"");
        assertEquals("-", FirstNonRepeatingLetter.firstNonRepeatingLetter("moon-men"), "For input \"moon-men\"");
        assertEquals("", FirstNonRepeatingLetter.firstNonRepeatingLetter("moonmoon"), "For input \"moonmoon\"");
    }
}
