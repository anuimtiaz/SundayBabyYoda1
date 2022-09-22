package ifElse_Assignment;

public class Assignment3 {

	//Write two java functions which will return two different integer values, write a 
	//program to compare those numbers and send message that one number is bigger 
	//than other. (hints: using if..else)
	
	public static void main(String[] args) {
		
		int i = 101;
		
		if (i <= 70) {
			
			System.out.println(" C ");
		
		} else {
			if (i >= 80 && i <= 100) {
			
			System.out.println(" A ");
			
			} else {
				System.out.println(" B ");
			}
		}

	}

}
