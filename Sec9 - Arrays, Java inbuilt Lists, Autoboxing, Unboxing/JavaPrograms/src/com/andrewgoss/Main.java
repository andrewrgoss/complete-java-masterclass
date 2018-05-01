package com.andrewgoss;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Andrew");

        // ArrayList<int> intArrayList = new ArrayList<int>(); // a primitive type is not a class, and a class (object) reference is needed here to be able to save something to an array list

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>(); // using class created above
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(54); // here Integer is actually a class, unlike the primitive type int
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++) {
            intArrayList.add(Integer.valueOf(i)); // autoboxing example - converting a base primitive type int and converting to an Integer class object wrapper
        }

        for(int i=0; i<=10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue()); // unboxing is taking the value from the class (object wrapper) and converting it back to a primitive type
        }

        Integer myIntValue = 56; // Integer.valueOf(56); -- converted to this at compile time (Java doing the work for you) -- autoboxing
        int myInt = myIntValue; // myIntValue.intValue(); -- converted to this at compile time by Java -- unboxing

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl<=10.0; dbl += 0.5) {
            myDoubleValues.add(dbl); // myDoubleValues.add(Double.valueOf(dbl)); -- shorthand code for autoboxing
        }

        for(int i=0; i<myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i); // double value = myDoubleValues.get(i).doubleValue(); -- shorthand code for unboxing
            System.out.println(i + " --> " + value);
        }
    }
}