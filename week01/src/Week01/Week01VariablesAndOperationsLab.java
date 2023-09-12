//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package Week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		int seatsLeft = 5;
		
		// 2. Create a variable to hold the cost of groceries at checkout
		double totalAmount = 97.50;
		
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'C';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean isHotOutside = true;
		
		// 5. Create a variable to hold a customer's first name
		String firstName = "Patrick";
		
		// 6. Create a variable to hold a street address
		String address = "8 Pearl Street";

		// 7. Print all variables to the console
		System.out.println(seatsLeft);
		System.out.println(totalAmount);
		System.out.println(middleInitial);
		System.out.println(isHotOutside);
		System.out.println(firstName);
		System.out.println(address);

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		seatsLeft = seatsLeft - 2;
		System.out.println(seatsLeft);
	

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		totalAmount = totalAmount + 2.15;
		System.out.println(totalAmount);
		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'F';
		System.out.println(middleInitial);
		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was

		System.out.println(!isHotOutside);
		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String fullName = firstName + " " + middleInitial + " " + "Corcoran";
		System.out.println(fullName);
		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("Our newest customer is " + fullName + " and they live at: " + address);
		
		System.out.println(9/0);
		
		
	}
}