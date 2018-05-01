package com.andrewgoss;

public class Main { // statement that creates a new class in Java. Class is a template or blueprint for creating objects

    public static void main(String[] args) {
	    Car porsche = new Car(); // instantiate (initialize) class (create object based on class template)
        Car holden = new Car();

        porsche.setModel("Carrera"); // by not allowing others to access field directly, by forcing them to assigning model using method, data in objects have been validated and are correct
        System.out.println("Model is " + porsche.getModel());
    }
}
