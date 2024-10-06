package com.challenge.nextbiggernumber;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create a function that takes a positive integer and returns the next bigger number that can be formed by rearranging its digits. For example:
 * <p>
 * 12 ==> 21
 * 513 ==> 531
 * 2017 ==> 2071
 * 210 666 0501 ==> 210 666 0510
 * 598 848 484 598 53 ==> 598 848 484 835 59
 * 819 967 532 ==> 819 972 356
 * 737 790 073 ==> 737 790 307
 * If the digits can't be rearranged to form a bigger number, return -1
 * <p>
 * 9 ==> -1
 * 111 ==> -1
 * 531 ==> -1
 */

public class NextBiggerNumber {
    public static long nextBiggerNumber(long n) {
        List<Integer> digits = String.valueOf(n).chars()
                .map(Character::getNumericValue)
                .boxed()
                .collect(Collectors.toList());

        int firstSwapIndex = -1;
        for (int i = 1; i < digits.size(); i++) {
            if (digits.get(i) > digits.get(i - 1)) {
                firstSwapIndex = i - 1;
            }
        }
        if (firstSwapIndex == -1) return -1;

        int firstSwapElement = digits.get(firstSwapIndex);
        Integer secondSwapElement = null;
        Integer secondSwapIndex = -1;
        for (int i = firstSwapIndex + 1; i < digits.size(); i++) {
            if (digits.get(i) > firstSwapElement) {
                if (secondSwapElement == null || digits.get(i) < secondSwapElement) {
                    secondSwapElement = digits.get(i);
                    secondSwapIndex = i;
                }

            }
        }

        Collections.swap(digits, firstSwapIndex, secondSwapIndex);
        if (secondSwapIndex < digits.size()) {
            digits.subList(firstSwapIndex + 1, digits.size()).sort(Comparator.naturalOrder());
        }

        return Long.parseLong(digits.stream().map(String::valueOf).collect(Collectors.joining()));
    }
}
