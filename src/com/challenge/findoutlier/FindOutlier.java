package com.challenge.findoutlier;

public class FindOutlier {
    public static int find(int[] integers) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        boolean searchForEven = oddCount > evenCount;

        for (int num : integers) {
            if (searchForEven && num % 2 == 0) {
                return num;
            }
            if (!searchForEven && num % 2 != 0) {
                return num;
            }
        }


        return 0;
    }
}
