package interview;

import java.util.HashMap;
import java.util.Map;

// Class declaration that groups the related example logic in one place.
public class CharFrequency {
	    // Main method where program execution starts.
	    public static void main(String[] args) {
	        // Store text data that will be processed by the program logic.
	        String str = "automationtoolsweuse";
	        // Create a HashMap to store keys with their counts or mapped values.
	        Map<Character, Integer> map = new HashMap<>();

	        // Loop through each element one by one.
	        for (char c : str.toCharArray()) 
	        {
	            // Store or update the current value in the map.
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }

	        // Read or store the current character needed for processing.
	        char maxChar = ' ';
	        // Initialize a variable that will be used in the logic.
	        int maxFreq = 0;
           
	        // Loop through each element one by one.
	        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
	        	
	            // Check the condition before deciding whether this block should run.
	            if (entry.getValue() > maxFreq ) 
	            {
	            	
	                maxFreq = entry.getValue();
	                maxChar = entry.getKey();
	                
	            }
	        }

	        // Display information to the console for the user.
	        System.out.println("Frequencies: " + map);
	        // Display information to the console for the user.
	        System.out.println("Most frequent: " + maxChar + " = " + maxFreq);
	    }
	}

		
