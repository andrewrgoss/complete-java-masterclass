package com.andrewgoss;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Customer customer = new Customer("Andrew", 54.96);
	    Customer anotherCustomer;
	    anotherCustomer = customer; // pointer to first class
	    anotherCustomer.setBalance(12.18); // first class is updated here, rather than new class (anotherCustomer) being updated. All because of how memory is used and allocated in Java
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        // advantages of linked lists over arrays
		ArrayList<Integer> intList = new ArrayList<Integer>();

		intList.add(1);
		intList.add(3);
		intList.add(4);

		for(int i=0; i<intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i));
		}

		intList.add(1, 2);

		for(int i=0; i<intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i));
		}

		// Linked list is an alternative to an array. Stores link to next item in the list as well as the actual data. Each element in the list holds a link to the item that follows it as well as the actual value itself.
    }
}
