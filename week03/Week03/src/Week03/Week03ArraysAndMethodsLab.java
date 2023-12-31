package Week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] arrayOfNumbers = {1, 5, 2, 8, 13, 6};
		
		// 2. Print out the first element in the array
		System.out.println(arrayOfNumbers[0]);
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(arrayOfNumbers[arrayOfNumbers.length-1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		//System.out.println(arrayOfNumbers[6]);
			//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
			//at Week03/Week03.Week03ArraysAndMethodsLab.main(Week03ArraysAndMethodsLab.java:20)

		// 5. Print out the element in the array at position -1, what happens?
		//System.out.println(arrayOfNumbers[-1]);
			//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 6
			//at Week03/Week03.Week03ArraysAndMethodsLab.main(Week03ArraysAndMethodsLab.java:25)

			
		// 6. Write a traditional for loop that prints out each element in the array
		for(int i = 0; i < arrayOfNumbers.length; i++) {
			System.out.println(arrayOfNumbers[i]);
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		for(int number : arrayOfNumbers) {
			System.out.println(number);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		int sum = 0;
		for(int i = 0; i < arrayOfNumbers.length; i++) {
			sum += arrayOfNumbers[i];
		}
		System.out.println(sum);
		
		// 9. Create a new variable called average and assign the average value of the array to it
		int average = sum/arrayOfNumbers.length;
		System.out.println(average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		for(int number : arrayOfNumbers) {
			if(number%2 != 0) {
			System.out.println(number);
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		
		// 12. Calculate the sum of all the letters in the new array
		int length = 0;
		for (int j = 0; j < names.length; j++) {
			length += names[j].length();
		}
		System.out.println(length);

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.

		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
	
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position

				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		
		
	}
	

	
	// Method 13:


	// Method 14:

	
	// Method 15:

	
	// Method 16:

	
	// Method 17:

	
	// Method 18:

	
	// Method 19:

	
	// Method 20:
	
	
	// Method 21:
}
