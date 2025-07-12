package Hashmapexamples;
import java.util.HashMap;
import java.util.Set;
import java.util.*;
public class Duplicate_Chars_In_String_Example {

	public static void main(String[] args) {

		String a = " i am a tester working at cognizant";
		HashMap<Character, Integer> B = new HashMap<>();

		for (char c : a.toCharArray() ) {
			if (B.containsKey(c))
			{
				B.put(c, B.get(c) + 1);
			}
			else 
			{
				B.put(c, 1);
			}
		}
		System.out.println(B);
		

		for (char c :B.keySet() ) {
			if (B.get(c) > 1) {

				System.out.println( c + " got repeated times ->"  + B.get(c));
			}
		}
		// using iterator
		for( Map.Entry<Character, Integer> entry:B.entrySet()) {
           if(entry.getValue()>1)
			System.out.println(entry.getKey() + " === " + entry.getValue());

		}
		System.out.println(B.keySet());
	}

}
