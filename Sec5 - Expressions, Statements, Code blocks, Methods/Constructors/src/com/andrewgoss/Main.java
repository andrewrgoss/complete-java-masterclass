package com.andrewgoss;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if there are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

        Account andrewsAccount = new Account("LL-191-919", 1986.19, "Andrew", "happy@gmail.com", "555-599-9944");

        // ** replaced by constructor above
//        account.setNumber("LL-191-919");
//        account.setBalance(1986.19);
//        account.setCustomerName("Andrew");
//        account.setCustomerEmail("happy@gmail.com");
//        account.setCustomerPhone(validatePhone("555-599-9944"));

        System.out.println("\nBank account number.............................. " + andrewsAccount.getNumber());
        System.out.println("Bank account balance............................. " + andrewsAccount.getBalance());
        System.out.println("Bank account full name........................... " + andrewsAccount.getCustomerName());
        System.out.println("Bank account email............................... " + andrewsAccount.getCustomerEmail());
        System.out.println("Bank account phone number........................ " + andrewsAccount.getCustomerPhone());

        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease enter deposit amount: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid double value.");
            sc.next();
        }
        double depositAmt = sc.nextDouble();
        andrewsAccount.deposit(depositAmt);

        System.out.println("\nNEW bank account balance......................... " + andrewsAccount.getBalance());

        System.out.println("\nPlease enter withdrawal amount: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid double value.");
            sc.next();
        }
        double withdrawalAmt = sc.nextDouble();
        andrewsAccount.withdrawal(withdrawalAmt);

        System.out.println("\nNEW bank account balance......................... " + andrewsAccount.getBalance());

        sc.close();

        System.out.println("==================================================  ");

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

        System.out.println("==================================================  ");

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.

        VipCustomer defaultAccount = new VipCustomer();
        System.out.println("Name: " + defaultAccount.getName() + " | " + "Credit Limit: " + defaultAccount.getCreditLimit() + " | " + "Email Address: " + defaultAccount.getEmailAddress());

        VipCustomer philsAccount = new VipCustomer("Phil", 25000.00);
        System.out.println("Name: " + philsAccount.getName() + " | " + "Credit Limit: " + philsAccount.getCreditLimit() + " | " + "Email Address: " + philsAccount.getEmailAddress());

        VipCustomer davidsAccount = new VipCustomer("David",  10000.00, "david@email.com");
        System.out.println("Name: " + davidsAccount.getName() + " | " + "Credit Limit: " + davidsAccount.getCreditLimit() + " | " + "Email Address: " + davidsAccount.getEmailAddress());

    }
}
