package com.andrewgoss;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    // shortcut in IntelliJ to create getters and setters -> Code -> Generate... -> Getter and Setter. Then select the field(s) to create these for.

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return this.number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerPhone() {
        return this.customerPhone;
    }

    public void deposit(double depositAmt) {
        this.balance += depositAmt;
        System.out.println("Deposit of " + depositAmt + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmt) {
        if(this.balance - withdrawalAmt < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed.");
        } else {
            this.balance -= withdrawalAmt;
            System.out.println("Withdrawal of " + withdrawalAmt + " processed. Remaining balance = " + this.balance);
        }
    }

    public Account() { // constructor for initializing object being created (this is an override for the default constructor of this class)
        this("56789", 2.50, "Default name", "Default address", "Default phone"); // default constructor with all fields set to default values. Must be first line executed in constructor body
        System.out.println("Empty constructor called");
    }

    // overloaded constructor
    public Account(String number, double balance, String customerName, String customerEmail, String customerPhone) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public Account(String customerName, String customerEmail, String customerPhone) {
        this("99999", 100.55, customerName, customerEmail, customerPhone);
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }
}
