package Hashmapexamples;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

// Class declaration that groups the related example logic in one place.
public class removeduplicateusingtreesetinarray {

	// Main method where program execution starts.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {3,4,2,1,4,2,3,4,4,2,5,5,6,7,7,5,8,9,0,12,45,11,34};

		//Arrays.sort(a);
		//System.out.println(Arrays.toString(a));

		Set <Integer> set= new TreeSet<>();
		// Loop through each element one by one.
		for(int s : a) {
			// Add the current value into the collection.
			set.add(s);
		}

		// Display information to the console for the user.
		System.out.println(set);


		//convert set to array
		int[] result = new int[set.size()];

		// Initialize a variable that will be used in the logic.
		int i = 0;
		// Loop through each element one by one.
		for(int b : set) {

			result[i] = b;       //way to add 
			i++;
		}

		// Display information to the console for the user.
		System.out.println("Array sorted without duplicates: " + Arrays.toString(result));
		
	}}

