package com.challenge.tosmallest;

/**
 * see description at -> https://www.codewars.com/kata/573992c724fc289553000e95
 * */

public class ToSmallest {
    public static long[] smallest(long n) {
        String nStr = Long.toString(n);
        long smallestNumber = n;
        int bestI = 0, bestJ = 0;

        for (int i = 0; i < nStr.length(); i++) {
            for (int j = 0; j < nStr.length(); j++) {
                if (i == j) continue;

                String newNumberStr = nStr.substring(0, i) + nStr.substring(i + 1);
                newNumberStr = newNumberStr.substring(0, j) + nStr.charAt(i) + newNumberStr.substring(j);

                long newNumber = Long.parseLong(newNumberStr);

                if (newNumber < smallestNumber ||
                        (newNumber == smallestNumber && i < bestI) ||
                        (newNumber == smallestNumber && i == bestI && j < bestJ)) {
                    smallestNumber = newNumber;
                    bestI = i;
                    bestJ = j;
                }
            }
        }

        return new long[]{smallestNumber, bestI, bestJ};
    }
}
