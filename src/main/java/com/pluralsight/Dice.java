package com.pluralsight;

public class Dice {
    // create a roll method
    public int roll(int minValue, int maxValue) {
        int randomNumber = (int) (Math.random() * (maxValue - minValue + 1)) + minValue;
        return randomNumber;
    }


}
