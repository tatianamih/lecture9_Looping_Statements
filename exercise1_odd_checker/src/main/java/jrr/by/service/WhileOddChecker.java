package jrr.by.service;

public class WhileOddChecker {
    public int[] whileOddChecker() {
        int i = 1;
        int[] array = new int[(50 + 1) / 2];
        while (i != 50) {
            array[(i - 1) / 2] = i;
            i += 2;
        }
        return array;
    }
}

