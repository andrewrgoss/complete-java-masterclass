package com.andrewgoss;

public class Hamburger {
    private String breadRollType;
    private String meat;

    private double totalPrice;
    private double toppingsPrice;
    private int toppingsAdded;

    public Hamburger(String breadRollType, String meat) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.totalPrice = 4.0;
        this.toppingsPrice = 0.0;
        this.toppingsAdded = 0;
    }

    public void displayMenu() {
        System.out.println("WELCOME TO BOB'S BURGERS!\n");
        System.out.println(":: STANDARD BURGER MENU ::");
        System.out.println("AVAILABLE TOPPINGS");
        System.out.println("1 : lettuce ..... 0.30");
        System.out.println("2 : tomato ...... 0.60");
        System.out.println("3 : onion ....... 0.50");
        System.out.println("4 : cheese ...... 0.75\n");
        System.out.println("Enter 1 to add topping, enter 0 to exclude topping.\n");
    }

    public void completeOrder(int lettuce, int tomato, int onion, int cheese) {
        if (lettuce > 0) {
            this.toppingsAdded += lettuce;
            this.toppingsPrice += 0.30 * lettuce;
        }
        if (tomato > 0) {
            this.toppingsAdded += tomato;
            this.toppingsPrice += 0.60 * tomato;
        }
        if (onion > 0) {
            this.toppingsAdded += onion;
            this.toppingsPrice += 0.50 * onion;
        }
        if (cheese > 0) {
            this.toppingsAdded += cheese;
            this.toppingsPrice += 0.75 * cheese;
        }
        this.totalPrice += this.toppingsPrice;

        System.out.println("Standard hamburger ordered. Added " + this.toppingsAdded + " toppings.");
        System.out.println("Total price = " + this.totalPrice);
    }
}
