package com.challenge.test;

import com.challenge.multipliesof3or5.Multiplies;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultipliesTest {
    @Test
    public void test() {
        assertEquals(23, Multiplies.solution(10));
    }

}
