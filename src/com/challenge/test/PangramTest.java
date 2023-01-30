package com.challenge.test;

import com.challenge.detectpangram.PangramChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PangramTest {
    @Test
    public void pangram() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        assertTrue(PangramChecker.check(pangram1));
    }
    @Test
    public void notPangram() {
        String pangram2 = "You shall not pass!";
        assertFalse(PangramChecker.check(pangram2));
    }
}
