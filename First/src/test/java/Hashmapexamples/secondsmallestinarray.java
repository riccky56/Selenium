package Hashmapexamples;

import java.util.Arrays;

public class secondsmallestinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int[] a = {4,6,6,4,5,5,5,6,3,2, 4,5, 56,43,2,2,2,3,4,2,1,3,43,23,4,4};
		int smallest= Integer.MAX_VALUE;
		int secondsmallest = Integer.MAX_VALUE;

		for(int i = 0; i<a.length; i++) {

			if(a[i] < smallest) {
				
                secondsmallest=smallest;
				smallest =  a[i];
			}
			else if(a[i] < secondsmallest && a[i] !=smallest) {

				secondsmallest = a[i];
			}
		}
		System.out.println(smallest);
		System.out.println(secondsmallest);
	}}
