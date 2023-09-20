//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01lab;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		

		int seats = 5;	
		// 2. Create a variable to hold the cost of groceries at checkout

		double groceries = 123.12;
		// 3. Create a variable to hold a person's middle initial

		char middleInitial = 'R';
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		
		boolean isHot = false;
		// 5. Create a variable to hold a customer's first name

		String customerName ="John";	
		// 6. Create a variable to hold a street address
		String address = "12 North St";

		// 7. Print all variables to the console
	
		System.out.println("available seats left on plane" + seats);
		System.out.println("grocery cost " +groceries);
		System.out.println(middleInitial);
		System.out.println(isHot);
		System.out.println(customerName);
		System.out.println(address);
		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		seats = seats - 2;	
		

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		groceries = groceries + 2.15;
		System.out.println(groceries);

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'K';

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		isHot = !isHot;
		System.out.println(isHot);
		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String fullName = "Simon "+ middleInitial+ " L";
		System.out.println(fullName);

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable

		System.out.println("Hello, this is " + fullName + "they live at " + address);
		
	}
}