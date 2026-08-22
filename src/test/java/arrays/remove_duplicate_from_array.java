package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// Class declaration that groups the related example logic in one place.
public class remove_duplicate_from_array {

	// Main method where program execution starts.
	public static void main(String[] args) {

		// Declare and initialize an integer array used in this example.
		int[] array = {5, 2, 9, 2, 6, 4, 1, 6, 2, 5};

		//remove duplicate and sort
		
		Set<Integer> set = new HashSet<>();
		// Loop through each element one by one.
		for(int num : array) {
			// Add the current value into the collection.
			set.add(num);
		}

		System.out.println(set); //prints as a set

		int[] result = new int[set.size()];   //convert set to array

		// Initialize a variable that will be used in the logic.
		int i = 0;
		// Loop through each element one by one.
		for(int b : set) {

			result[i]=b;       //way to add 
			i++;

		}
           
		// Display information to the console for the user.
		System.out.println("Array sorted without duplicates: " + Arrays.toString(result));

	}
}
