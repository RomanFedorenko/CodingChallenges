package com.challenge;

import com.challenge.calculaterepeats.CalculateRepeats;
import com.challenge.josephus.Josephus;
import com.challenge.primenumbers.PrimeNumbers;

import java.text.MessageFormat;
import java.util.Map;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        int primeIndex = 7;
        int primeByIndex = PrimeNumbers.getPrimeByIndex(primeIndex);
        System.out.println(MessageFormat.format("Prime number with index {0} is {1}", primeIndex, primeByIndex));

        int killEvery = 3;
        int circleSize = 15;
        int survivor = Josephus.getSurvivor(circleSize, killEvery);
        System.out.println(MessageFormat.format("If we kill every {0} in circle with size {1}, last survivor will be under number {2}", killEvery, circleSize, survivor));

        Map<Integer, Integer> result = CalculateRepeats.calculateRepeats(Stream.of(1,1,2,2,3,4,5,6,7).toList());
        result.forEach((key, value) -> System.out.println(MessageFormat.format("list has amount {0} of value {1}", value, key)));
    }
}
