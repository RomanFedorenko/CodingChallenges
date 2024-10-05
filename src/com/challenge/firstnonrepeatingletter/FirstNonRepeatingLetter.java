package com.challenge.firstnonrepeatingletter;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Write a function named first_non_repeating_letter† that takes a string input, and returns the first character that is not repeated anywhere in the string.
 * For example, if given the input 'stress', the function should return 't', since the letter t only occurs once in the string, and occurs first in the string.
 * As an added challenge, upper- and lowercase letters are considered the same character, but the function should return the correct case for the initial letter.
 * For example, the input 'sTreSS' should return 'T'.
 * If a string contains all repeating characters, it should return an empty string ("");
 * † Note: the function is called firstNonRepeatingLetter for historical reasons, but your function should handle any Unicode character.
 */

public class FirstNonRepeatingLetter {
    public static String firstNonRepeatingLetter(String s) {
        String lowered = s.toLowerCase();
        int firstUniqueIndex = lowered.toLowerCase().chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(
                        character -> character,
                        Collectors.counting()
                )).entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList()
                .stream()
                .map(lowered::indexOf)
                .min(Comparator.naturalOrder())
                .orElse(-1);

        return firstUniqueIndex == -1 ? "" : String.valueOf(s.charAt(firstUniqueIndex));
    }
}
