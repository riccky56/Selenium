package arrays;

import java.util.Arrays;

// Class declaration that groups the related example logic in one place.
public class string_to_getfirstchar_and_firstchar_of_last {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Name is RAhul guPta";
		// Store text data that will be processed by the program logic.
		String b = a.toUpperCase();
		
		String[] c = b.split(" ");
		
		// Display information to the console for the user.
		System.out.println(Arrays.toString(c));
		
		
		 // Read or store the current character needed for processing.
		 char d = c[0].charAt(0) ;
		 
		 // Read or store the current character needed for processing.
		 char e = c[c.length-1].charAt(0);
		 
		 // Display information to the console for the user.
		 System.out.println( d + " " + e);
		

}}
