package interview;

import java.util.HashMap;
import java.util.Map;

// Class declaration that groups the related example logic in one place.
public class DuplicateChars {

	// Main method where program execution starts.
	public static void main(String[] args) {

		// Store text data that will be processed by the program logic.
		String str = "programming";
		// Create a HashMap to store keys with their counts or mapped values.
		Map<Character, Integer> map = new HashMap<>();

		// Loop through each element one by one.
		for (char c : str.toCharArray()) {
			// Store or update the current value in the map.
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		// Loop through each element one by one.
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			// Check the condition before deciding whether this block should run.
			if (entry.getValue() > 1) {
				// Display information to the console for the user.
				System.out.println("Duplicate: " + entry.getKey() + " repeated "+ entry.getValue());
			}
			
			
			
		}}}
