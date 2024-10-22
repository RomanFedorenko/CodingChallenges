package com.challenge.sorttheodd;

import java.util.Arrays;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        int[] sortedOdds = Arrays.stream(array)
                .filter(e -> e % 2 != 0)
                .sorted()
                .toArray();

        int oddIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) array[i] = sortedOdds[oddIndex++];
        }
        return array;
    }
}
