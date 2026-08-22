package JavaPractice;


// Class declaration that groups the related example logic in one place.
public class Swap_Numbers_Example {

	// Main method where program execution starts.
	public static void main(String[] args) {

		// Initialize a variable that will be used in the logic.
		int a = 10;
		// Initialize a variable that will be used in the logic.
		int b = 20;

		// Logic to swap 2 numbers.

		a = a+b;
		// Update the variable based on the current calculation.
		b = a-b;
		// Update the variable based on the current calculation.
		a = a-b;

		// Display information to the console for the user.
		System.out.println("num1 = " + a);
		// Display information to the console for the user.
		System.out.println("num2 = " + b);
	}

}
