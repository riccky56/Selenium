package JavaPractice;

// Class declaration that groups the related example logic in one place.
public class whitespaces {
	// Main method where program execution starts.
	public static void main(String[] args){
		// Store text data that will be processed by the program logic.
		String s = "rahul gupta is a tester";
		char[] inputArray = s.toCharArray();
		char[] result = new char[inputArray.length];
		
		// Display information to the console for the user.
		System.out.println(inputArray);

		// Mark spaces in result
		for (int i = 0; i < inputArray.length; i++) {
			// Check the condition before deciding whether this block should run.
			if (inputArray[i] == ' ') {
				result[i] = ' ';
			}
		}
		// Traverse input string from beginning and put characters in result from end
		int j = result.length - 1;

		// Loop through the data using an index or counter.
		for (int i = 0; i < inputArray.length; i++) {
			// Ignore spaces in input string
			if (inputArray[i] != ' ') {
				// ignore spaces in result.
				if (result[j] == ' ') {
					j--;
				}
				result[j] = inputArray[i];
				j--;
			}
		}
		// Display information to the console for the user.
		System.out.println(String.valueOf(result));
	}
}
