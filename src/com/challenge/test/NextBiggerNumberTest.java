package com.challenge.test;

import com.challenge.nextbiggernumber.NextBiggerNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextBiggerNumberTest {
    @Test
    public void basicTests() {
        assertEquals(737790307L, NextBiggerNumber.nextBiggerNumber(737790073L));
        assertEquals(21, NextBiggerNumber.nextBiggerNumber(12));
        assertEquals(531, NextBiggerNumber.nextBiggerNumber(513));
        assertEquals(2071, NextBiggerNumber.nextBiggerNumber(2017));
        assertEquals(441, NextBiggerNumber.nextBiggerNumber(414));
        assertEquals(414, NextBiggerNumber.nextBiggerNumber(144));
        assertEquals(19009, NextBiggerNumber.nextBiggerNumber(10990));
        assertEquals(59884848483559L, NextBiggerNumber.nextBiggerNumber(59884848459853L));
        assertEquals(819972356L, NextBiggerNumber.nextBiggerNumber(819967532L));
        assertEquals(2106660510L, NextBiggerNumber.nextBiggerNumber(2106660501L));
    }
}
