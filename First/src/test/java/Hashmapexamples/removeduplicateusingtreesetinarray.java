package Hashmapexamples;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class removeduplicateusingtreesetinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {3,4,2,1,4,2,3,4,4,2,5,5,6,7,7,5,8,9,0,12,45,11,34};

		//Arrays.sort(a);
		//System.out.println(Arrays.toString(a));

		Set <Integer> set= new TreeSet<>();
		for(int s : a) {
			set.add(s);
		}

		System.out.println(set);


		//convert set to array
		int[] result = new int[set.size()];

		int i = 0;
		for(int b : set) {

			result[i] = b;       //way to add 
			i++;
		}

		System.out.println("Array sorted without duplicates: " + Arrays.toString(result));
		
	}}

