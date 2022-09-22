package Class4_Sunday5thJune;

public class Class_5_AbstractClass_Implementation extends Class_5_AbstractClass{

	public static void main(String[] args) {
		Class_5_AbstractClass_Implementation myObj = new Class_5_AbstractClass_Implementation();
		myObj.iDoor();
		System.out.println("Number of Wheel in Car : " + myObj.iWheel());
		System.out.println("Colour of the Car : " + myObj.iColour());
		myObj.iSeat();
		myObj.iMirror();
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
public void iMirror() {
	int mirror = 2;
	System.out.println("Number of Mirror : " + mirror);	
}
}
