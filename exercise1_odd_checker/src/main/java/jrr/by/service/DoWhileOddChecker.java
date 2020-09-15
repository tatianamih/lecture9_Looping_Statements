package jrr.by.service;

public class DoWhileOddChecker {
 
 public int[] doWhileOddChecker() {
     int i = 1;
     int[] array = new int[(50 + 1) / 2];

     do {
         array[(i - 1) / 2] = i;
         i += 2;
     } while (i != 50);
     return array;
 }
}

