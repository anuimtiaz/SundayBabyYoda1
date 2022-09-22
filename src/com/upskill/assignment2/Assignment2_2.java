package com.upskill.assignment2;

public class Assignment2_2 {
	
	
	/*A rectangle width and length are: 9 and 13 inches. 
	 Write a method to display the perimeter of rectangle in console output.
	 */

	public static void main(String[] args) {
		rectanglePerimeter();
		
		Assignment2_2 anu = new Assignment2_2();
		anu.rectanglePerimeter2();
		System.out.println("Return Perimeter" + returnPerimeter());
		
	}

	public static void rectanglePerimeter(){
		
		int width = 9;
		int length = 13;
		
		int perimeter = 2 * (width+length);
		
		
		System.out.println("Rectangle Perimeter =" + perimeter);
		
		
	}
	public void rectanglePerimeter2(){
		
		int width = 9;
		int length = 13;
		int perimeter = 2 * (width+length);
		System.out.println("Rectangle Perimeter =" + perimeter);
}

public static int returnPerimeter(){
		
		int a = 9;
		int b = 13;
		
		int result = 2 * (a+b);
		return result;
		
	
}
}
