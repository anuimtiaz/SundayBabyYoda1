package Class4_Sunday5thJune;

import java.util.HashMap;

public class Array_Hashmap {

	public static void main(String[] args) {
		
		
		//Array store multiple value using index
		
		int age = 30;
		
		int[] ageYoda = new int []{30, 24, 60, 32, 55, 48, 56};
		
		//Array Index 				[0] [1] [2] [3] [4] [5] 
		
		
		System.out.println("Array Value " + age);
		
		System.out.println("Array Value " + ageYoda[2]);
		
		System.out.println("Array Value " + ageYoda.length);
		
		
		
		//Multi-dimentional Array
		
		int[][] ageYoda2D = {
				{30, 24, 60, 32, 55}, //[0][0] [0][1] [0][2] [0][3] [0][4]
				
				{5, 49, 11}};   	  //[1][0] [1][1] [1][2]
		
		System.out.println("2D Array Value " + ageYoda2D[1][2]);
		
		for (int i=0; i<ageYoda2D.length; i++) {
			for (int j=0; j<ageYoda2D[i].length; j++) {
				System.out.println(ageYoda2D[i][j] + " ");
	
			}
			}
	//Hasmap store multiple data using key-value pair, Implementation of Map interface
		
		HashMap <String, Integer> Student = new HashMap <String, Integer>();
		
		Student.put("Azad", 30);
		Student.put("Aastha", 41);
		Student.put("Ashik", 33);
		Student.put("Rishi", 21);
		Student.put("Jafrin", 47);
		Student.put("Rasel", 89);
		
		System.out.println("Hashmap Value: Student Age " + Student.get("Azad"));
		System.out.println("Hashmap Length: Size " + Student.size());
		
		
	}
}
			
	
		
		
	




