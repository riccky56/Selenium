package interview;

	// Class declaration that groups the related example logic in one place.
	public class CountA {
	    // Main method where program execution starts.
	    public static void main(String[] args) {
	        // Store text data that will be processed by the program logic.
	        String str = "Automation";
	        // Initialize a variable that will be used in the logic.
	        int count = 0;

	        // Loop through each element one by one.
	        for (char ch : str.toLowerCase().toCharArray()) {
	            // Check the condition before deciding whether this block should run.
	            if (ch == 'a')
	            	count++;
	        }

	        // Display information to the console for the user.
	        System.out.println("'A' appears: " + count + " times.");
	   


	}

}
