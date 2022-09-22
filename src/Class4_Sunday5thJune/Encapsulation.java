package Class4_Sunday5thJune;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method

	private int ssn = 7467363;				//Write only
	
	private String username = "ashik69";    //Read only
	
	private String name = "rasel";			//Write & Read
	
	
	public void setSSN(int value) {			//Set the data - Write/Update
		ssn = value;
		
	}
	public String getUsername() {				//Get the data - Read
		
		return username;
	}
	
	public void setName(String value) {		//Set the data - Write/Update
		name = value;
		
	}
	
	public String getName() {				//Get the data - Read
		return name;
		
	}
	public static void main(String[] args) {

	Encapsulation obj = new Encapsulation();
	obj.setSSN(1928292);
	
	System.out.println("Username : " + obj.getUsername());
	
	obj.setName("Rishi");
	System.out.println("Name : " + obj.getName());
	
	
	

	}

}
