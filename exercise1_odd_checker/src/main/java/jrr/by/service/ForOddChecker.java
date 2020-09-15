package jrr.by.service;

public class ForOddChecker {
  
    public int[] forOddChecker() {
        int i = 1;
        int[] array = new int[(50+1)/2];
        for (;i<=50;i+=2)
            array[(i-1)/2]=i;
        return array;
    }
}
           
            
            
          
   
   
