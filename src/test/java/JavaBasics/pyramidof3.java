package JavaBasics;

// Class declaration that groups the related example logic in one place.
public class pyramidof3 {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		// Loop through the data using an index or counter.
		for (int i = 0; i<=9; i+=3) {
			
			// Loop through the data using an index or counter.
			for (int j = 3; j<=i; j+=3) {
				// Display information to the console for the user.
				System.out.print(k);
				// Display information to the console for the user.
				System.out.print("\t");
				k+=3;
			}
			// Display information to the console for the user.
			System.out.println(" ");
		}
		
	}

}
