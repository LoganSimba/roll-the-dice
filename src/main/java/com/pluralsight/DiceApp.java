package com.pluralsight;

public class DiceApp {
    public static void main(String[] args) {
        //created an instance of Dice
        Dice dice1 = new Dice();

        //initializing my counters
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        //for loop to compute the sum of rolls
        for(int i = 1; i <= 100; i++){
            int roll1 = dice1.roll(1,6);
            int roll2 = dice1.roll(1,6);
            int sumrolls = roll1 + roll2;

            System.out.println("Roll " + i + ", " + roll1 + " + " + roll2 + ", sum = " + sumrolls);
            // using switch statement increment
            switch(sumrolls){
                case 2 -> twoCounter++;
                case 4 -> fourCounter++;
                case 6 -> sixCounter++;
                case 8 -> sevenCounter++;
            }
        }
        //print out how may time we encountered the
        System.out.println("\n\n=============");
        System.out.println("Two = " + twoCounter);
        System.out.println("four = " + fourCounter);
        System.out.println("Three = " + sixCounter);
        System.out.println("four = " + sevenCounter);

    }

}
