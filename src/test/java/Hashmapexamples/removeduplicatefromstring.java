package Hashmapexamples;

// Class declaration that groups the related example logic in one place.
public class removeduplicatefromstring {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "cabbage";
		// Store text data that will be processed by the program logic.
		String b = "";
		// Loop through the data using an index or counter.
		for(int i=0; i<=a.length()-1; i++) {
			// Read or store the current character needed for processing.
			char ch = a.charAt(i);
		     
				// Check the condition before deciding whether this block should run.
				if(b.indexOf(ch) == -1) 
				{
					// Update the variable based on the current calculation.
					b = b + ch;
				}
			
			}
		// Display information to the console for the user.
		System.out.println(b);
			
	}

}
