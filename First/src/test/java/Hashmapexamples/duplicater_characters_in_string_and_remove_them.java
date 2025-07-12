package Hashmapexamples;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class duplicater_characters_in_string_and_remove_them {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "cabbage";

		LinkedHashSet<Character> set = new LinkedHashSet<>();

		for (char c : a.toCharArray()) {
			set.add(c);
		}
		System.out.print(set);

		System.out.println("");
		String b = "";
		for (char c : set)
		{		
			b= b+c;

		}
   
		System.out.print(b);
	}
}