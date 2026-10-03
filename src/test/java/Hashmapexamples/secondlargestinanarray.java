package Hashmapexamples;

// Class declaration that groups the related example logic in one place.
public class secondlargestinanarray {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// Input array from which the largest and second largest values will be found.
		int[] a = {1,1,54,1,4,2,6,5,4,5,5,23,23,45,67,4,4};

		// Start with the smallest possible integer so any array value can replace it.
		int largest= Integer.MIN_VALUE;

		// This stores the second biggest distinct value found so far.
		int secondlargest = Integer.MIN_VALUE;

		// Traverse the array only once to find both values.
		for(int i = 0; i<a.length; i++) {

			// If current element is greater than the current largest,
			// move old largest to secondlargest and update largest.
			if(a[i] > largest)
			{
				secondlargest=largest;
				largest =  a[i];
			}

			// If current element is smaller than largest but bigger than secondlargest,
			// then it becomes the new second largest distinct value.
			else if(a[i] > secondlargest && a[i] !=largest) {

				secondlargest = a[i];
			}
		}

		// Print the biggest value in the array.
		System.out.println("Largest: " +largest);

		// Print the second biggest distinct value in the array.
		System.out.println("Second Largest: " +secondlargest);
	}}
