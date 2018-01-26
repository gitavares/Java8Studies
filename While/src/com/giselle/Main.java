package com.giselle;

public class Main {

    public static void main(String[] args) {
        int count = 0;

        while(count != 5){
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        while(true){
            if(count == 5){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;

            if(count > 100){
                break;
            }
        } while (count != 6);

        int number = 0;
        while(number < 20){
            if(isEvenNumber(number))
                System.out.println(number + " is even");

            number++;
        }

        number = 0;
        int totalEvenNumbers = 0;
        while(number < 20){
            if(isEvenNumber(number)) {
                System.out.println(number + " is even");
                totalEvenNumbers++;

                if(totalEvenNumbers == 5){
                    System.out.println("Total Even number was " + totalEvenNumbers);
                    break;
                }
            }
            number++;
        }


    }

    public static boolean isEvenNumber(int number){
        if((number % 2) == 0)
            return true;

        return false;
    }
}
