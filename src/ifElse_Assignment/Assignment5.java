package ifElse_Assignment;

public class Assignment5 {
//Write a program in Java to display the multiplication table of (eight)8.
	public static void main(String[] args) {
		multiplicationValue();
		
		
		for (int i = 1; i <= 8; i++){
			System.out.println("Value = " + i + "x" + 8 + "=" + i*8);
			
		}

	}

	public static void multiplicationValue() {
		
		for (int i = 8; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				int multiplicationValue = i*j;
				System.out.println("Value = " + multiplicationValue);
				
				
			}
		}
	}
	
	
	
}

