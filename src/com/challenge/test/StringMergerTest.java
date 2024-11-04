package com.challenge.test;

import com.challenge.StringMerger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringMergerTest {
    @Test
    public void normalHappyFlow() {
        assertTrue(StringMerger.isMerge("Can we merge it? Yes, we can!", "Cn ergtYes we", "awe me i? , can!"), "'Can we merge it? Yes, we can!' can be created from 'awe me i? , can!'");
        assertTrue(StringMerger.isMerge("codewars", "code", "wars"), "codewars can be created from code and wars");
        assertTrue(StringMerger.isMerge("codewars", "cdwr", "oeas"), "codewars can be created from cdwr and oeas");
        assertFalse(StringMerger.isMerge("codewars", "cod", "wars"), "Codewars are not codwars");
    }
}
