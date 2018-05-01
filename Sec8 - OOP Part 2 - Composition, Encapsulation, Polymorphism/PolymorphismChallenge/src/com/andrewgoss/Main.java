package com.andrewgoss;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}

class Camry extends Car {
    public Camry(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Camry.startEngine() called";
    }

    @Override
    public String accelerate() {
        return "Camry.accelerate() called";
    }

    @Override
    public String brake() {
        return "Camry.brake() called";
    }
}

class Sentra extends Car {
    public Sentra(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Sentra.startEngine() called";
    }

    @Override
    public String accelerate() {
        return "Sentra.accelerate() called";
    }

    @Override
    public String brake() {
        return "Sentra.brake() called";
    }
}

class Corolla extends Car {
    public Corolla(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Corolla.startEngine() called";
    }

    @Override
    public String accelerate() {
        return "Corolla.accelerate() called";
    }

    @Override
    public String brake() {
        return "Corolla.brake() called";
    }
}

public class Main {

    public static void main(String[] args) {
        // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generic car class.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).

        for(int i = 1; i < 6; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i + " : " + car.getName() + "\n" + "Car: " + car.startEngine() + "\n");
        }

    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch(randomNumber) {
            case 1:
                return new Camry("Camry", 4);

            case 2:
                return new Corolla("Corolla", 4);

            case 3:
                return new Sentra("Sentra", 4);

        }

        return null;
    }
}
