package JavaPractice;

// Class declaration that groups the related example logic in one place.
public class reverse_string_without_spaces {

	// Main method where program execution starts.
	public static void main (String[] args) {


		// Store text data that will be processed by the program logic.
		String a = "reversing this one";
		// Store text data that will be processed by the program logic.
		String b = "";

		// Loop through the data using an index or counter.
		for (int i = a.length()-1; i>=0; i--) {
			// Check the condition before deciding whether this block should run.
			if (a.charAt(i) != ' ') {

				// Update the variable based on the current calculation.
				b = b + a.charAt(i);
			}

		}
		
		// Display information to the console for the user.
		System.out.println(b);

	}

}
