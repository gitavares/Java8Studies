package com.giselle;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Giselle", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        calcFeetAndInchesToCentimeters(10);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return  score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return  score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet < 0 || (inches < 0 || inches > 12))
            return -1;

        System.out.println(feet + " Feet, " + inches + " Inches to Centimeters = " + inches * 2.54);

        return 1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0)
            return -1;

        double feet = inches/12.0;

        return calcFeetAndInchesToCentimeters(feet, inches);
    }
}
