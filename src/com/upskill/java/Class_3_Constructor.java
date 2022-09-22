package com.upskill.java;

/*Constructor is instance of class, method same as class name, java will execute constructor first 
 - Constructor cannot be static or override nor void or return type.
 - Default Constructor : No constructor is initialized 
 - Parameterized Constructor : Add different signature 
 - Constructor overloading : different signature   
 */

public class Class_3_Constructor {
	
	String clubName;																	//Intialize variable
	int titleNumber;																	//Intialize variable
	String country;
	
	public Class_3_Constructor(String name, int title) {		//Creates constructor of class, which execute first
		
		clubName = name;										//Added value on variable
		titleNumber = title;									//Added value on variable
		
		
	}
	
public Class_3_Constructor(String name, int title, String location) { //Creates constructor of class, which execute first
		
		clubName = name;										//Added value on variable
		titleNumber = title;									//Added value on variable
		country = location;
		
	}
	

	public static void main(String[] args) {
		
		Class_3_Constructor myobj = new Class_3_Constructor("HalaMadrid", 14);		//Creating object for specific instance
		
		System.out.println("Champion League Winner ::: " + myobj.clubName);
		System.out.println("Title ::: " + myobj.titleNumber);
		
		Class_3_Constructor myobj2 = new Class_3_Constructor("LFC", 6);		//Creating another object
		
		System.out.println("Champion League Winner::: " + myobj2.clubName);
		System.out.println("Title ::: " + myobj2.titleNumber);

		Class_3_Constructor myobj3 = new Class_3_Constructor("AC Milan", 7, "Italy"); //Creating object continue
		
		System.out.println("Champion League Winner::: " + myobj3.clubName);
		System.out.println("Title ::: " + myobj3.titleNumber);
		System.out.println("Country Name ::: " + myobj3.country);
	}

}
