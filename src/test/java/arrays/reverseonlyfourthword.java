package arrays;
import java.util.Arrays;

// Class declaration that groups the related example logic in one place.
public class reverseonlyfourthword {
	// Main method where program execution starts.
	public static void main(String[] args) {
		
		// Store text data that will be processed by the program logic.
		String a = "Java is a capgemini language";
		String[] word = a.split(" ");

		// Loop through the data using an index or counter.
		for(int i =0; i<word.length; i++) {
			// Check the condition before deciding whether this block should run.
			if(i==3 ) 
			{
				// Store text data that will be processed by the program logic.
				String rev="";
				// Loop through the data using an index or counter.
				for(int j = word[i].length()-1; j>=0; j--)
				{
					// Update the variable based on the current calculation.
					rev= rev+word[i].charAt(j);

				}
				word[i]= rev;

			}
			// Display information to the console for the user.
			System.out.print(word[i]+ " ");

		}
		// Display information to the console for the user.
		System.out.println(" ");
		//to convert into string        
		String c = Arrays.toString(word);

		// Display information to the console for the user.
		System.out.println(c);
		// Display information to the console for the user.
		System.out.println(" ");

		// to get in string format without commas
		for(String e:word) 
		{

			// Display information to the console for the user.
			System.out.print(e + " ");

		}

	}

}
