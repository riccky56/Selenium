package JavaPractice;

// Class declaration that groups the related example logic in one place.
public class a2b3c4d5e6 {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "a2b3c4d5e6";
		boolean z = a.matches(".*[a-zA-Z]+.*");//to check any one alphabet is there
		// Display information to the console for the user.
		System.out.println(z);
		
		// Use StringBuilder to build the final string efficiently.
		StringBuilder b = new StringBuilder();
   
		// Loop through the data using an index or counter.
		for (int i = 0; i<a.length(); i+=2) {
			char ch = a.charAt(i);           //get the character count as a 
			int count = a.charAt(i+1) - '0'; //convert char digit to int (like '2' -> 2

			// Loop through the data using an index or counter.
			for (int j = 0;  j < count; j++) {
				b.append(ch);                  //append character 'count' times
			}

		}


		// Display information to the console for the user.
		System.out.println(b);
	}

}
