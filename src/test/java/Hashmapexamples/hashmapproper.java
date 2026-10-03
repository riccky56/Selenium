package Hashmapexamples;

import java.util.HashMap;
import java.util.Map;

// Class declaration that groups the related example logic in one place.
public class hashmapproper {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// Input string whose characters will be counted.
		String A = "rahul shetty academy";

		// This HashMap stores each character and the number of times it appears.
		HashMap<Character, Integer> B = new HashMap<>();

		// First approach: use getOrDefault() to simplify frequency counting.
		for (char c : A.toCharArray()) {
			// Skip blank spaces so they are not counted as characters.
			if (c != ' ')

				// If key exists, its count is returned; otherwise default 0 is used.
				// Then 1 is added to update the frequency.
				B.put(c, B.getOrDefault(c, 0) + 1);

		}

		// Print the final character-frequency map.
		System.out.println(B);

		// Loop through each map entry and print character with its count.
		for (Map.Entry<Character, Integer> entry : B.entrySet()) {

			// Display information to the console for the user.
			System.out.println(entry.getKey() + " === " + entry.getValue());

		}

		// Same input used again to demonstrate another manual counting approach.
		String d = "rahul shetty academy";
		// Create a HashMap to store keys with their counts or mapped values.
		Map<Character, Integer> hash_map = new HashMap<>();

		// Second approach: check manually whether the character is already present.
		for (char c : d.toCharArray()) {

			// If the character already exists, increase its current count.
			if (hash_map.containsKey(c))
			{
				// Store or update the current value in the map.
				hash_map.put(c, hash_map.get(c) + 1);
			}

			// If the character appears for the first time, add it with count 1.
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
