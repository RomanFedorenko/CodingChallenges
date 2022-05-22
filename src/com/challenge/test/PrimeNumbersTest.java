package com.challenge.test;

import com.challenge.primenumbers.PrimeNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeNumbersTest {

    @Test
    public void getThirdPrimeNumber(){
        int actual = PrimeNumbers.getPrimeByIndex(3);
        Assertions.assertEquals(5, actual);
    }

    @Test
    public void getTenthPrimeNumber(){
        int actual = PrimeNumbers.getPrimeByIndex(10);
        Assertions.assertEquals(29, actual);
    }
}
