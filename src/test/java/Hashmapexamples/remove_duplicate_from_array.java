package Hashmapexamples;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

// Class declaration that groups the related example logic in one place.
public class remove_duplicate_from_array {

	// Main method where program execution starts.
	public static void main(String[] args) {

		// Original integer array containing duplicate values.
		int[] array = {5, 2, 9, 2, 6, 4, 1, 6, 2, 5};


		// TreeSet stores only unique values and automatically keeps them in sorted order.
		Set<Integer> set = new TreeSet<>();

		// Read each number from the array one by one.
		for(int num : array) {
			// Add the number into the set.
			// If the number is already present, Set ignores the duplicate.
			set.add(num);
		}

		// Display the unique sorted values directly as a Set.
		System.out.println(set);

		// Create a new array with the exact size needed to hold the unique values.
		int[] result = new int[set.size()];

		// Index variable used to place elements into the result array.
		int i = 0;

		// Loop through each sorted unique element from the set.
		for(int b : set) {

			// Store the current set value into the array at index i.
			result[i]=b;

			// Move to the next index for the upcoming value.
			i++;

		}

		// Print the final array after removing duplicates and sorting the values.
		System.out.println("Array sorted without duplicates: " + Arrays.toString(result));

	}
}
