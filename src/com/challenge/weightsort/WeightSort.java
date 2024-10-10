package com.challenge.weightsort;

import java.util.Arrays;

/**
 * The weight of a number will be from now on the sum of its digits.
 * For example 99 will have "weight" 18, 100 will have "weight" 1 so in the list 100 will come before 99.
 * Given a string with the weights of FFC members in normal order can you give this string ordered by "weights" of these numbers?
 *
 * Example:
 * "56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes:
 * "100 180 90 56 65 74 68 86 99"
 *
 * When two numbers have the same "weight", let us class them as if they were strings (alphabetical ordering) and not numbers:
 * 180 is before 90 since, having the same "weight" (9), it comes before as a string.
 * All numbers in the list are positive numbers and the list can be empty.
 * Notes:
 * it may happen that the input string have leading, trailing whitespaces and more than a unique whitespace between two consecutive numbers
 */

public class WeightSort {
    public static String orderWeight(String strng) {
        String[] strings = strng.strip().split("\\s+");
        Arrays.sort(strings, (o1, o2) -> {
            int sum1 = sumOfDigits(o1);
            int sum2 = sumOfDigits(o2);
            if (sum1 != sum2) return sum1 - sum2;
            return o1.compareTo(o2);
        });
        return String.join(" ", strings);
    }

    private static int sumOfDigits(String str) {
        return str.chars().map(Character::getNumericValue).sum();
    }


}
