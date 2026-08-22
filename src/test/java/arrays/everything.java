package arrays;

// Class declaration that groups the related example logic in one place.
public class everything {

	// Main method where program execution starts.
	public static void main(String[] args) {
		
		// Store text data that will be processed by the program logic.
		String a = "Test1233Gtsag!@#$dwdb1234";
		
		// Store text data that will be processed by the program logic.
		String letters ="";
		// Store text data that will be processed by the program logic.
		String digit ="";
		// Store text data that will be processed by the program logic.
		String special ="";
		// Loop through each element one by one.
		for( char c :a.toCharArray()) {
			
			// Check the condition before deciding whether this block should run.
			if(Character.isLetter(c)) {
				// Update the variable based on the current calculation.
				letters = letters + c;
			}else if(Character.isDigit(c)) {
				// Update the variable based on the current calculation.
				digit = digit + c;
			}else {
				// Update the variable based on the current calculation.
				special = special+c;
			}
			
		}
		// Display information to the console for the user.
		System.out.println("Printed Letters : " +letters);
		// Display information to the console for the user.
		System.out.println("Printed Letters : " +digit);
		// Display information to the console for the user.
		System.out.println("Printed specials : " +special);

	}

}
