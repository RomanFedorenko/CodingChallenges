package com.challenge.stripcomments;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Complete the solution so that it strips all text that follows any of a set of comment markers passed in. Any whitespace at the end of the line should also be stripped out.
 *
 * Example:
 *
 * Given an input string of:
 *
 * apples, pears # and bananas
 * grapes
 * bananas !apples
 * The output expected would be:
 *
 * apples, pears
 * grapes
 * bananas
 * The code would be called like so:
 *
 * var result = solution("apples, pears # and bananas\ngrapes\nbananas !apples", ["#", "!"])
 * // result should == "apples, pears\ngrapes\nbananas"
 * */

public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        return Arrays.stream(text.split("\n"))
                .map(line -> Arrays.stream(commentSymbols)
                        .map(line::indexOf)
                        .filter(index -> index != -1)
                        .min(Integer::compareTo)
                        .map(index -> line.substring(0, index).strip())
                        .orElse(line.stripTrailing()))
                .collect(Collectors.joining("\n"));
    }
}
