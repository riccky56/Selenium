package arrays;

// Class declaration that groups the related example logic in one place.
public class printconsecutive {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// Store text data that will be processed by the program logic.
		String a = "RahulGuptaistester";
		// Store text data that will be processed by the program logic.
		String b= "12345523456@&^%";
		// Use StringBuilder to build the final string efficiently.
		StringBuilder sb = new StringBuilder();

		// Initialize a variable that will be used in the logic.
		int i=0;
		// Initialize a variable that will be used in the logic.
		int len1 = a.length();
		// Initialize a variable that will be used in the logic.
		int len2 = b.length();

		// Continue looping while the given condition remains true.
		while(i<len1 || i<len2) {
			// Check the condition before deciding whether this block should run.
			if(i<len1) {
				// Append the current value to the growing result.
				sb.append(a.charAt(i));
			}
			// Check the condition before deciding whether this block should run.
			if(i<len2) {
				// Append the current value to the growing result.
				sb.append(b.charAt(i));
			}
			i++;
		}
		// Display information to the console for the user.
		System.out.println(sb.toString());

	}
}
