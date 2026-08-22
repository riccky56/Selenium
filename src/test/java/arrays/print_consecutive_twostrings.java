package arrays;

// Class declaration that groups the related example logic in one place.
public class print_consecutive_twostrings {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// Store text data that will be processed by the program logic.
		String a = "RahulGupta";
		// Store text data that will be processed by the program logic.
		String b= "1234556@&^%&";

		// Initialize a variable that will be used in the logic.
		int len = Math.min(a.length(), b.length());

		// Loop through the data using an index or counter.
		for(int i=0; i<len;i++) 
		{
			// Display information to the console for the user.
			System.out.print(a.charAt(i));
			// Display information to the console for the user.
			System.out.print(b.charAt(i));

		}

		// Check the condition before deciding whether this block should run.
		if(a.length()>len)
		{
			// Display information to the console for the user.
			System.out.println(a.substring(len));
		}
		// Check another condition if the previous condition was false.
		else if(b.length()>len)
		{
			// Display information to the console for the user.
			System.out.println(b.substring(len));
		}
	}

}
