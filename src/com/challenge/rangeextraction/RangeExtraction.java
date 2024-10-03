package com.challenge.rangeextraction;

import java.util.HashSet;
import java.util.Set;

/**
 * A format for expressing an ordered list of integers is to use a comma separated list of either individual integers
 * or a range of integers denoted by the starting integer separated from the end integer in the range by a dash, '-'.
 * The range includes all integers in the interval including both endpoints. It is not considered a range unless it spans at least 3 numbers. For example "12,13,15-17"
 * Complete the solution so that it takes a list of integers in increasing order and returns a correctly formatted string in the range format.
 * <p>
 * Example:
 * <p>
 * Solution.rangeExtraction(new int[] {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20})
 * # returns "-10--8,-6,-3-1,3-5,7-11,14,15,17-20"
 */

public class RangeExtraction {
    public static String rangeExtraction(int[] arr) {
        if (arr.length == 0) return "";
        StringBuilder sb = new StringBuilder();
        Set<Integer> nonRanges = new HashSet<>();

        nonRanges.add(arr[0]); //first number always presents
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] != arr[i] + 1) {
                nonRanges.add(arr[i]);
                nonRanges.add(arr[i + 1]);
            }
        }
        nonRanges.add(arr[arr.length - 1]); //last number always presents

        for (int i = 0; i < arr.length - 1; i++) {
            if (nonRanges.contains(arr[i])) {
                sb.append(arr[i]);
            }
            char lastChar = sb.charAt(sb.length() - 1);
            if (lastChar == '-') continue;
            sb.append(nonRanges.contains(arr[i + 1]) ? "," : "-");
        }
        sb.append(arr[arr.length - 1]); //last number always presents in the end
        return sb.toString();
    }
}
