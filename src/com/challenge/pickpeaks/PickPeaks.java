package com.challenge.pickpeaks;

import java.util.*;

public class PickPeaks {
    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        System.out.println(Arrays.toString(arr));
        Map<String, List<Integer>> result = new HashMap<>();
        result.put("peaks", new ArrayList<>());
        result.put("pos", new ArrayList<>());
        int platoPeakValue = Integer.MIN_VALUE;
        int platoPeakIndex = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i + 1] < arr[i]) {
                result.get("peaks").add(arr[i]);
                result.get("pos").add(i);
            } else if (arr[i - 1] < arr[i] && arr[i + 1] == arr[i]) {
                platoPeakValue = arr[i];
                platoPeakIndex = i;
            }
            if (arr[i] == platoPeakValue && arr[i + 1] < platoPeakValue) {
                result.get("peaks").add(platoPeakValue);
                result.get("pos").add(platoPeakIndex);
                platoPeakValue = Integer.MIN_VALUE;
            }
        }

        return result;
    }

}
