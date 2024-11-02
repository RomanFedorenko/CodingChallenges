package com.challenge.tosmallest;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ToSmallest {
    public static long[] smallest(long n) {
        n = 199819884756l;
        System.out.println("input n="+n);
        List<Integer> digits = String.valueOf(n)
                .chars()
                .mapToObj(ch -> ch - '0')
                .collect(Collectors.toList());

        for (int i = 0; i < digits.size(); i++) {
            Integer currentDigit = digits.get(i);
            OptionalInt min = IntStream.range(i + 1, digits.size())
                    .filter(index -> digits.get(index) < currentDigit)
                    .map(digits::get)
                    .min();

            if (min.isPresent()) {
                int indexToMove = min.getAsInt() == 0 ? digits.lastIndexOf(min.getAsInt()) :digits.indexOf(min.getAsInt());
                Integer toMove = min.getAsInt();
                digits.remove(indexToMove);
                digits.add(i, toMove);

                long number = digits.stream()
                        .mapToLong(digit -> digit)
                        .reduce(0, (a, b) -> a * 10 + b);
                if (Math.abs(indexToMove-i)==1){
                    return new long[]{number, i, indexToMove};
                }
                return new long[]{number, indexToMove, i};
            }
        }

        return new long[0];
    }
}
