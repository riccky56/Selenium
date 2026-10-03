package Hashmapexamples;

import java.util.*;

// Class declaration that groups the related example logic in one place.
public class remove_space_from_given_string {

	// Main method where program execution starts.
	public static void main(String[] args) {
		
		// Scanner is used to read a full line of text from the user.
		Scanner scanner = new Scanner(System.in);

		// Ask the user to enter a string that may contain spaces.
		System.out.print("Enter a string with spaces: ");

		// Read the complete input line including spaces.
		String input = scanner.nextLine();

		// Call the helper method to remove spaces from the input string.
		String stringWithoutSpaces = removeSpaces(input);

		// Print the final string after spaces are removed.
		System.out.println("String without spaces: " +
				stringWithoutSpaces);
	}

	// This method creates a new string by skipping space characters.
	public static String removeSpaces(String str) {
		// StringBuilder is used because it is efficient for repeated string appends.
		StringBuilder result = new StringBuilder();

		// Loop through every character in the given string.
		for (int i = 0; i < str.length(); i++) {
			// Append only non-space characters to the result.
			if (str.charAt(i) != ' ') {
				// Append the current value to the growing result.
				result.append(str.charAt(i));
			}
		}

		// Convert StringBuilder back to String and return it.
		return result.toString();
	}
}
