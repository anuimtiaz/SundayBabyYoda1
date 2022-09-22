package Class4_Sunday5thJune;

import java.util.HashMap;
import java.util.HashSet;

public class HashMap_Practice {

	public static void main(String[] args) {
		
		
		HashMap <String, String> Capital = new HashMap <String, String>();
		
		Capital.put("Bangladesh", "Dhaka");
		Capital.put("England", "London");
		Capital.put("America", "Washington");
		Capital.put("Portugal", "Lisbon");
		Capital.put("Spain", "Madrid");
		Capital.put("India", "Mumbai");
		
		System.out.println("Hashmap Value: Capital " + Capital.get("Spain"));
		
		
		HashSet<String> Car = new HashSet<String>();
		
		Car.add("BMW");
		Car.add("Audi");
		Car.add("Benz");
		Car.add("Toyota");
		
		System.out.println("Hashset value " + Car);
		

	}

}


