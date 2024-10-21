package com.challenge.findunique;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * There is an array with some numbers. All numbers are equal except for one. Try to find it!
 *
 * Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
 * Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
 * It’s guaranteed that array contains at least 3 numbers.
 *
 * The tests contain some very huge arrays, so think about performance.
 */
public class FindUnique {
    public static double findUnique(double arr[]) {
        HashMap<Double, Integer> beginningFreqMap = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            beginningFreqMap.merge(arr[i], 1, Integer::sum);
        }

        Optional<Double> unique = beginningFreqMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
        if (unique.isPresent()) return unique.get();

        double nonUnique = beginningFreqMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst().get();

        for (int i = 3; i < arr.length; i++) {
            if (arr[i] != nonUnique) return arr[i];
        }
        return arr[0];
    }
}
