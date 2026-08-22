package JavaPractice;

// Class declaration that groups the related example logic in one place.
public class prime_number {

	// Helper method used to perform a specific part of the program logic.
	public static boolean isPrime(int num) {
		// Validate that the number is neither less than 1 nor equal to 1.
		// It should return false as it cannot be a prime number
		if (num <= 1)
			// Return the final result back to the caller.
			return false;

		// Logic to check if a number is prime or not. If its Prime, returns true else
		// return false
		for (int i = 2; i < num; i++) {
			// Check the condition before deciding whether this block should run.
			if (num % i == 0) {
				// Return the final result back to the caller.
				return false;
			}
		}

		// Return the final result back to the caller.
		return true;

	}

	// Main method where program execution starts.
	public static void main(String[] args) {

		// Pass the integer value to check whether it is prime or not.
		System.out.println(isPrime(11));

	}

}

