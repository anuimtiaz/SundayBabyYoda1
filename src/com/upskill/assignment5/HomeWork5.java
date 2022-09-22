package com.upskill.assignment5;

//Write a java program which will display name and guestimated age of every students in your class.
//(write separate method for every student).

public class HomeWork5 {

	public static void main(String[] args) {
		HomeWork5 myobject = new HomeWork5();
		myobject.jafrinJahan();
		
		System.out.println("Ashik Prodhan Age = " + ashikProdhan());
		System.out.println("Rishi Bhai Age = " + rishiBhai());
	}
	public void jafrinJahan() {
		int yearOfBirth = 1995;
		int currentYear = 2022;
		int actualAge =  currentYear - yearOfBirth;
		
	System.out.println("Jafrin Jahan Age = " + actualAge);
	}
	public static int ashikProdhan() {
		return 34;
		
	}
	
	public static int rishiBhai() {
		return 39;
	}
	
	
}
