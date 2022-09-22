package Assignment_4;

public class Assignment4_1 {
	//Write a user program using encapsulation that contains the username, 
	//password, email, first and last names of a user of our application. Display the user information in console output?

	private String username = "Assingment4_1";
	
	private int password = 1234;
	
	private String email = "assignment4_4321@gmail.com";
	
	private String firstName = "Led";
	
	private String lastName = "Zeppelin";
		
	
public void setUserName(String value) {
		
		username = value;
}		
	public String getUserName() {
		
		return username;
	}
public void  setPassword(int value) {
	
	password = value;
}
public void setEmail (String value) {
	
	email = value;
}
public String getEmail() {
	
	return email;
}

public void setFirstName(String value) {
	
	firstName = value;
	
}
public String getFirstName() {
return firstName; 
}

	public static void main(String[] args) {
	
		Assignment4_1 myObj = new Assignment4_1();
		myObj.setUserName("Imtiaz");
		System.out.println("Username : " + myObj.getUserName());
		myObj.setPassword(123456);
		myObj.setEmail("imtiaz.anu@gmail.com");
		System.out.println("Email Address : " + myObj.getEmail());
		myObj.setFirstName("Rolling Stones");
		System.out.println("First Name : " + myObj.getFirstName());
		
		
		
	}

}
