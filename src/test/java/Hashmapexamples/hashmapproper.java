package Hashmapexamples;

import java.util.HashMap;
import java.util.Map;

// Class declaration that groups the related example logic in one place.
public class hashmapproper {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "rahul shetty academy"; 
		// Create a HashMap to store keys with their counts or mapped values.
		HashMap<Character,Integer> B = new HashMap<>();
		// Loop through each element one by one.
		for (char c : A.toCharArray()) {
			if(c != ' ')               // to remove the space and not include the space in the count		
				// if only consonants to print then use && and if only vowels the use or condition ||
				// if ( c!= 'a' && c!= 'e'&& c!='i' && c!='o' && c!='u')
				//if ( c!= 'a' || c!= 'e' || c!='i' || c!='o' || c!='u'){

				B.put(c, B.getOrDefault(c,0) + 1 );
		}

		// Display information to the console for the user.
		System.out.println(B);

		// Loop through each element one by one.
		for( Map.Entry<Character, Integer> entry:B.entrySet()) {

			// Display information to the console for the user.
			System.out.println(entry.getKey() + " === " + entry.getValue());

		}

	}


}
