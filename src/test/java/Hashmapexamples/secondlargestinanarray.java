package Hashmapexamples;

// Class declaration that groups the related example logic in one place.
public class secondlargestinanarray {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// TODO Auto-generated method 
		int[] a = {1,1,54,1,4,2,6,5,4,5,5,23,23,45,67,4,4};
		// Initialize a variable that will be used in the logic.
		int largest= Integer.MIN_VALUE;
		// Initialize a variable that will be used in the logic.
		int secondlargest = Integer.MIN_VALUE;

		// Loop through the data using an index or counter.
		for(int i = 0; i<a.length; i++) {

			// Check the condition before deciding whether this block should run.
			if(a[i] > largest)
			{
				secondlargest=largest;
				largest =  a[i];
			}

			// Check another condition if the previous condition was false.
			else if(a[i] > secondlargest && a[i] !=largest) {

				secondlargest = a[i];
			}
		}
		// Display information to the console for the user.
		System.out.println("Largest: " +largest);
		// Display information to the console for the user.
		System.out.println("Second Largest: " +secondlargest);
	}}
