package JavaPractice;

// Class declaration that groups the related example logic in one place.
public class vowels_consonants_count {

	// Main method where program execution starts.
	public static void main(String[] args) {

		// Store text data that will be processed by the program logic.
		String str = "Hello World";
		VowelConsonantCount(str);
	}
	static void VowelConsonantCount(String str) {
		// Initialize a variable that will be used in the logic.
		int vowels = 0, consonants = 0;
		str = str.toLowerCase();
		// Loop through each element one by one.
		for (char c : str.toCharArray()) {
			// Check the condition before deciding whether this block should run.
			if (c >= 'a' && c <= 'z') {
				// Check the condition before deciding whether this block should run.
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				{
					vowels++;
					
				} else {
					
					consonants++;
				}
			}
		}

		// Display information to the console for the user.
		System.out.println("Vowels : " + vowels);
		// Display information to the console for the user.
		System.out.println("Consonants : " + consonants);
	}
}
