package jrr.by.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberServiceTest {

    @Test
    public void rangeSum() {
        NumberService numberService = new NumberService();
        numberService.rangeSum(3,7);
        int expected = 25;
        int actual = numberService.rangeSum(3,7);
        assertEquals(expected,actual);
    }

    @Test
    public void rangeSumInReverseOrder() {
        NumberService numberService = new NumberService();
        numberService.rangeSum(7,3);
        int expected = 25;
        int actual = numberService.rangeSum(7,3);
        assertEquals(expected,actual);
    }


    @Test
    public void rangeEvenCount() {
        NumberService numberService = new NumberService();
        numberService.rangeEvenCount(2,9);
        int expected = 4;
        int actual = numberService.rangeEvenCount(2,9);
        assertEquals(expected,actual);
    }
    @Test
    public void rangeEvenCountInReverseOrder() {
        NumberService numberService = new NumberService();
        numberService.rangeEvenCount(9,2);
        int expected = 4;
        int actual = numberService.rangeEvenCount(9,2);
       assertEquals(expected,actual);
    }
}