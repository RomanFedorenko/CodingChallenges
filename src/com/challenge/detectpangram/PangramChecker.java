package com.challenge.detectpangram;

/**
 * A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
 * Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
 * */

public class PangramChecker {

    public static boolean check(String sentence) {
        String sentenceLowered = sentence.toLowerCase();
        if (sentence.isBlank()) return false;
        String alphabet = "zqxjkvbpygfwmucldrhsnioate";//sorted by frequency
        for (char ch : alphabet.toCharArray()) {
            if (sentenceLowered.indexOf(ch) == -1) return false;
        }
        return true;
    }
}