package com.upskill.assignment4;
//A function returns 30, another function returns 50.
//Write a java program which will display subtraction value from bigger number to smaller.


public class Assignment {

	public static void main(String[] args) {
		smallerNumber();
		System.out.println("Return 2 =" + biggerNumber());
		subtractionValue1();
	}
		
		public static void smallerNumber(){
			int number1 = 30;
			int number3 = 40;
			int values = number1 + number3;
			System.out.println("Value =" + values);
			
		}
			
			public static int biggerNumber() {
			int number2 = 50;
		    return 50;
				
			}
			
			public static void subtractionValue1() {
				int number1 = 30;
				int number2 = 50;
				
				int subtractionValue1 = number2 - number1;
				
				System.out.println("Subtraction Value =" + subtractionValue1);		
			}
			
			}

