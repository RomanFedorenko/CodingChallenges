package com.challenge.supermarketqueue;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SupermarketQueue {
    public static int solveSuperMarketQueue(int[] customers, int n) {
        if (customers.length == 0) return 0;
        if (n >= customers.length) return Arrays.stream(customers).max().getAsInt();

        Queue<Integer> queue = Arrays.stream(customers)
                .boxed()
                .collect(Collectors.toCollection(ArrayDeque::new));

        List<Integer> tills = IntStream.range(0, n)
                .mapToObj(i -> 0)
                .collect(Collectors.toList());

        int totalTime = 0;

        for (int i = 0; i < n; i++) {
            if (queue.isEmpty()) break;
            tills.set(i, queue.poll());
        }

        while (tills.stream().anyMatch(till -> till > 0)) {
            Integer currentFastest = tills.stream().filter(till -> till > 0).min(Comparator.naturalOrder()).get();
            for (int i = 0; i < tills.size(); i++) {
                if (tills.get(i) > 0) tills.set(i, tills.get(i) - currentFastest);
                if (tills.get(i) == 0 && !queue.isEmpty())  tills.set(i,queue.poll());
            }
            totalTime += currentFastest;
        }

        return totalTime;
    }
}
