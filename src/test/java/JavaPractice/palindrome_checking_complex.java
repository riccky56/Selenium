package JavaPractice;

import java.util.Scanner;

import net.bytebuddy.implementation.EqualsMethod;

// Class declaration that groups the related example logic in one place.
public class palindrome_checking_complex {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Scanner sc = new Scanner(System.in); // if you want to enter a string and check for it
		System.out.println("Enter the string : ");
		// Store text data that will be processed by the program logic.
		String a = sc.nextLine(); */
		
		
		// Store text data that will be processed by the program logic.
		String a = "A man, a plan, a canal: Panama";
	
		// Store text data that will be processed by the program logic.
		String b = "";
		// Store text data that will be processed by the program logic.
		String c = "";


		// Loop through the data using an index or counter.
		for (int i = a.length()-1; i>= 0; i--) {
			// Check the condition before deciding whether this block should run.
			if (a.charAt(i) != ' ' && a.charAt(i) != ',' && a.charAt(i) != ':' ) {

				// Update the variable based on the current calculation.
				b = b + a.charAt(i);

			}  
		}	
		
		System.out.println(b); // just for checking

		// Loop through the data using an index or counter.
		for (int i = 0; i<= a.length()-1; i++){
			// Check the condition before deciding whether this block should run.
			if (a.charAt(i) != ' ' && a.charAt(i) != ',' && a.charAt(i) != ':' ) {

				// Update the variable based on the current calculation.
				c = c + a.charAt(i);
			}
		}
		
		System.out.println(c); //just for reference
		

		// Check the condition before deciding whether this block should run.
		if(c.equalsIgnoreCase(b)) {
			// Display information to the console for the user.
			System.out.println("String "  +a+ " is a palindrome");
		}
		// Execute this block when the earlier conditions do not match.
		else {
			// Display information to the console for the user.
			System.out.println("String "  +a+ " is not a palindrome");
		} 
	}
}
