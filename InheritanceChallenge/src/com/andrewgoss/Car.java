package com.andrewgoss;

public class Car extends Vehicle {

    public void handSteering() {
        System.out.println("Car.handSteering() called");
    }

    public void changeGears() {
        System.out.println("Car.changeGears() called");
    }

    @Override
    public void changeSpeed(int speed) {
        System.out.println("Car.changeSpeed() called");
        super.changeSpeed(speed);
    }
}
