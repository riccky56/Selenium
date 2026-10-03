package Hashmapexamples;

import java.util.*;

// Class declaration that groups the related example logic in one place.
public class occurence_of_characters {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// Input string used to count how many times each character appears.

		String A = "rahul shetty academy";

		// HashMap stores character-frequency pairs.
		HashMap<Character, Integer> B = new HashMap<>();

		// First approach: count characters using getOrDefault().
		for (char c : A.toCharArray()) {
			// Ignore spaces so only visible characters are counted.
			if (c != ' ')

				// Increase count of the current character by 1.
				// If it does not exist yet, start from 0 and then add 1.
				B.put(c, B.getOrDefault(c, 0) + 1);

		}

		// Print the complete character count map.
		System.out.println(B);

		// Print all unique characters stored as keys.
		System.out.println(B.keySet());

		// Second approach: build the frequency map manually using containsKey().
		String d = "rahul shetty academy";
		// Create a HashMap to store keys with their counts or mapped values.
		Map<Character, Integer> hash_map = new HashMap<>();

		// Loop through each character from the string.
		for (char c : d.toCharArray()) {
			// If the character already exists, increment its count.
			if (hash_map.containsKey(c))
			{
				// Store or update the current value in the map.
				hash_map.put(c, hash_map.get(c) + 1);
			}

			// Otherwise, store the character for the first time with count 1.
			else
			{
				// Store or update the current value in the map.
				hash_map.put(c, 1);
			}

		}

		// Print the result of the second counting approach.
		System.out.println(hash_map);
	}
}
