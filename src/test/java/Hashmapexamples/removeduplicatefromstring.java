package Hashmapexamples;

// Class declaration that groups the related example logic in one place.
public class removeduplicatefromstring {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// Input string that may contain repeated characters.
		
		String a = "cabbage";

		// This string will store characters only once, in their original order.
		String b = "";

		// Loop through each character of the input string.
		for(int i=0; i<=a.length()-1; i++) {
			// Get one character at the current index.
			char ch = a.charAt(i);
		     
				// indexOf(ch) returns -1 when the character is not yet present in b.
				// Only new characters are added, so duplicates are skipped.
				if(b.indexOf(ch) == -1) 
				{
					// Update the variable based on the current calculation.
					b = b + ch;
				}
			
			}

		// Print the string after duplicate characters are removed.
		System.out.println(b);
			
	}

}
