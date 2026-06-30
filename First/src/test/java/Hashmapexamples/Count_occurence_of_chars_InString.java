package Hashmapexamples;

import java.util.HashMap;
import java.util.Map;

public class Count_occurence_of_chars_InString {

	public static void main(String [] args) {

		// Creating a hashmap object

		String a = "Welcome to the coding class";
		
		HashMap<Character, Integer> hash_map = new HashMap<>();
		
		for (char c : a.toCharArray())
		{
			if (hash_map.containsKey(c))
			{
				hash_map.put(c, hash_map.get(c) + 1);
			}

			else
			{
				hash_map.put(c, 1);
			}
		}
		System.out.println(hash_map); // Print the hashmap object which gives the number of each character in String.
		
       for(Map.Entry<Character,Integer> entry : hash_map.entrySet())
       {
    	   if(entry.getValue()>1) {
    		   
    		   System.out.println(entry.getKey()  + " : " + entry.getValue() );
    	   }
       }
		
		
	}



}