package com.challenge.splitstrings;


import java.util.ArrayList;
import java.util.List;

/**
 * Complete the solution so that it splits the string into pairs of two characters.
 * If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_'). *
 * Examples: *
 * * 'abc' =>  ['ab', 'c_']
 * * 'abcdef' => ['ab', 'cd', 'ef']
 */

public class SplitStrings {

    public static String[] solution(String s) {
        List<String> result = new ArrayList<>();
        int splitSize = 2;
        for (int i = 0; i < s.length() - 1; i += splitSize) {
            result.add(s.substring(i, i + splitSize));
        }
        //dealing with end of the string
        if (s.length() % 2 != 0) {
            result.add(s.substring(s.length() - 1) + "_");
        }
        return result.toArray(new String[0]);
    }
}
