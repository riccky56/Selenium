package JavaPractice;

// Class declaration that groups the related example logic in one place.
public class Palindrome {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String a = "madam";
		// Store text data that will be processed by the program logic.
		String b = "";

		// Loop through the data using an index or counter.
		for (int i = a.length()-1; i>= 0; i--) {

			// Update the variable based on the current calculation.
			b = b + a.charAt(i);

		}

		// Display information to the console for the user.
		System.out.println(b);

		// Check the condition before deciding whether this block should run.
		if(a.equalsIgnoreCase(b)) {
			// Display information to the console for the user.
			System.out.println("String "  +a+ " is a palindrome");
		}
		// Execute this block when the earlier conditions do not match.
		else {
			// Display information to the console for the user.
			System.out.println("String "  +a+ " is not a palindrome");
		} 
	}

}
