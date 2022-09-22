package Class4_Sunday5thJune;

public class Class_5_Interface_Implementation implements Class_5_Interface{

	public static void main(String[] args) {
		Class_5_Interface_Implementation myObj = new Class_5_Interface_Implementation();
		myObj.iDoor();
		System.out.println("Number of Wheel in Car : " + myObj.iWheel());
		System.out.println("Colour of the Car : " + myObj.iColour());
		myObj.iSeat();
	}
	public void iDoor() {
		int numDoor = 2;
		System.out.println("Number of the Door in the Car : " + numDoor);	
	}
	public int iWheel() {
		int numWheel = 4;
		return numWheel;
	}
	public String iColour() {
		String colour = "Red";
		return colour;
	}
	public void iSeat() {
		int numSeat = 5;
		System.out.println("Number of Seats : " + numSeat);	
	}

	
	
	/*
	Parent					(Keyword)					(Child)
	 Class					Extends						Class
	 Abstract Class			Extends						Class
	 Interface				Implements					Class
	 Interface				Extends						Interface


*/


}


