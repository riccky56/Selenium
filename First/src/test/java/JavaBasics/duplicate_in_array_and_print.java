package JavaBasics;

import java.util.*;
public class duplicate_in_array_and_print {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,4,6,1}; 

		int[] b = {3,4,4,5,6,4,7};

		Set<Integer> result = new HashSet<>();

		for(int i=0; i<=a.length-1; i++)
		{
			for(int j =0; j<=b.length-1; j++)
			{
				if(a[i]==b[j])
				{
					result.add(a[i]);
					break;

				}
			}

		}

		System.out.println(result.toString());

	}
}
