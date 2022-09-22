package com.upskill.assignment3;


//A function which returns the multiply value of a and b where a = 9 and b = 11. 
//Write a program which will display addition of a +b + function returns value.

public class Assignment {

	public static void main(String[] args) {
		System.out.println("Return Value =" + multiplyValue());
		System.out.println("Function Value =" + additionValue());
	}

	public static int multiplyValue() {
		int a = 9;
		int b = 11;
		int returnValue = a*b;
		
		return returnValue;
	}
	public static int additionValue() {
		int a = 9;
		int b = 11;
		int returnAddition = (a*b)+a+b;
		return returnAddition;
	}
	
	}
	

