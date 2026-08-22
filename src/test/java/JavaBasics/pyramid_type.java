package JavaBasics;

// Class declaration that groups the related example logic in one place.
public class pyramid_type {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = 1;
		// Loop through the data using an index or counter.
		for (int i = 0; i<=4; i++) {

			// Loop through the data using an index or counter.
			for (int j = 1; j<=i; j++) {

				// Display information to the console for the user.
				System.out.print(k);
				// Display information to the console for the user.
				System.out.print("\t");
				k++;
			}

			// Display information to the console for the user.
			System.out.println("");
		}
	}
}
