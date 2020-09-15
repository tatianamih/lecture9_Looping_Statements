package jrr.by.service;

public class NumberService {
    public int rangeSum(int start, int finish) {
        int sum = 0;
        if (start < finish) {
            for (int i = start; i <= finish; i++) {
                sum += i;
            }
        }
        if (start > finish) {
            for (int i = start; i >= finish; i--) {
                sum += i;
            }

        }
        return sum;
    }
    


    public int rangeEvenCount(int start, int finish) {
        int count = 0;
        if (start < finish) {
            for (int i = start; i <= finish; i++) {
                if (i % 2 == 0) {
                    count ++;
                }
            }
        }
        if (start > finish) {
            for (int i = start; i >= finish; i--) {
                if (i % 2 == 0) {
                    count ++;
                }

            }

        }
        return count;
    }
}
