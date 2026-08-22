package JavaPractice;

// Class declaration that groups the related example logic in one place.
public class reverse_word_of_strings {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "java is a programming language";
		// Store text data that will be processed by the program logic.
		String b = "";
		String[] words = a.split(" ");
		
		// Loop through each element one by one.
		for(String word: words) {
			
			// Store text data that will be processed by the program logic.
			String rev="";
			
			// Loop through the data using an index or counter.
			for(int i = word.length()-1; i>=0; i--) {
				
				// Update the variable based on the current calculation.
				rev= rev + word.charAt(i);
			}
			//System.out.print(rev+ " ");
			
			b= b + rev + " ";
		}
		// Display information to the console for the user.
		System.out.println(b);
		
	}}
		
		
