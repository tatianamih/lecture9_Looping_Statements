package jrr.by.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerCalculatorTest {

    @Test
    public void exponentiationOfANumberFirstVariant() {
        PowerCalculator powerCalculator = new PowerCalculator();

        int expected = 100;
        int actual = powerCalculator.exponentiationOfANumber(10, 2);

        assertEquals(expected, actual);
    }
    @Test
    public void exponentiationOfANumberSecondtVariant() {
        PowerCalculator powerCalculator = new PowerCalculator();

        int expected = 32;
        int actual = powerCalculator.exponentiationOfANumber(2,5);

        assertEquals(expected, actual);
    }
    @Test
    public void exponentiationOfANumberThirdtVariant() {
        PowerCalculator powerCalculator = new PowerCalculator();

        int expected = 1;
        int actual = powerCalculator.exponentiationOfANumber(2,0);

        assertEquals(expected, actual);
    }
}
