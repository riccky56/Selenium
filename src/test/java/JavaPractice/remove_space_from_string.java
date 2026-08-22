package JavaPractice;

// Class declaration that groups the related example logic in one place.
public class remove_space_from_string {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// Store text data that will be processed by the program logic.
		String a = "remove space from string";
		// Store text data that will be processed by the program logic.
		String b = "";
	  	//  String z = a.replace(" ", ""); one way to do remove spaces
		// System.out.println(z);

		for (int i = 0; i<= a.length()-1; i++){
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
