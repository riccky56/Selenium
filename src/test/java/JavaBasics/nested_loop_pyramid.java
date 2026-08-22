package JavaBasics;

// Class declaration that groups the related example logic in one place.
public class nested_loop_pyramid {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		/* 1 2 3 4
		 * 5 6 7
		 * 8 9
		 * 10
		 */
		int k = 1;

		// Loop through the data using an index or counter.
		for(int i = 0; i<=4; i++) {
			
			// Loop through the data using an index or counter.
			for(int j = 1; j<=4-i; j++) {
				// Display information to the console for the user.
				System.out.print(k);
				// Display information to the console for the user.
				System.out.print("\t");
				k++;
				
			}
		// Display information to the console for the user.
		System.out.println(" ");
		
	}

	}}
