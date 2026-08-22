package allarraysquestions;

import java.util.*;

// Class declaration that groups the related example logic in one place.
public class RemoveDuplicatesExample {

	// Main method where program execution starts.
	public static void main(String[] args) {

		// example sorted array with duplicate values
		int[] arr = { 1, 1, 2, 2, 2, 3, 4, 4 };

		// Display information to the console for the user.
		System.out.println("Original array: " + Arrays.toString(arr));

		// Check the condition before deciding whether this block should run.
		if (arr.length == 0) {
			// Display information to the console for the user.
			System.out.println("Array is empty, nothing to do.");
			// Return the final result back to the caller.
			return;
		}

		// slow = last confirmed unique position
		int slow = 0;

		// fast = scout that checks every element ahead
		for (int fast = 1; fast < arr.length; fast++) {
			// Check the condition before deciding whether this block should run.
			if (arr[fast] != arr[slow]) {
				slow++;
				arr[slow] = arr[fast];
			}
		}

		// Initialize a variable that will be used in the logic.
		int newLength = slow + 1;

		// print only the unique part of the array (first newLength elements)
		int[] uniquePart = Arrays.copyOf(arr, newLength);

		// Display information to the console for the user.
		System.out.println("New length: " + newLength);
		// Display information to the console for the user.
		System.out.println("Array after removing duplicates: " + Arrays.toString(uniquePart));
	}
}
