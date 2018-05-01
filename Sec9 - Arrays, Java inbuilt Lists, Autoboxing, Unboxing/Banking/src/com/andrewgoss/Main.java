package com.andrewgoss;

public class Main {

    public static void main(String[] args) {
        // You job is to create a simple banking application.
        // There should be a Branch class - this will call code from other classes and have a lot of methods
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles (transactions)
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Branch:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions


        Bank bank = new Bank("National Australia Bank");

        if(bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch created");
        }

        bank.addCustomer("Adelaide", "Andrew", 119.19);
        bank.addCustomer("Adelaide", "Lauren", 34.22);
        bank.addCustomer("Adelaide", "Julie", 97.48);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Andrew", 44.22);
        bank.addCustomerTransaction("Adelaide", "Andrew", 12.44);
        bank.addCustomerTransaction("Adelaide", "Lauren", 1.65);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");

        if(!bank.addCustomer("Melbourne", "John", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }

        if(!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists");
        }

        if(!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Adelaide", "Andrew", 12.21)){
            System.out.println("Customer Andrew already exists");
        }
    }
}
