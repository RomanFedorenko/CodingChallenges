package com.challenge.pickpeaks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * see description at -> https://www.codewars.com/kata/5279f6fe5ab7f447890006a7
 * */

public class PickPeaks {
    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        Map<String, List<Integer>> result = Map.of(
                "peaks", new ArrayList<>(),
                "pos", new ArrayList<>()
        );

        int plateauPeakIndex = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1]) {
                if (arr[i] > arr[i + 1]) {
                    result.get("peaks").add(arr[i]);
                    result.get("pos").add(i);
                    plateauPeakIndex = 0; // reset any plateau peak if confirmed peak
                } else if (arr[i] == arr[i + 1]) {
                    plateauPeakIndex = i; // start plateau
                }
            } else if (arr[i] == arr[i - 1] && plateauPeakIndex != 0 && arr[i] > arr[i + 1]) {
                result.get("peaks").add(arr[plateauPeakIndex]);
                result.get("pos").add(plateauPeakIndex);
                plateauPeakIndex = 0; // reset plateau tracking
            }
        }

        return result;
    }

}
