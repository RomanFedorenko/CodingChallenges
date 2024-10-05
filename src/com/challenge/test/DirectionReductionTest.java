package com.challenge.test;

import com.challenge.directionreduction.DirectionReduction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class DirectionReductionTest {
    @Test
    public void testSimpleDirReduc() {
        assertArrayEquals(
                new String[]{"WEST"},
                DirectionReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
        assertArrayEquals(
                new String[]{},
                DirectionReduction.dirReduc(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"}));
    }
}
