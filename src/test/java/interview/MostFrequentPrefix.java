package interview;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentPrefix {

	public static void main(String[] args) {
		String[] arr = { "testcase", "testdata", "testing", "team", "test" };

		Map<String, Integer> map = new HashMap<>();

		for (String word : arr) {
			// Loop through the data using an index or counter.
			for (int i = 1; i <= word.length(); i++) {
				// Store text data that will be processed by the program logic.
				String prefix = word.substring(0, i);
				
				// Store or update the current value in the map.
				map.put(prefix, map.getOrDefault(prefix, 0) + 1);
			}
		}

		// Store text data that will be processed by the program logic.
		String mostFreqPrefix = "";
		// Initialize a variable that will be used in the logic.
		int maxCount = 0;

		// Loop through each element one by one.
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			// Check the condition before deciding whether this block should run.
			if (entry.getValue() > maxCount) {
				mostFreqPrefix = entry.getKey();
				maxCount = entry.getValue();
			}
		}

		// Display information to the console for the user.
		System.out.println("Most frequent prefix: " + mostFreqPrefix);
	}
}
