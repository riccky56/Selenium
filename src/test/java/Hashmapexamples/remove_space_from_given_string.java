package Hashmapexamples;

import java.util.*;

// Class declaration that groups the related example logic in one place.
public class remove_space_from_given_string {

	// Main method where program execution starts.
	public static void main(String[] args) {
		
		// Create a Scanner object to read input from the user.
		Scanner scanner = new Scanner(System.in);
		// Display information to the console for the user.
		System.out.print("Enter a string with spaces: ");
		// Store text data that will be processed by the program logic.
		String input = scanner.nextLine();
		// Store text data that will be processed by the program logic.
		String stringWithoutSpaces = removeSpaces(input);
		// Display information to the console for the user.
		System.out.println("String without spaces: " +
				stringWithoutSpaces);
	}
	// Helper method used to perform a specific part of the program logic.
	public static String removeSpaces(String str) {
		// Use StringBuilder to build the final string efficiently.
		StringBuilder result = new StringBuilder();
		// Loop through the data using an index or counter.
		for (int i = 0; i < str.length(); i++) {
			// Check the condition before deciding whether this block should run.
			if (str.charAt(i) != ' ') {
				// Append the current value to the growing result.
				result.append(str.charAt(i));
			}
		}
		// Return the final result back to the caller.
		return result.toString();
	}
}
