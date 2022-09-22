package Assignment_4;

//Write a method which return count of duplicate value from a array

public class Assignment4_3 {

	public static void main(String[] args) {
		int [] array = new int [] {1, 3, 2, 3, 4, 4, 5, 6, 6, 7, 8, 69, 96, 69};
		System.out.print("Duplicate Value in Array : ");
		
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j])
					System.out.print(" " + array[j]);
			}
			
		}

	}

}
