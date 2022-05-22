package com.challenge.primenumbers;

// Create a function, that will return the Prime number based on the selected index.
//
//   The first 7 prime numbers are:
//   2, 3, 5, 7, 11, 13, 17
//
// Example of the function:
// - the user passes 5 into a function, it should return the 5th prime number which is 11
// - the user passes 7 into a function, it should return the 7th prime number which is 17


public class PrimeNumbers {

    public static int getPrimeByIndex(int index) {
        int lastPrimeIndex = 1;
        int currentNumber = 2;

        while (lastPrimeIndex != index) {
            currentNumber++;
            if (isPrime(currentNumber)){
                lastPrimeIndex++;
            }
        }
        return currentNumber;
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
