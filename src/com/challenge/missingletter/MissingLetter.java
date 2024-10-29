package com.challenge.missingletter;

/**
 * Write a method that takes an array of consecutive (increasing) letters as input
 * and that returns the missing letter in the array.
 *
 * You will always get an valid array. And it will be always exactly one letter be missing.
 * The length of the array will always be at least 2.
 * The array will always contain letters in only one case.
 *
 * Example:
 *
 * ['a','b','c','d','f'] -> 'e'
 * ['O','Q','R','S'] -> 'P'
 * (Use the English alphabet with 26 letters!)
 * */

public class MissingLetter {

    private static final String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static char findMissingLetter(char[] array) {
        for (int index = alphabet.indexOf(array[0]), i = 0; i < array.length; i++, index++) {
            if (alphabet.charAt(index) != array[i]) {
                return alphabet.charAt(index);
            }

        }
        return ' ';
    }
}
