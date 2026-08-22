package arrays;

// Class declaration that groups the related example logic in one place.
public class primetill200 {

	// Main method where program execution starts.
	public static void main(String[] args) {

		// Display information to the console for the user.
		System.out.println("Prime numbers till 200 are : ");

		// Loop through the data using an index or counter.
		for(int number=2; number<=200; number++) {
			// Store a true or false state needed for conditional logic.
			boolean isPrime=true;


			// Loop through the data using an index or counter.
			for(int i=2; i<=Math.sqrt(number); i++) {        

				// Check the condition before deciding whether this block should run.
				if(number%i==0) {
					isPrime=false;
					break;
				} 		  

			}
			// Check the condition before deciding whether this block should run.
			if(isPrime) {
				// Display information to the console for the user.
				System.out.println(number + " ");
			}

		}
	}

}
