package com.challenge.incrementstring;

import org.junit.platform.commons.util.StringUtils;

import java.math.BigInteger;

/**
 * Your job is to write a function which increments a string, to create a new string.
 * <p>
 * If the string already ends with a number, the number should be incremented by 1.
 * If the string does not end with a number. the number 1 should be appended to the new string.
 * Examples:
 * <p>
 * foo -> foo1
 * <p>
 * foobar23 -> foobar24
 * <p>
 * foo0042 -> foo0043
 * <p>
 * foo9 -> foo10
 * <p>
 * foo099 -> foo100
 * <p>
 * 2024 -> 2025
 * <p>
 * dkZN000te00000000000000000035952015601276 -> dkZN000te00000000000000000035952015601277
 * <p>
 * Attention: If the number has leading zeros the amount of digits should be considered.
 */
public class IncrementString {
    public static String incrementString(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        StringBuilder reversedNumberSb = new StringBuilder();
        for (char c : reversed.toCharArray()) {
            if (!Character.isDigit(c)) break;
            reversedNumberSb.append(c);
        }
        String reversedNumber = reversedNumberSb.toString();
        if (StringUtils.isBlank(reversedNumber)) return str + "1";
        int replaceIndex = str.lastIndexOf(reversedNumberSb.reverse().toString());
        BigInteger incrementedNumber = new BigInteger(str.substring(replaceIndex)).add(BigInteger.ONE);
        return str.substring(0, replaceIndex) + String.format("%0" + reversedNumber.length() + "d", incrementedNumber);
    }
}
