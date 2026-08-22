package JavaPractice;
import java.util.*;

// Class declaration that groups the related example logic in one place.
public class  numberofwordsinastring {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// Display information to the console for the user.
		System.out.println("Enter the String");
		
		// Create a Scanner object to read input from the user.
		Scanner sc = new Scanner(System.in);
		// Store text data that will be processed by the program logic.
		String s = sc.nextLine();
		
		// Initialize a variable that will be used in the logic.
		int count = 1;
		// Loop through the data using an index or counter.
		for (int i = 0; i < s.length() - 1; i++) {
			
			// Check the condition before deciding whether this block should run.
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
			}
		}
		// Display information to the console for the user.
		System.out.println("Number of words in a string: " +count); }
}
