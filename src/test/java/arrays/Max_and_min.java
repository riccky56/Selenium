package arrays;

// Class declaration that groups the related example logic in one place.
public class Max_and_min {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {21,25,65,34,69,23,45};

		// Initialize a variable that will be used in the logic.
		int small = a[0];
		// Initialize a variable that will be used in the logic.
		int large = a[0];

		// Loop through the data using an index or counter.
		for (int i =0; i<a.length; i++)
		{

			// Check the condition before deciding whether this block should run.
			if(a[i]<small) {
				small=a[i];
			}
			// Check the condition before deciding whether this block should run.
			if(a[i]>large) {
				large=a[i];
			}
			
			
		
		// Initialize a variable that will be used in the logic.
		int difference =  large - small;
		// Display information to the console for the user.
		System.out.println("minimum : " + small);
		// Display information to the console for the user.
		System.out.println("maximum : " + large);

		// Display information to the console for the user.
		System.out.println("Difference : " + difference);
	}


}}
