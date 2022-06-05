package com.challenge.test;

import com.challenge.calculaterepeats.CalculateRepeats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class CalculateRepeatsTest {
    @Test
    public void sixElementsTest() {
        List<Integer> input = Stream.of(1, 1, 2, 2, 3, 4, 5, 6).toList();
        Map<Integer, Integer> expected = Map.of(1, 2, 2, 2, 3, 1, 4, 1, 5, 1, 6, 1);

        Map<Integer, Integer> actual = CalculateRepeats.calculateRepeats(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void singleElementTest() {
        List<Integer> input = Stream.of(0).toList();
        Map<Integer, Integer> expected = Map.of(0, 1);

        Map<Integer, Integer> actual = CalculateRepeats.calculateRepeats(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void emptyListTest() {
        List<Integer> input = Collections.emptyList();
        Map<Integer, Integer> expected = Collections.emptyMap();

        Map<Integer, Integer> actual = CalculateRepeats.calculateRepeats(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nullListTest() {
        List<Integer> input = null;
        Map<Integer, Integer> expected = Collections.emptyMap();

        Map<Integer, Integer> actual = CalculateRepeats.calculateRepeats(input);
        Assertions.assertEquals(expected, actual);
    }
}
