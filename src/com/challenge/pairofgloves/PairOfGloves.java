package com.challenge.pairofgloves;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *  Winter is coming, you must prepare your ski holidays. The objective of this kata is to determine the number of pair
 *  of gloves you can constitute from the gloves you have in your drawer.
 * <p>
 * Given an array describing the color of each glove, return the number of pairs you can constitute,
 * assuming that only gloves of the same color can form pairs.
 * <p>
 * Examples:
 * input = ["red", "green", "red", "blue", "blue"]
 * result = 2 (1 red pair + 1 blue pair)
 * <p>
 * input = ["red", "red", "red", "red", "red", "red"]
 * result = 3 (3 red pairs)
 */

public class PairOfGloves {
    public static int numberOfPairs(String[] gloves) {
        return (int) Arrays.stream(gloves)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .mapToLong(amount -> amount / 2)
                .sum();
    }
}
