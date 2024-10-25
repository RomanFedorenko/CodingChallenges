package com.challenge.twosum;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[] { map.get(target - numbers[i]), i };
            }
            map.put(numbers[i], i);
        }
        return new int[0];
    }
}
