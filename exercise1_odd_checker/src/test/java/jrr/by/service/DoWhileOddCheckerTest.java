package jrr.by.service;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class DoWhileOddCheckerTest {
    public static Logger logger = LoggerFactory.getLogger(ForOddChecker.class);

    int[] expected = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49};

    @Test
    public void doWhileOddChecker() {
        ForOddChecker forOddChecker = new ForOddChecker();
        forOddChecker.forOddChecker();

        int[] actual = forOddChecker.forOddChecker();
        logger.info("odd numbers from 0 to 50 obtained using the loop do While");
        assertArrayEquals(expected, actual);
    }
}