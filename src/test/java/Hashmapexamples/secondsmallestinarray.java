package Hashmapexamples;

import java.util.Arrays;

// Class declaration that groups the related example logic in one place.
public class secondsmallestinarray {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// Input array from which the smallest and second smallest values will be found.
		int[] a = {4,6,6,4,5,5,5,6,3,2, 4,5, 56,43,2,2,2,3,4,2,1,3,43,23,4,4};

		// Start with the largest possible integer so any array value can replace it.
		int smallest= Integer.MAX_VALUE;

		// This stores the second smallest distinct value found so far.
		int secondsmallest = Integer.MAX_VALUE;

		// Traverse the array once and update smallest values as needed.
		for(int i = 0; i<a.length; i++) {

			// If the current element is smaller than the smallest value seen so far,
			// move the old smallest to secondsmallest and update smallest.
			if(a[i] < smallest) {
				
                secondsmallest=smallest;
				smallest =  a[i];
			}

			// If the element is greater than smallest but smaller than secondsmallest,
			// then it becomes the new second smallest distinct value.
			else if(a[i] < secondsmallest && a[i] !=smallest) {

				secondsmallest = a[i];
			}
		}

		// Print the minimum value in the array.
		System.out.println(smallest);

		// Print the second minimum distinct value in the array.
		System.out.println(secondsmallest);
	}}
