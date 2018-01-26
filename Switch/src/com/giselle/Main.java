package com.giselle;

import jdk.internal.cmm.SystemResourcePressureImpl;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if(value == 1){
//            System.out.println("Value was 1");;
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 3;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char switchChar = 'A';

        switch (switchChar){
            case 'A':
                System.out.println("Value was A");
                break;

            case 'B':
                System.out.println("Value was B");
                break;

            case 'C':
                System.out.println("Value was C");
                break;

            case 'D':
                System.out.println("Value was D");
                break;

            case 'E':
                System.out.println("Value was E");
                break;

            default:
                System.out.println("Value wasn't A, B, C, D or E");
                break;
        }

        String month = "January";

        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
        }

    }
}
