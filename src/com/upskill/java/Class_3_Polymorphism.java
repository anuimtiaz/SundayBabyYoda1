package com.upskill.java;

/* Polymorphism is the ability of an object to take on many forms.
- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/


public class Class_3_Polymorphism  extends Class_1_MethodType_Object {

	public static void main(String[] args) {
//		car(4, "Red");
		
		Class_3_Polymorphism myobj = new Class_3_Polymorphism();
		myobj.weeklyIncomeVoid();
	}
	public static void weeklyIncomeVoid() {
		
		int weekly = hourlyIncome * 90;
		System.out.println("Weekly Income ::: " + weekly);
	}
	
	//Method overloading - Compile time Polymorphism/Same method name with different signature to overload
public static void car() {
	System.out.println("MY Car is Honda !");
}
public static void car(int door) {
	System.out.println("My Car is Honda, it has door : " + door);
}
public static void car(String colour) {

	System.out.println("My Car is Honda, its colour is : " + colour);
}
public static void car(int door, String colour) {
	System.out.println("My Car is Honda, it has door : " + door + " ; its colour : " + colour);
}

//Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override


}