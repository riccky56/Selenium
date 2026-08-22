package arrays;

// Class declaration that groups the related example logic in one place.
public class check_string_for_alphabets {

	// Main method where program execution starts.
	public static void main(String[] args) {
		
		// Store text data that will be processed by the program logic.
		String a = "10";
		// Store text data that will be processed by the program logic.
		String b = "20";
		
		// Store text data that will be processed by the program logic.
		String  result = "";
	
		// Check the condition before deciding whether this block should run.
		if(a.matches("[0-9]+") && b.matches("[0-9]+"))
		{
			// Initialize a variable that will be used in the logic.
			int sum = Integer.parseInt(a) + Integer.parseInt(b);
			
			result = String.valueOf(sum);
			
		} else {
			
			// Update the variable based on the current calculation.
			result = a+" "+ b;
		}
	
		
		// Display information to the console for the user.
		System.out.println(result);	

	}

}
    
