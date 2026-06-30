package Hashmapexamples;

import java.util.*;

public class occurence_of_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A = "rahul shetty academy";
		HashMap<Character,Integer> B = new HashMap<>();
		for (char c : A.toCharArray()) {
			if(c != ' ')               // to remove the space and not include the space in the count		
				// if only consonants to print then use && and if only vowels the use or condition ||
				// if ( c!= 'a' && c!= 'e'&& c!='i' && c!='o' && c!='u')
				//if ( c!= 'a' || c!= 'e' || c!='i' || c!='o' || c!='u'){

				B.put(c, B.getOrDefault(c,0) +1 );
		}
	
		System.out.println(B);

		//approach2
		String d = "rahul shetty academy";
		Map<Character,Integer> hash_map = new HashMap<>();

		for (char c : d.toCharArray()) {
			if (hash_map.containsKey(c)) 			// && c!=' ' to remove space give this condition also
			{
				hash_map.put(c, hash_map.get(c) + 1);
			}

			else //if( c !=' ')to remove space from here also
			{
				hash_map.put(c, 1);
			}

		}
		System.out.println(hash_map);
	}}
