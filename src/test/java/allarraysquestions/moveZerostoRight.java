package allarraysquestions;

import java.util.Arrays;

// Class declaration that groups the related example logic in one place.
public class moveZerostoRight {

	// Main method where program execution starts.
	public static void main(String[] args) {

		// Declare and initialize an integer array used in this example.
		int[] arr = { 0, 1, 0, 3, 12, 0, 5, 0, 7 };

		// Display information to the console for the user.
		System.out.println("Original array: " + Arrays.toString(arr));

		// insertPos = next empty spot to place a non-zero number
		int nonzeroindex = 0;

		// first pass: pack all non-zero numbers to the front, keeping their order
		for (int i = 0; i < arr.length; i++) {
			// Check the condition before deciding whether this block should run.
			if (arr[i] != 0) {
				arr[nonzeroindex] = arr[i];
				nonzeroindex++;

			}
		}

		// second pass: fill whatever is left over with zeros
		while (nonzeroindex < arr.length) {

			arr[nonzeroindex] = 0;
			nonzeroindex++;
		}

		// Display information to the console for the user.
		System.out.println("Array after moving zeros to end: " + Arrays.toString(arr));

		// using two pointer approach to swap non-zero numbers to the front and zeros to
		// the back in a single pass
		int[] arr2 = { 0, 1, 4, 8, 4, 0, 5, 0, 2, 7, 8, 12, 0, 12, 16 };

		// Display information to the console for the user.
		System.out.println("Original array: " + Arrays.toString(arr2));

		// Initialize a variable that will be used in the logic.
		int j = 0;

		// single pass: swap non-zero numbers into the front, zeros drift back naturally

		for (int i = 0; i < arr2.length; i++) {
			// Check the condition before deciding whether this block should run.
			if (arr2[i] != 0) {
				// Initialize a variable that will be used in the logic.
				int temp = arr2[i];
				arr2[i] = arr2[j];
				arr2[j] = temp;
				j++;
			}
		}

		// Display information to the console for the user.
		System.out.println("Array after moving zeros to end (swap method): " + Arrays.toString(arr2));
	}
}
