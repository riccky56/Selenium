package allarraysquestions;

import java.util.Arrays;

public class moveZerostoRight {

	public static void main(String[] args) {

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
//***************************************************************************************************

		// using two pointer approach to swap non-zero numbers to the front and zeros to
		// the back in a single pass
		int[] arr2 = { 0, 1, 4, 8, 4, 0, 0, 0, 5, 0, 2, 7, 8, 12, 0, 12, 16 };

		System.out.println("Original array: " + Arrays.toString(arr2));

		int k = 0;
		for (int a = 0; a < arr2.length; a++) {
			if (arr2[a] != 0) {
				int tep = arr2[a]; // store the non-zero value in a temporary variable
				arr2[a] = arr2[k]; // swap the non-zero value with the value at index k in the
				arr2[k] = tep; // place the non-zero value at index k in the
				k++;
			}
		}

		System.out.println("Array after moving zeros to end (swap method): " + Arrays.toString(arr2));

		// ***************************************************************************************************
		int[] arr3 = { 1, 4, 8, 4, 5, 0, 0, 10, 5, 0, 1, 0, 2, 7, 8, 12, 0, 12, 16 };
		int j = 0;

		// single pass: swap non-zero numbers into the front, zeros drift back naturally

		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] != 0) {
				int temp = arr3[i];
				arr3[i] = arr3[j];
				arr3[j] = temp;
				j++;
			}
		}

		System.out.println("Array after moving zeros to end (swap method): " + Arrays.toString(arr3));
	}
}