package JavaPractice;

import java.util.Scanner;

// Class declaration that groups the related example logic in one place.
public class vowelsonlyreverse {
	// Main method where program execution starts.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // if you want to enter a string and check for it
		// Display information to the console for the user.
		System.out.println("Enter the string : ");
		// Store text data that will be processed by the program logic.
		String a = sc.nextLine(); 

		// Use StringBuilder to build the final string efficiently.
		StringBuilder sb = new StringBuilder(a);

		// Loop through the data using an index or counter.
		for(int i = 0; i<a.length(); i++) {
			// Check the condition before deciding whether this block should run.
			if (a.charAt(i) ==  'a'|| a.charAt(i)=='e' ||  a.charAt(i) =='i' ||  a.charAt(i) == 'o' ||  a.charAt(i)== 'u') {

				// Append the current value to the growing result.
				sb.append(a.charAt(i));
			}
		}
		
		// Display information to the console for the user.
		System.out.println(sb);
		
		// Initialize a variable that will be used in the logic.
		int j = sb.length()-1;
		//System.out.println(j); // total number of characters

		for ( int i=0;i < a.length(); i++) {

			// Check the condition before deciding whether this block should run.
			if(a.charAt(i) == 'a' || a.charAt(i)=='e' || a.charAt(i)=='i' ||a.charAt(i)== 'o' || a.charAt(i)== 'u') {
                
				sb.setCharAt(i, sb.charAt(j));
				sb.deleteCharAt(j);
				j--;

			}
		}
		// Display information to the console for the user.
		System.out.println("string : " + sb );
	}

}
