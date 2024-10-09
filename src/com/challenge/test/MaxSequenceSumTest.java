package com.challenge.test;

import com.challenge.maxsequencesum.MaxSequenceSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxSequenceSumTest
{
    @Test
    public void testEmptyArray() throws Exception {
        assertEquals(0, MaxSequenceSum.sequence(new int[]{}), "Empty arrays should have a max of 0");
    }

    @Test
    public void testExampleArray() throws Exception {
        assertEquals(6, MaxSequenceSum.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}), "Example array should have a max of 6");
    }
    @Test
    public void testLargeArray() throws Exception {
        assertEquals(90, MaxSequenceSum.sequence(new int[]{-20,27,-13,-3,-24,23,-13,-6,-26,-7,12,27,-1,-10,-3,-15,20,14,-18,-12,-2,-17,24,-24,19,14,-20,-1,-3,-9,5,10,-18,0,6,3,-23,27,-21,-27,-29,0,-15,16,-23,0,-6,-22,-21,21,12,-5,21,-1,-8,6,3,22,19}), "Example array should have a max of 6");
    }
}
