package allarraysquestions;

import java.util.*;

// Class declaration that groups the related example logic in one place.
public class squareOfSortedArrayofElements {

	// Main method where program execution starts.
	public static void main(String[] args) {

		// Declare and initialize an integer array used in this example.
		int[] arr = { -11,-8, -4, -3, -1, 0, 2, 3, 6, 7,9,13 };


		        // Declare and initialize an integer array used in this example.
		        int[] result = new int[arr.length];

		        // Initialize a variable that will be used in the logic.
		        int left = 0;
		        // Initialize a variable that will be used in the logic.
		        int right = arr.length - 1;
		        // Initialize a variable that will be used in the logic.
		        int position = arr.length - 1;

		        // Continue looping while the given condition remains true.
		        while (left <= right) {
		            // Initialize a variable that will be used in the logic.
		            int leftSquare = arr[left] * arr[left];
		            // Initialize a variable that will be used in the logic.
		            int rightSquare = arr[right] * arr[right];

		            // Check the condition before deciding whether this block should run.
		            if (leftSquare > rightSquare) {
		                result[position] = leftSquare;
		                left++;
		            } else {
		                result[position] = rightSquare;
		                right--;
		            }

		            position--;
		        }

		        // Display information to the console for the user.
		        System.out.println("Original array: " + Arrays.toString(arr));
		        // Display information to the console for the user.
		        System.out.println("Sorted squares: " + Arrays.toString(result));
		    }
		}
