package com.andrewrgoss;

public class BarkingDog {

    public static boolean bark(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            System.out.println("Invalid hour of the day provided!");
            return false;
        } else if (!barking) {
            System.out.println("The dog is not barking!");
            return false;
        } else if (hourOfDay < 8 || hourOfDay > 22) {
            System.out.println("Dog is barking, wake up!");
            return true;
        } else {
            return false;
        }
    }
}
