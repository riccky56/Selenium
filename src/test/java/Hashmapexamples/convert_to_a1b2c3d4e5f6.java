package Hashmapexamples;

import java.util.HashMap;
import java.util.Map;

// Class declaration that groups the related example logic in one place.
public class convert_to_a1b2c3d4e5f6 {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// Store text data that will be processed by the program logic.
		String d = "abbcccddddeeeeeffffff";
		// Create a HashMap to store keys with their counts or mapped values.
		Map<Character,Integer> hashmap = new HashMap<>();
		
		// Loop through each element one by one.
		for (char c : d.toCharArray()) {
			if (hashmap.containsKey(c)) 			// && c!=' ' to remove space give this condition also
			{
				// Initialize a variable that will be used in the logic.
				int count = hashmap.get(c);
				count++;
				hashmap.replace(c, count);
	
			}

			else //if( c !=' ')to remove space from here also
			{
				// Store or update the current value in the map.
				hashmap.put(c, 1);
			}

		}
		// Display information to the console for the user.
		System.out.println(hashmap);
		
		// Loop through each element one by one.
		for(Character key:hashmap.keySet())
		{
			// Display information to the console for the user.
			System.out.print(key+ "" +hashmap.get(key));
		}

	}

}
