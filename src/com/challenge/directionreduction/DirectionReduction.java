package com.challenge.directionreduction;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

/**
 * Write a function dirReduc which will take an array of strings and returns an array of strings with the needless directions removed (W<->E or S<->N side by side).
 * <p>
 * In ["NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"], "NORTH" and "SOUTH" are not directly opposite but they become
 * directly opposite after the reduction of "EAST" and "WEST" so the whole path is reducible to ["WEST", "WEST"].
 */
public class DirectionReduction {
    public static String[] dirReduc(String[] arr) {
        Map<String, String> opposites = Map.of(
                "NORTH", "SOUTH",
                "SOUTH", "NORTH",
                "EAST", "WEST",
                "WEST", "EAST"
        );
        Deque<String> deque = new ArrayDeque<>();
        for (String dir : arr) {
            if (opposites.get(dir).equals(deque.peekLast())) {
                deque.removeLast();
            } else {
                deque.add(dir);
            }
        }
        return deque.toArray(String[]::new);
    }
}
