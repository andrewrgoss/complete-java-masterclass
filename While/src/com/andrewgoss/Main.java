package com.andrewgoss;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
	    while(count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("============================");

        count = 0;
        while(true) {
	        if (count == 5) {
	            break;
            }
            System.out.println("Count value is " + count);
	        count++;
        }

        System.out.println("============================");

        // Create a method called isEvenNumber that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method is
        // an even number or not.
        // return true if an even number, otherwise return false;

//        int number = 5;
//        int finishNumber = 20;
//        while(number <= finishNumber) {
//            if(!isEvenNumber(number)) {
//                number++;
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//            number++;
//        }

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        int number = 5;
        int finishNumber = 20;
        int evenCounter = 0;
        while(number <= finishNumber) {
            if(!isEvenNumber(number)) {
                number++;
                continue;
            }

            System.out.println("Even number " + number);
            number++;

            evenCounter++;
            if(evenCounter >= 5) {
                break;
            }
        }

        System.out.println("Total even numbers found = " + evenCounter);
    }

    public static boolean isEvenNumber(int n) {
        if ((n % 2) == 0) {
            return true;
        }
        return false;
    }
}
