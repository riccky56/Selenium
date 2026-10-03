package Hashmapexamples;

import java.util.*;

// Class declaration that groups the related example logic in one place.
public class printonlyduplicates {

	// Main method where program execution starts.
	public static void main(String [] args) {
		
		// Input string from which duplicate characters will be found.
		String a = "Welcome to the coding class";

		// HashMap keeps track of each character and how many times it appears.
		HashMap<Character, Integer> hash_map = new HashMap<>();

		// Read every character from the string one by one.
		for (char c : a.toCharArray())
		{
			// If the character already exists, increase its count.
			if (hash_map.containsKey(c))
			{
				// Store or update the current value in the map.
				hash_map.put(c, hash_map.get(c) + 1);
			}

			// Otherwise add the character for the first time with count 1.
			else
			{
				// Store or update the current value in the map.
				hash_map.put(c, 1);
			}
		}
		
		// Print the full map so we can see the frequency of all characters.
		System.out.println(hash_map);

		// Loop through each map entry and print only the repeated characters.
		for(Map.Entry<Character, Integer> entry:hash_map.entrySet()) {
			// A value greater than 1 means that character is duplicated.
			if(entry.getValue()>1) {

				// Display information to the console for the user.
				System.out.println(entry.getKey()  + " : " + entry.getValue() );
			}
		}


	}



}
