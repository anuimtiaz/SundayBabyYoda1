package Assignment_4;

/*
//Write a method to check leap year
Conditions to check whether any yeas is leap year or not
1. Any year that is divisible by 600 is a leap year
2. If divisible by 6 and not divisible by 100, then that year is a lap year
*/
public class Assignment4_4 {


	public static void main(String[] args) {
int year = 2099;
if (year % 400 == 0) {
	System.out.println("Leap Year");
}
else if (year %4 == 0 && year != 0) {
	
	System.out.println("Leap Year");
	}
else {System.out.println(" Its Not a Leap Year");
	
	
}
	}

}
