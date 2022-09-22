package Class4_Sunday5thJune;

public class InterfacePracticeAtHome_Implementation implements InterfacePracticeAtHome{

	public static void main(String[] args) {
		InterfacePracticeAtHome_Implementation myObj = new InterfacePracticeAtHome_Implementation();
		System.out.println("Car Brand : " + myObj.iCarBrand());
		System.out.println("Car Series : " + myObj.iCarName());
		myObj.iDoor();
		System.out.println("Number of Wheel in the Car : " + myObj.iWheel());
		System.out.println("Number of Seat in the Car : " + myObj.iSeat());
		myObj.iLight();
	}
	public String iCarBrand() {
	String carBrand= "BMW";
	return carBrand;
	}
	public String iCarName() {
	String carSeries = "X5";
	return carSeries;
	}
	public void iDoor() {
	int numDoor = 10;
	System.out.println("Number of Car Door : " + numDoor);
	}
	public int iWheel() {
	int numWheel = 4;
	return numWheel;
	}
	public int iSeat() {
	int numSeat = 7;
	return numSeat;
	}
	public void iLight() {
	int numLight = 8;
	System.out.println("Number of Light in the Car : " + numLight);
	}
}
