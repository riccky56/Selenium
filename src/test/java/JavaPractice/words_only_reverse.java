package JavaPractice;

// Class declaration that groups the related example logic in one place.
public class words_only_reverse {
	
	// Main method where program execution starts.
	public static void main(String[] args) {
		
		// Store text data that will be processed by the program logic.
		String s = "rahul gupta is a tester";
		String[] word =  s.split(" ");
	
		// Loop through the data using an index or counter.
		for (int i = word.length-1;i>=0; i--) {
			
			// Display information to the console for the user.
			System.out.print(word[i]+ " ");
		}
		
		
	}

}
