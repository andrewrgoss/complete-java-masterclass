package com.andrewgoss;

public class Hamburger {
    private String breadRollType;
    private String meat;

    private double totalPrice;
    private double toppingsPrice;
    private int itemsAdded;

    private int lettuce = 1;
    private int tomato = 2;
    private int onion = 3;
    private int cheese = 4;

    public Hamburger(String breadRollType, String meat) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.totalPrice = 4.0;
        this.toppingsPrice = 0.0;
        this.itemsAdded = 0;
    }

    public void displayMenu() {
        System.out.println("WELCOME TO BOB'S BURGERS!\n");
        System.out.println(":: STANDARD BURGER MENU ::");
        System.out.println("AVAILABLE TOPPINGS");
        System.out.println("1 : lettuce ..... 0.30");
        System.out.println("2 : tomato ...... 0.60");
        System.out.println("3 : onion ....... 0.50");
        System.out.println("4 : cheese ...... 0.75\n");
    }

    public void addTopping() { // overloaded method (different number of parameters)
        System.out.println("No topping added to order.");
    }

    public void addTopping(int lettuce) { // overloaded method (different number of parameters)
        this.itemsAdded += 1;
        this.totalPrice += calculatePrice(lettuce);
    }

    public void addTopping(int lettuce, int tomato) { // overloaded method (different number of parameters)
        this.itemsAdded += 2;
        this.totalPrice += calculatePrice(lettuce) + calculatePrice(tomato);
    }

    public void addTopping(int lettuce, int tomato, int onion) { // overloaded method (different number of parameters)
        this.itemsAdded += 3;
        this.totalPrice += calculatePrice(lettuce) + calculatePrice(tomato) + calculatePrice(onion);
    }

    public void addTopping(int lettuce, int tomato, int onion, int cheese) { // overloaded method (different number of parameters)
        this.itemsAdded += 4;
        this.totalPrice += calculatePrice(lettuce) + calculatePrice(tomato) + calculatePrice(onion) + calculatePrice(cheese);
    }

    public double calculatePrice(int toppingValue) {
        switch(toppingValue) {
            case 1: // lettuce
                System.out.println("Added lettuce topping.");
                return this.toppingsPrice = 0.30;
            case 2: // tomato
                System.out.println("Added tomato topping.");
                return this.toppingsPrice = 0.60;
            case 3: // onion
                System.out.println("Added onion topping.");
                return this.toppingsPrice = 0.50;
            case 4: // cheese
                System.out.println("Added cheese topping.");
                return this.toppingsPrice = 0.75;
        }
        return this.toppingsPrice;
    }

    public void completeOrder() {
        System.out.println("Standard hamburger ordered. Added " + this.itemsAdded + " toppings.");
        System.out.println("Total price = " + this.totalPrice);
    }
}
