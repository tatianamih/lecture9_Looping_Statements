package jrr.by.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumbersTest {

    @Test
    public void primeNumbers() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.primeNumbers();

        String expected = "sum = 5501 count = 50";
        String actual =  primeNumbers.primeNumbers();
        assertEquals(expected, actual);

    }
}