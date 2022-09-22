package ifElse_Assignment;
//10. Write a Java program to convert temperature from Fahrenheit to Celsius degree. 



public class Assignment_10 {

	public static void main(String[] args) {
		
		float Fahrenheit , Celsius;
		
		Fahrenheit = 98;
		
		Celsius = 32;
		
		System.out.println("Temperature in Celsius is = " + Celsius);
		
		
		
		Celsius = ((Fahrenheit-32)*5)/9;

		Fahrenheit = Celsius * (9/5) + 32;
		
		
		
		System.out.println("Temperature in Fahrenheit is = " + Fahrenheit);
	}

}
