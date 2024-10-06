package com.challenge.nextbiggernumber;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create a function that takes a positive integer and returns the next bigger number that can be formed by rearranging its digits. For example:
 * <p>
 * 12 ==> 21
 * 513 ==> 531
 * 2017 ==> 2071
 * If the digits can't be rearranged to form a bigger number, return -1
 * <p>
 * 9 ==> -1
 * 111 ==> -1
 * 531 ==> -1
 * 210 666 0501 ==> 210 666 0510
 * 5988 4848 45 9853 ==> 5988 4848 48 3559
 * 819 967 532 ==> 819 972 356
 */

public class NextBiggerNumber {
    public static long nextBiggerNumber(long n) {
        String str = String.valueOf(n);
        if (str.length() == 1) return -1;
        List<Integer> ints = str.chars().map(Character::getNumericValue)
                .boxed()
                .collect(Collectors.toList());
        int swapIndex = -1;

        for (int i = 1; i < ints.size(); i++) {
            if (ints.get(i) > ints.get(i - 1)) {
                swapIndex = i - 1;
            }
        }

        if (swapIndex == -1) return -1;
        Collections.swap(ints, swapIndex, ++swapIndex);
        if (ints.get(ints.size() - 1) == 0) Collections.swap(ints, ints.size() - 1, ints.size() - 2);
        String result = ints.stream().map(String::valueOf).collect(Collectors.joining());
        return Long.parseLong(result);
    }
}
