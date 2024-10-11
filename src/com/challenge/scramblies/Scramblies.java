package com.challenge.scramblies;

/**
 * Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.
 * <p>
 * Notes:
 * <p>
 * Only lower case letters will be used (a-z). No punctuation or digits will be included.
 * Performance needs to be considered.
 * Examples
 * scramble('rkqodlw', 'world') ==> True
 * scramble('cedewaraaossoqqyt', 'codewars') ==> True
 * scramble('katas', 'steak') ==> False
 */

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        int index;
        for (char c : str1.toCharArray()) {
            if ((index = str2.indexOf(c)) != -1) {
                str2 = str2.substring(0, index) + str2.substring(index + 1);
            }
            if (str2.isEmpty()) return true;
        }
        return false;
    }
}
