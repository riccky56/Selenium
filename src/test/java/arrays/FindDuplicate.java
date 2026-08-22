
package arrays;

// Class declaration that groups the related example logic in one place.
public class FindDuplicate {
	// Main method where program execution starts.
	public static void main(String[] args) {
		// Declare and initialize an integer array used in this example.
		int[] a = {1, 3, 4, 5, 2, 3, 4, 6, 7, 4, 5, 5, 6, 7, 4, 2, 4, 6, 3, 2, 4, 5};
       
    
		// Loop through the data using an index or counter.
		for (int i = 0; i < a.length; i++) {
			
			// Store a true or false state needed for conditional logic.
			boolean isDuplicate = false;
			
			// Loop through the data using an index or counter.
			for (int j = i + 1; j < a.length; j++) {
				
				// Check the condition before deciding whether this block should run.
				if (a[i] == a[j]) {
					
					// Check if this duplicate has already been printed
					for (int k = 0; k < i; k++) {
						// Check the condition before deciding whether this block should run.
						if (a[k] == a[i]) {
							isDuplicate = true;
							break;
						}
					}
					// Check the condition before deciding whether this block should run.
					if (!isDuplicate) 
					{
						// Display information to the console for the user.
						System.out.print(a[i] + " ");
					}
					break;
				}
			}}}}
