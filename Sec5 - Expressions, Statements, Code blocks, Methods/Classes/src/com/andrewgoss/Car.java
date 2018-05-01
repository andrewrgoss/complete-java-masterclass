package com.andrewgoss;

public class Car { // public keyword is access modifier. Public means unrestricted access to this class is allowed. Private means no other class can access this class. Protected allows classes in a package to access the class. Also possible to remove the access modifier completely.

    /*
    Encapsulation is one of the four fundamental OOP concepts. The other three are inheritance, polymorphism, and abstraction.

    Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

    To achieve encapsulation in Java −

    Declare the variables of a class as private.

    Provide public setter and getter methods to modify and view the variables values.
     */

    private int doors; // characteristics of class
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // 'setters' and 'getters' in Java

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown"; // access the variable above and set it to the input parameter. Exampel of accessing a model through a method rather than directly.
        }
    }

    public String getModel() {
        return this.model;
    }


}
