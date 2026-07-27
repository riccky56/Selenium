package allarraysquestions;

import java.util.*;

public class RemoveDuplicatesExample {

	public static void main(String[] args) {

		// example sorted array with duplicate values
		int[] arr = { 1, 1, 2, 2, 2, 3, 4, 4 };

		System.out.println("Original array: " + Arrays.toString(arr));

		if (arr.length == 0) {
			System.out.println("Array is empty, nothing to do.");
			return;
		}

		// slow = last confirmed unique position
		int slow = 0;

		// fast = scout that checks every element ahead
		for (int fast = 1; fast < arr.length; fast++) {
			if (arr[fast] != arr[slow]) {
				slow++;
				arr[slow] = arr[fast];
			}
		}

		int newLength = slow + 1;

		// print only the unique part of the array (first newLength elements)
		int[] uniquePart = Arrays.copyOf(arr, newLength);

		System.out.println("New length: " + newLength);
		System.out.println("Array after removing duplicates: " + Arrays.toString(uniquePart));
	}
}
