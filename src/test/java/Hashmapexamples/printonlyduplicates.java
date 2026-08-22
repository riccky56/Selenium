package Hashmapexamples;

import java.util.*;

// Class declaration that groups the related example logic in one place.
public class printonlyduplicates {

	// Main method where program execution starts.
	public static void main(String [] args) {
		
		// Store text data that will be processed by the program logic.
		String a = "Welcome to the coding class";

		// Create a HashMap to store keys with their counts or mapped values.
		HashMap<Character, Integer> hash_map = new HashMap<>();

		// Loop through each element one by one.
		for (char c : a.toCharArray())
		{
			// Check the condition before deciding whether this block should run.
			if (hash_map.containsKey(c))
			{
				// Store or update the current value in the map.
				hash_map.put(c, hash_map.get(c) + 1);
			}

			// Execute this block when the earlier conditions do not match.
			else
			{
				// Store or update the current value in the map.
				hash_map.put(c, 1);
			}
		}
		
		// Print the hashmap object which gives the number of each character in String.
		System.out.println(hash_map);

		// Loop through each element one by one.
		for(Map.Entry<Character, Integer> entry:hash_map.entrySet()) {
			// Check the condition before deciding whether this block should run.
			if(entry.getValue()>1) {

				// Display information to the console for the user.
				System.out.println(entry.getKey()  + " : " + entry.getValue() );
			}
		}


	}



}
