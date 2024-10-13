package com.challenge.observedpin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Alright, detective, one of our colleagues successfully observed our target person, Robby the robber.
 * We followed him to a secret warehouse, where we assume to find all the stolen stuff. The door to this warehouse
 * is secured by an electronic combination lock. Unfortunately our spy isn't sure about the PIN he saw, when Robby entered it.
 *
 * The keypad has the following layout:
 *
 * ┌───┬───┬───┐
 * │ 1 │ 2 │ 3 │
 * ├───┼───┼───┤
 * │ 4 │ 5 │ 6 │
 * ├───┼───┼───┤
 * │ 7 │ 8 │ 9 │
 * └───┼───┼───┘
 *     │ 0 │
 *     └───┘
 * He noted the PIN 1357, but he also said, it is possible that each of the digits he saw could actually be another adjacent
 * digit (horizontally or vertically, but not diagonally). E.g. instead of the 1 it could also be the 2 or 4.
 * And instead of the 5 it could also be the 2, 4, 6 or 8.
 *
 * He also mentioned, he knows this kind of locks. You can enter an unlimited amount of wrong PINs,
 * they never finally lock the system or sound the alarm. That's why we can try out all possible (*) variations.
 *
 * * possible in sense of: the observed PIN itself and all variations considering the adjacent digits
 *
 * Can you help us to find all those variations? It would be nice to have a function, that returns an array
 * (or a list in Java/Kotlin and C#) of all variations for an observed PIN with a length of 1 to 8 digits. We could name
 * the function getPINs (get_pins in python, GetPINs in C#). But please note that all PINs, the observed one and also
 * the results, must be strings, because of potentially leading '0's. We already prepared some test cases for you.
 *
 * Detective, we are counting on you!
 * */

public class ObservedPin {
    public static HashMap<Character, String[]> adjacentMap = new HashMap<>() {
        {
            put('1', new String[]{"1", "2", "4"});
            put('2', new String[]{"1", "2", "3", "5"});
            put('3', new String[]{"2", "3", "6"});
            put('4', new String[]{"1", "4", "5", "7"});
            put('5', new String[]{"2", "4", "5", "6", "8"});
            put('6', new String[]{"3", "5", "6", "9"});
            put('7', new String[]{"4", "7", "8"});
            put('8', new String[]{"5", "7", "8", "9", "0"});
            put('9', new String[]{"6", "8", "9"});
            put('0', new String[]{"0", "8"});
        }
    };

    public static List<String> getPINs(String observed) {
        HashSet<String> possiblePINs = new HashSet<>();

        char[] charArr = observed.toCharArray();
        List<String> pool = observed.chars()
                .mapToObj(c -> adjacentMap.get((char) c))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();

        for (String number : pool) {
            sb.append(number);
            for (String number : pool)
        }

        String[] possibleValue0 = adjacentMap.get(charArr[0]);
        sb.append(possibleValue0[0]);
        String[] possibleValue1 = adjacentMap.get(charArr[1]);
        sb.append(possibleValue1[0]);
        sb.toString();//add

        sb.setLength(0);

        sb.append(possibleValue1[0]);
        sb.append(possibleValue1[1]);
        sb.toString();//add

        sb.setLength(0);

        sb.append(possibleValue1[0]);
        sb.append(possibleValue1[2]);



        for (char c : charArr) {
            String[] possibleValue = adjacentMap.get(c);

        }
        String[] possibleValue = adjacentMap.get(c);
        sb.append(possibleValue[0]);
    }


}
