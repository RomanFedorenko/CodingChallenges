package com.challenge.piglatin;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word.
 * Leave punctuation marks untouched.
 *
 * Examples
 * pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
 * pigIt('Hello world !');     // elloHay orldway !
 * */

public class PigLatin {

    public static String pigIt(String str) {
        return Arrays.stream(str.split(" "))
                .map(word -> word.chars().allMatch(Character::isLetter)
                        ? word.substring(1) + word.charAt(0) + "ay"
                        : word)
                .collect(Collectors.joining(" "));
    }
}
