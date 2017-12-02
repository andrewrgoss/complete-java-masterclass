package com.andrewgoss;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default name", 50000.00, "default@email.com");
        System.out.println("Empty constructor called");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "vip@email.com");
        System.out.println("Constructor with partial parameters called");
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        System.out.println("Constructor with all parameters called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }
}
