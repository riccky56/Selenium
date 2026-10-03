package Hashmapexamples;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

// Class declaration that groups the related example logic in one place.
public class removeduplicateusingtreesetinarray {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// Original array containing duplicate values.

		int [] a = {3,4,2,1,4,2,3,4,4,2,5,5,6,7,7,5,8,9,0,12,45,11,34};

		// TreeSet removes duplicates automatically and stores numbers in sorted order.
		Set <Integer> set= new TreeSet<>();

		// Add each array value into the set.
		// Duplicate numbers are ignored by the Set.
		for(int s : a) {
			// Add the current value into the collection.
			set.add(s);
		}

		// Print the unique sorted values as a Set.
		System.out.println(set);


		// Create a new array of exact size to store unique sorted values.
		int[] result = new int[set.size()];

		// Index variable used to fill the result array.
		int i = 0;

		// Copy each element from the set into the array.
		for(int b : set) {

			// Store the current set value at the current index.
			result[i] = b;

			// Move to the next array index.
			i++;
		}

		// Print the final array after sorting and duplicate removal.
		System.out.println("Array sorted without duplicates: " + Arrays.toString(result));
		
	}}

