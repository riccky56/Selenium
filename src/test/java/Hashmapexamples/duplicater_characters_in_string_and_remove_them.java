package Hashmapexamples;

import java.util.Arrays;
import java.util.LinkedHashSet;

// Class declaration that groups the related example logic in one place.
public class duplicater_characters_in_string_and_remove_them {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "cabbage";

		LinkedHashSet<Character> set = new LinkedHashSet<>();

		// Loop through each element one by one.
		for (char c : a.toCharArray()) {
			// Add the current value into the collection.
			set.add(c);
		}
		// Display information to the console for the user.
		System.out.print(set);

		// Display information to the console for the user.
		System.out.println("");
		// Store text data that will be processed by the program logic.
		String b = "";
		// Loop through each element one by one.
		for (char c : set)
		{		
			// Update the variable based on the current calculation.
			b= b+c;

		}
   
		// Display information to the console for the user.
		System.out.print(b);
	}
}
