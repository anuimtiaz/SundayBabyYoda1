package IfElse;

public class IfElse_1st_Class {

	public static void main(String[] args) {
		//less then 13 = Children 
		//13 - 17 = Teenager
		//18 - 59 = Adult 
		//60 - 99 = Senior
		//100+ = Champion 
		
		
		int age = 60;
		
		if (age<=13) {
		
			System.out.println("You are Children !!!");
			
		} else if (age > 13 && age < 18) {
			System.out.println("You are Teenager !!!");
		
		} else if (age >= 18 && age < 60) {
			
			System.out.println("You are Adult !!!");
		
		} else if (age >= 60 && age < 100) {
			System.out.println("You are Senior !!!");
		
		} else if (age > 100) {
			System.out.println("You are Champion !!!");
		
		
		} else {
			
			System.out.println("You are Champion !!!");	
		}
		

	}

}
