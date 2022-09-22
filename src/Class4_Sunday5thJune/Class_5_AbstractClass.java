package Class4_Sunday5thJune;

public abstract class Class_5_AbstractClass {

	//Abstract class has both abstract method and regular method
	//ABstract Method

public abstract void iDoor();
public abstract int iWheel();
public abstract String iColour();
public abstract void iSeat();
public abstract void iMirror();

//Regular Method

public void engine() {
	String eng = "V6";
	System.out.println("Car Engine : " + eng);
}

public void name() {
	String name = "BMW";
	System.out.println("Car Name : " + name);
}
public int van() {
	
	int vanNum = 1;
	return vanNum;

}
}

