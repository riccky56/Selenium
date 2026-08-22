package JavaBasics;

import java.util.*;
// Class declaration that groups the related example logic in one place.
public class duplicate_in_array_and_print {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// Declare and initialize an integer array used in this example.
		int[] a= {1,2,3,4,5,4,6,1}; 

		// Declare and initialize an integer array used in this example.
		int[] b = {3,4,4,5,6,4,7};

		// Create a HashSet to store only unique values.
		Set<Integer> result = new HashSet<>();

		// Loop through the data using an index or counter.
		for(int i=0; i<=a.length-1; i++)
		{
			// Loop through the data using an index or counter.
			for(int j =0; j<=b.length-1; j++)
			{
				// Check the condition before deciding whether this block should run.
				if(a[i]==b[j])
				{
					// Add the current value into the collection.
					result.add(a[i]);
					break;

				}
			}

		}

		// Display information to the console for the user.
		System.out.println(result.toString());

	}
}
