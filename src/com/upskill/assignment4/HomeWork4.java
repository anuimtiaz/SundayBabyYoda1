package com.upskill.assignment4;
//A function returns 30, another function returns 50. 
//Write a java program which will display subtraction value from bigger number to smaller.
public class HomeWork4 {

	public static void main(String[] args) {
System.out.println("Return Value1 = " + functionA());
System.out.println("Return Value2 = " + functionB());
subtractionValue();		
	}

	public static int functionA() {
		
		return 30;	
	}
	public static int functionB() {
		
		return 50;
	
	} 
	public static void subtractionValue() {
		
		int functionB = 50;
		int functionA = 30;
		
		int subtractionResult = functionB - functionA;
		
		System.out.println("Return Value3 = " + subtractionResult);
		
	}
	
	
	
}
