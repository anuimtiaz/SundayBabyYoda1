package IfElse;

public class Class_2_Loops extends SwitchCase {
	/* Types of loops
	 1. For Loop
	 2. While Loop
	 3. Do While Loop
	 4. Infinite Loop
	 */
	
	//Ashik Prodhan
	
	public static void main(String[] args) {
		practiceForLoop();
//		practiceWhileLoop();
//		practiceDoWhile();
//		practiceInfiniteLoop();
//		practiceNestedForLoop();
//		multipicationTable();
	
	}

	public static void practiceForLoop() {			//For Loop - Do again and again upto upper limit
													//Initialize variables
													//Setting Lower limit, Upper Limit, Increment or decrement
		int i;										//Statement
		
		for(i=1; i<80; i+=3) {
			System.out.println("For Loops Number =" + i);
			
		}
	}


	public static void practiceWhileLoop() {						//While Loop - Do again and again upto condition match 
		int i = 1;													//Initialize variables
		while(i<10) {												//Setting condition 
		System.out.println("While Loops Number =" + i);				//Statement
		i++;														//Increment or decrement
			
		}	
}
	
	public static void practiceDoWhile() {							//Do While Loop - Do action and match condition
		int i = 1;													//Initialize variables
		do {
			System.out.println("Do-While Loops Number =" + i);		//Statement
			i++;													//i++
		} while (i<=10);											//Checking Condition
		
	}
	public static void practiceInfiniteLoop() {						//Initialize variables
		int i;														//Setting no upper limit
		for(i=1;  ; i++) {											//Statement
			System.out.println("Infinite Loop Number =" + i);
		}
	}
	
	public static void practiceNestedForLoop() {								//Nated Loop - loop inside another loop
		int i;																	//Initialize variables i
		int j;																	//Initialize variables j
		for(i=1; i<=10; i++) {													//First loop for i
			for(j=1; j<=10; j++) {												//Second loop for j
				System.out.println("Nested Loops Number =" + i + ":" + j);		//Statement for j loop
			}
			System.out.println("Increase value of i -> " + i);					//Statement for i loop 
		}
	}
	
	
	public static void multipicationTable() {
		for (int row = 1; row <=10; row++) {
			for (int col = 1; col <= 10; col++) {
				int MultiplicationTable = row * col;
				System.out.print(MultiplicationTable + " ");
			}
			System.out.println(" ");
		}
	}
	
}





