package com.upskill.java;

public class AllAssignment {

	public static void main(String[] args) {
		
		System.out.println("Multiply Value : : :" + value());
		
		
		AllAssignment newyork = new AllAssignment();
				rishi.trianglePerimeter();
				rishi.rectanglePerimeter();
				rishi.annualIncomeVoid();
				rishi.monthlyIncomeReturn();
		
	}
		
		
		public void trianglePerimeter(){
			
			int a = 5;
			int b = 7;
			int c = 11;
			int perimeter = a+b+c;
			
			
			
			
		}

		public void rectanglePerimeter() {
			
			int width = 9;
			int length = 13;
			int perimeter2 = 2 * width+length;
			
			System.out.println("Output=" + perimeter2);
		}
		
		public int monthlyIncomeReturn(){
			int monthly = 65 * 180;
			return monthly;
			
		
		}

		public void annualIncomeVoid(){
			int annual = 65 * 2000;
			System.out.println("Annual Income ::: " + annual);
		
		}

		
		
		public static int value(){
			int a = 9;
			int b = 11;
			
			int value = (a*b)+a+b;
			
			return value; 		
		}
		
		public static int returns30() {
			
			return 30;
		}
			
			public static int returns50() {
			return 50;
		}
			
			public static int subtractionVale() {
				
				int subtractionVale = returns50() - returns30();
				
				System.out.println("Subtraction value from bigger number to smaller  =" + subtractionVale);
			
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