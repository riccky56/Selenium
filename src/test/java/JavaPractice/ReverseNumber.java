package JavaPractice;

import java.util.Scanner;

// Class declaration that groups the related example logic in one place.
public class ReverseNumber {
	// Main method where program execution starts.
	public static void main(String[] args) {
		int no, rev=0,r, a;
		// Create a Scanner object to read input from the user.
		Scanner scanner = new Scanner(System.in);
		// Display information to the console for the user.
		System.out.println("Enter any number : ");
		no = scanner.nextInt();
		a = no;
		// Continue looping while the given condition remains true.
		while(no>0)
		{
			r = no%10;
			// Update the variable based on the current calculation.
			rev = rev*10+r;
			// Update the variable based on the current calculation.
			no=no/10;
		}
		// Display information to the console for the user.
		System.out.println("Reverse : " +rev);
	}
}

