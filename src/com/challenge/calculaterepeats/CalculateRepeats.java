package com.challenge.calculaterepeats;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CalculateRepeats {

    public static Map<Integer, Integer> calculateRepeats(List<Integer> input) {
        if (input == null || input.isEmpty()) {
            return Collections.emptyMap();
        }

        return input.stream().collect(Collectors.groupingBy(value -> value, Collectors.summingInt(acc -> 1)));
    }

}
