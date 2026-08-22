package Hashmapexamples;
import java.util.*;

// Class declaration that groups the related example logic in one place.
public class arraycharcounts {

	    // Main method where program execution starts.
	    public static void main(String[] args) {

	        // example array with duplicate values
	        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
	        
	        // Declare and initialize an integer array used in this example.
	        int[] arr2 = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

	        // notebook to store number -> how many times it showed up
	        Map<Integer, Integer> freq = new HashMap<>();
	        
	        // Create a HashMap to store keys with their counts or mapped values.
	        Map<Integer, Integer> simpleMap = new HashMap<>();

	        // go through the array one number at a time
	        for (int x : arr) {
	            freq.merge(x, 1, Integer::sum);
	            
	        }

	        // print the final result
	        System.out.println("Array: " + Arrays.toString(arr));
	        // Display information to the console for the user.
	        System.out.println("Frequency count: " + freq);
	        
	        // Loop through each element one by one.
	        for(int y: arr) {
	        	// Check the condition before deciding whether this block should run.
	        	if(simpleMap.containsKey(y)) {
	        		// Store or update the current value in the map.
	        		simpleMap.put(y, simpleMap.get(y)+1);
	        	}  	else {
	        		
	        		// Store or update the current value in the map.
	        		simpleMap.put(y, 1);
	        	}
	        }
	        // Display information to the console for the user.
	        System.out.println("Frequency count: " + simpleMap);
	        
	    }
	}

