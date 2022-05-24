package com.challenge.josephus;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * description is here -> https://en.wikipedia.org/wiki/Josephus_problem
 **/

public class Josephus {

    public static int getSurvivor(int circleSize, int killEvery) {
        Deque<Integer> circle = IntStream.range(1, circleSize + 1)
                .boxed()
                .collect(Collectors.toCollection(ArrayDeque::new));

        while (circle.size() != 1) {
            for (int i = 1; i <= killEvery; i++) {
                Integer head = circle.poll();
                if (i != killEvery) {
                    circle.add(head); //adding to the end to keep in the circle
                }
            }
        }
        return circle.getFirst();
    }

}
