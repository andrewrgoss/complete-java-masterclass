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

        BankAcct bankAcct = new BankAcct();

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter bank account number: ");
        while (!sc.hasNextInt()) {
            System.out.println("Please enter a valid integer value.");
            sc.next();
        }
        int acctNumber = sc.nextInt();
        bankAcct.setAcctNumber(acctNumber);
        System.out.println("\nBank account number.............................. " + bankAcct.getAcctNumber());

        bankAcct.setAcctBalance(1986.19);
        bankAcct.setAcctFullName("Andrew");
        bankAcct.setAcctEmail("happy@gmail.com");
        bankAcct.setAcctPhone(validatePhone("555-599-9944"));

        System.out.println("Bank account balance............................. " + bankAcct.getAcctBalance());
        System.out.println("Bank account full name........................... " + bankAcct.getAcctFullName());
        System.out.println("Bank account email............................... " + bankAcct.getAcctEmail());
        System.out.println("Bank account phone number........................ " + bankAcct.getAcctPhone());

        System.out.println("\nPlease enter deposit amount: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid double value.");
            sc.next();
        }
        double depositAmt = sc.nextDouble();
        bankAcct.makeDeposit(depositAmt);

        System.out.println("\nNEW bank account balance......................... " + bankAcct.getAcctBalance());

        System.out.println("\nPlease enter withdrawal amount: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid double value.");
            sc.next();
        }
        double withdrawalAmt = sc.nextDouble();
        bankAcct.makeWithdrawal(withdrawalAmt);

        System.out.println("\nNEW bank account balance......................... " + bankAcct.getAcctBalance());

        sc.close();
    }

    public static String validatePhone(String s) {
        String regexStr = "^[0-9\\-]*$";
        if (s.matches(regexStr)) {
            return s;
        }
        return "{Invalid phone number!}";
    }

}
