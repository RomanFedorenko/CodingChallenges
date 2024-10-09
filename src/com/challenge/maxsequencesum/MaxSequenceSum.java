package com.challenge.maxsequencesum;

import java.util.Arrays;

/**
 * The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:
 * <p>
 * Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
 * // should be 6: {4, -1, 2, 1}
 * Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array.
 * If the list is made up of only negative numbers, return 0 instead.
 * <p>
 * Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.
 * -20,27,-13,-3,-24,23,-13,-6,-26,-7,12,27,-1,-10,-3,-15,20,14,-18,-12,-2,-17,24,-24,19,14,-20,-1,-3,-9,5,10,-18,0,6,3,-23,27,-21,-27,-29,0,-15,16,-23,0,-6,-22,-21,21,12,-5,21,-1,-8,6,3,22,19 => 90
 */

public class MaxSequenceSum {
    public static int sequence(int[] arr) {
        if (arr.length == 0 || Arrays.stream(arr).noneMatch(i -> i >= 0)) return 0;
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }
}
