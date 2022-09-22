package Assignment_4;



import java.util.Scanner;

//White a method which will reverse a string

public class Assignment4_2 {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
{
	
	String str;
	String revstr = "";
	
	System.out.print("Entre a string : ");
	
	str = input.nextLine();
	
	for (int i = str.length() - 1; i >=0; i--){
		
		revstr = revstr + str.charAt(i);
	}
	System.out.print("The reverse string is : " + revstr);
	
}
	
	}
}





