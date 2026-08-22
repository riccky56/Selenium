package Hashmapexamples;

import java.util.*;

// Class declaration that groups the related example logic in one place.
public class occurence_of_characters {

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

				B.put(c, B.getOrDefault(c,0) +1 );
		}
	
		// Display information to the console for the user.
		System.out.println(B);

		//approach2
		String d = "rahul shetty academy";
		// Create a HashMap to store keys with their counts or mapped values.
		Map<Character,Integer> hash_map = new HashMap<>();

		// Loop through each element one by one.
		for (char c : d.toCharArray()) {
			if (hash_map.containsKey(c)) 			// && c!=' ' to remove space give this condition also
			{
				// Store or update the current value in the map.
				hash_map.put(c, hash_map.get(c) + 1);
			}

			else //if( c !=' ')to remove space from here also
			{
				// Store or update the current value in the map.
				hash_map.put(c, 1);
			}

		}
		// Display information to the console for the user.
		System.out.println(hash_map);
	}}
