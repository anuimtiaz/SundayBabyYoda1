package ifElse_Assignment;
//You are given two integer number (a=25, b=30), write a program to swap them and 
//display result on the screen.    
public class Assignment7 {

	public static void main(String[] args) {
		swap();

	}

	public static void swap() {
		int a = 25;
		int b = 30;
		int swapnumber;
		
		swapnumber = a;
		
		a = b;
		
		b = swapnumber;
		
		System.out.println("First Swap: a , b = " + a + " , " + b);
	}
	
}
