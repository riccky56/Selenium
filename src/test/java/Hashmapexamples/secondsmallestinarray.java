package Hashmapexamples;

import java.util.Arrays;

// Class declaration that groups the related example logic in one place.
public class secondsmallestinarray {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// TODO Auto-generated method 
		int[] a = {4,6,6,4,5,5,5,6,3,2, 4,5, 56,43,2,2,2,3,4,2,1,3,43,23,4,4};
		// Initialize a variable that will be used in the logic.
		int smallest= Integer.MAX_VALUE;
		// Initialize a variable that will be used in the logic.
		int secondsmallest = Integer.MAX_VALUE;

		// Loop through the data using an index or counter.
		for(int i = 0; i<a.length; i++) {

			// Check the condition before deciding whether this block should run.
			if(a[i] < smallest) {
				
                secondsmallest=smallest;
				smallest =  a[i];
			}
			// Check another condition if the previous condition was false.
			else if(a[i] < secondsmallest && a[i] !=smallest) {

				secondsmallest = a[i];
			}
		}
		// Display information to the console for the user.
		System.out.println(smallest);
		// Display information to the console for the user.
		System.out.println(secondsmallest);
	}}
