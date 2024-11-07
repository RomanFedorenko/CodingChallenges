package com.challenge.test;

import com.challenge.incrementstring.IncrementString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncrementStringTest {
    private static void doTest(String str, String expected) {
        String actual = assertDoesNotThrow(() -> IncrementString.incrementString(str), "Solution thrown an unexpected exception for str=\"" + str + "\"\n\n");
        assertEquals(expected, actual, "Incorrect answer for str=\"" + str + "\"\n\n");
    }


    @Test
    public void exampleTests() {
        doTest("foobar000", "foobar001");
        doTest("foo", "foo1");
        doTest("foobar001", "foobar002");
        doTest("foobar99", "foobar100");
        doTest("foobar099", "foobar100");
        doTest("", "1");
        doTest("dkZN/m<#XjJ{&vCtKqSaP(te00000000000000000035952015601276", "dkZN/m<#XjJ{&vCtKqSaP(te00000000000000000035952015601277");
    }
}
