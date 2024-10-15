package com.challenge.mexicanwave;

import java.util.stream.IntStream;

/**
 * In this simple Kata your task is to create a function that turns a string into a Mexican Wave.
 * You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up.
 * Rules
 *  1.  The input string will always be lower case but maybe empty. *
 *  2.  If the character in the string is whitespace then pass over it as if it was an empty seat
 * Example
 * wave("hello") => {"Hello", "hEllo", "heLlo", "helLo", "hellO"}
 * */

public class MexicanWave {
    public static String[] wave(String str) {
        return IntStream.range(0, str.length())
                .filter(index -> !Character.isWhitespace(str.charAt(index)))
                .mapToObj(index -> str.substring(0, index) + Character.toUpperCase(str.charAt(index)) + str.substring(index + 1))
                .toArray(String[]::new);

    }
}
