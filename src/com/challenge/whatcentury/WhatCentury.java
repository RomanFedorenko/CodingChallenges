package com.challenge.whatcentury;

/**
 * Return the century of the input year. The input will always be a 4 digit string, so there is no need for validation.
 * <p>
 * Examples
 * "1999" --> "20th"
 * "2011" --> "21st"
 * "2154" --> "22nd"
 * "2259" --> "23rd"
 * "1124" --> "12th"
 * "2000" --> "20th"
 */

public class WhatCentury {
    public static String whatCentury(int year) {
        String century = String.valueOf(year).endsWith("00") ?
                String.valueOf(year / 100) :
                String.valueOf(year / 100 + 1);
        if (century.charAt(0) == '1') return century + "th";
        return switch (century.charAt(1)) {
            case '1' -> century + "st";
            case '2' -> century + "nd";
            case '3' -> century + "rd";
            default -> century + "th";
        };
    }
}
