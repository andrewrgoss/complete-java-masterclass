package com.andrewgoss;

public class Main {

    public static void main(String[] args) {

    // int has width of 32
	int myMinValue = -2_147_483_648; // you can use underscores in Java SE 8 to make a number more readable
	int myMaxValue = 2_147_483_647;
	int myTotal = (myMinValue/2);
	System.out.println("myTotal = " + myTotal);

	// byte has a width of 8
	byte myByteValue = -128; // computer allocates less space for a byte than an integer, so using a byte is more efficient
    byte myNewByteValue = (byte)(myByteValue/2);
    System.out.println("myNewByteValue = " + myNewByteValue);

    // short has a width of 16
    short myShortValue = 32767;
    short myNewShortValue = (short)(myShortValue/2);

    // long has a width of 64
    //long myLongValue = -9_223_372_036_854_775_807L;

    //1. Create a variable of type long, and make it equal to 50000 + 10 times the sum of the byte, plus the short plus the int
    byte byteValue = 10;
    short shortValue = 20;
    int intValue = 50;
    long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
    long shortTotal = (short) 1000 + 10 * (byteValue + shortValue + intValue);
    System.out.println("longTotal = " + longTotal);
    System.out.println("shortTotal = " + shortTotal);
    }
}
