package com.upskill.assignment5;
////A function which returns the multiply value of a and b where a = 9 and b = 11. 
 //Write a program which will display addition of a +b + function returns value.

public class HomeWork {

	public static void main(String[] args) {
		System.out.println("Multiply Result = " + multiplyValue());
		additionValue();

	}
public static int multiplyValue() {
	
	int a = 9;
	int b = 11;
	
	int returnValue = a*b;
	return returnValue;
}
	public static void additionValue() {
		int a = 9;
		int b = 11;
		
		int multiplyResult = 99;
		
		int displayValue = 99+a+b;
		
		System.out.println("Returns Value = " + displayValue);
		
	}
	
	
	
	
	
	
	
	
}



/*

//A triangle three arms are: 5, 7 and 11 inches.
Write a method to display the perimeter of triangle in console output.

//A rectangle width and length are: 9 and 13 inches. 
Write a method to display the perimeter of rectangle in console output.

//A function which returns the multiply value of a and b where a = 9 and b = 11. 
Write a program which will display addition of a +b + function returns value.

//A function returns 30, another function returns 50. 
Write a java program which will display subtraction value from bigger number to smaller.

//Write a java program which will display name and guestimated age of every students in your class.
(write separate method for every student).

*/