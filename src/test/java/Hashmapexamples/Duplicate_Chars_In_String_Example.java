package Hashmapexamples;

import java.util.HashMap;
import java.util.Map;

// Class declaration that groups the related example logic in one place.
public class Duplicate_Chars_In_String_Example {

	// Main method where program execution starts.
	public static void main(String[] args) {

		// Input string in which duplicate characters need to be identified.
		String a = " i am a tester working at cognizant";

		// HashMap stores each character as key and its occurrence count as value.
		HashMap<Character, Integer> B = new HashMap<>();

		// Convert the string into characters and count how many times each appears.
		for (char c : a.toCharArray() ) {
			// If character already exists in map, increase its count by 1.
			if (B.containsKey(c))
			{
				// Store or update the current value in the map.
				B.put(c, B.get(c) + 1);
			}
			// If character appears for the first time, store it with count 1.
			else 
			{
				// Store or update the current value in the map.
				B.put(c, 1);
			}
		}

		// Print the complete map showing every character and its frequency.
		System.out.println(B);
		

		// Loop through keys and print only those characters whose count is more than 1.
		for (char c :B.keySet() ) {
			// Check the condition before deciding whether this block should run.
			if (B.get(c) > 1) {

				// Display information to the console for the user.
				System.out.println( c + " got repeated times ->"  + B.get(c));
			}
		}
		// Another way to print duplicate characters using entrySet().
		// entrySet() gives both key and value together in one object.
		for( Map.Entry<Character, Integer> entry:B.entrySet()) {
           // Check the condition before deciding whether this block should run.
           if(entry.getValue()>1)
			// Display information to the console for the user.
			System.out.println(entry.getKey() + " === " + entry.getValue());

		}
		// Print all distinct characters stored as keys in the map.
		System.out.println(B.keySet());
	}

}
