package jrr.by.service;

public class PrimeNumbers {
    public String primeNumbers(){
    int sum = 0;
    int counterNumber = 0;
    int counter = 0;

        for(int i=2; i < 500; i++) {
            for (int j=2; j <= i/j; j++){
                if((i%j) == 0)
                counterNumber++;
            }
            if(i == 17 || i == 71){
                continue;
            }

            if (counterNumber < 1 ){
                sum += i;
                counter++;
            }
            if(counter == 50){
                break;
            }

            counterNumber = 0;
        }
        return "sum = " + sum + " count = " + counter;
    }

}

