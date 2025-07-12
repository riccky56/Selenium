package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class remove_duplicate_from_array {

	public static void main(String[] args) {

		int[] array = {5, 2, 9, 2, 6, 4, 1, 6, 2, 5};

		//remove duplicate and sort
		
		Set<Integer> set = new HashSet<>();
		for(int num : array) {
			set.add(num);
		}

		System.out.println(set); //prints as a set

		int[] result = new int[set.size()];   //convert set to array

		int i = 0;
		for(int b : set) {

			result[i]=b;       //way to add 
			i++;

		}
           
		System.out.println("Array sorted without duplicates: " + Arrays.toString(result));

	}
}