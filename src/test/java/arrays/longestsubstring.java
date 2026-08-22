package arrays;
// Class declaration that groups the related example logic in one place.
public class longestsubstring {

	// Main method where program execution starts.
	public static void main(String[] args) {
		
		// Store text data that will be processed by the program logic.
		String s = "abcabcbbd";
		
		// Store text data that will be processed by the program logic.
		String longest="";	String current = "";
		
		// Loop through each element one by one.
		for(char c : s.toCharArray()) {
			// Store text data that will be processed by the program logic.
			String ch = String.valueOf(c);
				
			// Check the condition before deciding whether this block should run.
			if(current.contains(ch))
			{
				current = current.substring(current.indexOf(ch) + 1);
				
			}
			// Update the variable based on the current calculation.
			current = current+ch;
			
			// Check the condition before deciding whether this block should run.
			if(current.length()>longest.length()) 
			{
				
				longest = current;
			}
			
		}
		// Display information to the console for the user.
		System.out.println(longest);
	}

}
