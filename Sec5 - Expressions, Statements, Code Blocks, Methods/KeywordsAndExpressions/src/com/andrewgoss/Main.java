package com.andrewgoss;

public class Main {

    public static void main(String[] args) {
        // expressions are building blocks of all Java programs
        // a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344);
        int highScore = 50;
        if(highScore == 50) {
            System.out.println("This is an expression");
        }

        int score = 100; // this is an expression
        if (score > 99) {
            System.out.println("You got the high score!"); // this is an expression
            score = 0; // another valid expression
        }
    }
}
