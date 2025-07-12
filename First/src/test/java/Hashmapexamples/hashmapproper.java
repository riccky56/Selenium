package Hashmapexamples;

import java.util.HashMap;
import java.util.Map;

public class hashmapproper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "rahul shetty academy"; 
		HashMap<Character,Integer> B = new HashMap<>();
		for (char c : A.toCharArray()) {
			if(c != ' ')               // to remove the space and not include the space in the count		
				// if only consonants to print then use && and if only vowels the use or condition ||
				// if ( c!= 'a' && c!= 'e'&& c!='i' && c!='o' && c!='u')
				//if ( c!= 'a' || c!= 'e' || c!='i' || c!='o' || c!='u'){

				B.put(c, B.getOrDefault(c,0) + 1 );
		}

		System.out.println(B);

		for( Map.Entry<Character, Integer> entry:B.entrySet()) {

			System.out.println(entry.getKey() + " === " + entry.getValue());

		}

	}


}