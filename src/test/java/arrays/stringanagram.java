package arrays;

// Class declaration that groups the related example logic in one place.
public class stringanagram {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "rahul";
		 // Store text data that will be processed by the program logic.
		 String b = "";
		 
		 // Store text data that will be processed by the program logic.
		 String c = "";
		// Loop through the data using an index or counter.
		for(int i = a.length()-2; i>=0; i--) {
			
			// Update the variable based on the current calculation.
			b = b+a.charAt(i);
			
		}
		 // Update the variable based on the current calculation.
		 c= a+b;
		
		// Display information to the console for the user.
		System.out.println(b);
		// Display information to the console for the user.
		System.out.println(c);
		
		// Store text data that will be processed by the program logic.
		String d="";
		// Loop through the data using an index or counter.
		for(int i=c.length()-1; i>=0; i--) {
			
			// Update the variable based on the current calculation.
			d=d+c.charAt(i);
		}
		
		// Display information to the console for the user.
		System.out.println(d);
	
		// Check the condition before deciding whether this block should run.
		if(c.equalsIgnoreCase(d)) {
			// Display information to the console for the user.
			System.out.println("is a palindrome");
		}else {
		// Display information to the console for the user.
		System.out.println("is not a palindrome");
	}
	
}
}
