package JavaPractice;

import java.util.Scanner;

// Class declaration that groups the related example logic in one place.
public class fibonnacci {

	static void fibonaccii(int N) {


		// Initialize a variable that will be used in the logic.
		int n1=0 , n2=1;
		
		// Loop through the data using an index or counter.
		for (int i=0; i<N; i++) {
			
			// Display information to the console for the user.
			System.out.println(n1 + " ");
			
			// Initialize a variable that will be used in the logic.
			int n3 = n2+n1;
			n1=n2;
			n2=n3;

		}

	}

	// Main method where program execution starts.
	public static void main(String[] args) {

		// Create a Scanner object to read input from the user.
		Scanner sc = new Scanner(System.in);
		// Initialize a variable that will be used in the logic.
		int N = sc.nextInt();

		fibonaccii(N);
	}

}
