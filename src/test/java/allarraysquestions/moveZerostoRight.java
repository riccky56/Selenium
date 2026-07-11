package allarraysquestions;

import java.util.Arrays;

public class moveZerostoRight {

	public static void main(String[] args) {

		// example array with zeros mixed in
		int[] arr = { 0, 1, 0, 3, 12, 0, 5, 0, 7 };

		System.out.println("Original array: " + Arrays.toString(arr));

		// insertPos = next empty spot to place a non-zero number
		int nonzeroindex = 0;

		// first pass: pack all non-zero numbers to the front, keeping their order
		for (int i = 0; i < arr.length; i++) {
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

		System.out.println("Array after moving zeros to end: " + Arrays.toString(arr));

		int[] arr2 = { 0, 1, 0, 3, 12, 0, 5, 0, 7 };

		System.out.println("Original array: " + Arrays.toString(arr2));

		int navigate = 0;

		// single pass: swap non-zero numbers into the front, zeros drift back naturally

		for (int fast = 0; fast < arr.length; fast++) {
			if (arr2[fast] != 0) {
				int temp = arr2[navigate];
				arr2[navigate] = arr2[fast];
				arr2[fast] = temp;
				navigate++;
			}
		}

		System.out.println("Array after moving zeros to end (swap method): " + Arrays.toString(arr2));
	}

}
