package com.challenge.duplicateencoder;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string,
 * or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.
 * <p>
 * Examples
 * "din"      =>  "((("
 * "recede"   =>  "()()()"
 * "Success"  =>  ")())())"
 * "(( @"     =>  "))(("
 */
public class DuplicateEncoder {
    public static String encode(String word) {
        List<Character> duplicates = word.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        return word.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .map(c -> duplicates.contains(c) ? ")" : "(")
                .collect(Collectors.joining());
    }
}
