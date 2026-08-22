package Hashmapexamples;
import java.util.HashMap;
import java.util.Set;
import java.util.*;
// Class declaration that groups the related example logic in one place.
public class Duplicate_Chars_In_String_Example {

	// Main method where program execution starts.
	public static void main(String[] args) {

		// Store text data that will be processed by the program logic.
		String a = " i am a tester working at cognizant";
		// Create a HashMap to store keys with their counts or mapped values.
		HashMap<Character, Integer> B = new HashMap<>();

		// Loop through each element one by one.
		for (char c : a.toCharArray() ) {
			// Check the condition before deciding whether this block should run.
			if (B.containsKey(c))
			{
				// Store or update the current value in the map.
				B.put(c, B.get(c) + 1);
			}
			// Execute this block when the earlier conditions do not match.
			else 
			{
				// Store or update the current value in the map.
				B.put(c, 1);
			}
		}
		// Display information to the console for the user.
		System.out.println(B);
		

		// Loop through each element one by one.
		for (char c :B.keySet() ) {
			// Check the condition before deciding whether this block should run.
			if (B.get(c) > 1) {

				// Display information to the console for the user.
				System.out.println( c + " got repeated times ->"  + B.get(c));
			}
		}
		// using iterator
		for( Map.Entry<Character, Integer> entry:B.entrySet()) {
           // Check the condition before deciding whether this block should run.
           if(entry.getValue()>1)
			// Display information to the console for the user.
			System.out.println(entry.getKey() + " === " + entry.getValue());

		}
		// Display information to the console for the user.
		System.out.println(B.keySet());
	}

}
