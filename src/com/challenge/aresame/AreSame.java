package com.challenge.aresame;

import java.util.Arrays;

/**
 * see description at -> https://www.codewars.com/kata/550498447451fbbd7600041c/java
 * */

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        if (a==null || b==null || a.length != b.length) return false;
        return Arrays.equals(Arrays.stream(a).map(x -> x * x).sorted().toArray(), Arrays.stream(b).sorted().toArray());
    }
}
