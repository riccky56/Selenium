package JavaPractice;


// Class declaration that groups the related example logic in one place.
public class swap_String {

	// Main method where program execution starts.
	public static void main(String[] args) {


		// Store text data that will be processed by the program logic.
		String a = "rahul";
		// Store text data that will be processed by the program logic.
		String b = "gupta";

		// Update the variable based on the current calculation.
		a = a + b;
		b = a.substring(0,a.length() - b.length());
		a = a.substring(b.length());

		// Display information to the console for the user.
		System.out.println("String1 = " +a);
		// Display information to the console for the user.
		System.out.println("String2 = " +b);
	}

}
