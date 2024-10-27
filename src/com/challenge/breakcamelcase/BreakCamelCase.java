package com.challenge.breakcamelcase;

/**
 * Complete the solution so that the function will break up camel casing, using a space between words.
 *
 * Example
 * "camelCasing"  =>  "camel Casing"
 * "identifier"   =>  "identifier"
 * ""             =>  ""
 */

public class BreakCamelCase {
    public static String camelCase(String input) {
        return String.join(" ", input.split("(?=[A-Z])"));
    }
}
