package jrr.by.service;

public class PowerCalculator {
    public int exponentiationOfANumber(int number, int exponentiation){
        int result = 1;
            for (int i = 1; i <= exponentiation; i++) {
                result = result * number;
            }
            return result;
        }
    }

