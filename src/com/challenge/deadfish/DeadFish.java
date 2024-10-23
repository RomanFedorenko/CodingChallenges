package com.challenge.deadfish;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a simple parser that will parse and run Deadfish.
 *
 * Deadfish has 4 commands, each 1 character long:
 *
 * i increments the value (initially 0)
 * d decrements the value
 * s squares the value
 * o outputs the value into the return array
 * Invalid characters should be ignored.
 *
 * Deadfish.parse("iiisdoso") =- new int[] {8, 64};
 * */
public class DeadFish {
    public static int[] parse(String data) {
        int val = 0;
        List<Integer> res = new ArrayList<>();
        for (char c : data.toCharArray()) {
            switch (c) {
                case 'i' -> val++;
                case 'd' -> val--;
                case 's' -> val *= val;
                case 'o' -> res.add(val);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
